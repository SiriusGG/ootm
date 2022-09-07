package com.siriusgg.oot.view;

import com.siriusgg.oot.controller.BeanSpotCheckListController;
import com.siriusgg.oot.model.OoTMConstants;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class BeanSpotCheckListDialog extends JDialog {
    private final BeanSpotCheckListController bsclc;
    private final JCheckBox[] beanChecks;
    private final JCheckBox[] skulltulaChecks;

    public BeanSpotCheckListDialog(final BeanSpotCheckListController bsclc, final JFrame owner) {
        super(owner, "Beans", true);
        this.bsclc = bsclc;
        setLayout(null);
        Container cp = getContentPane();
        int borderSpacer = 5;
        int verticalElementSpacer = 5;
        int horizontalElementSpacer = 5;
        int labelWidth = 160;
        int checkBoxWidth = 20;
        int elementHeight = 20;
        int graphicLabelWidth = 30;
        int graphicLabelHeight = 30;
        int rightLAFSpacer = 16;
        int titleBarLAFSpacer = 38;
        JLabel beanGraphicLabel = new JLabel(bsclc.getBeanGraphic());
        beanGraphicLabel.setBounds(borderSpacer + labelWidth + horizontalElementSpacer, borderSpacer,
                graphicLabelWidth, graphicLabelHeight);
        cp.add(beanGraphicLabel);
        JLabel skulltulaGraphicLabel = new JLabel(bsclc.getSkulltulaTokenGraphic());
        skulltulaGraphicLabel.setBounds(borderSpacer + labelWidth + (2 * horizontalElementSpacer) + graphicLabelWidth,
                borderSpacer, graphicLabelWidth, graphicLabelHeight);
        cp.add(skulltulaGraphicLabel);
        JLabel[] beanSpotLabels = new JLabel[OoTMConstants.BEAN_SPOTS_AMOUNT];
        for (int i = 0; i < beanSpotLabels.length; i++) {
            beanSpotLabels[i] = new JLabel(OoTMConstants.BEAN_SPOTS[i]);
            beanSpotLabels[i].setBounds(borderSpacer, borderSpacer + ((i + 1) * verticalElementSpacer) +
                    graphicLabelHeight + (i * elementHeight), labelWidth, elementHeight);
            cp.add(beanSpotLabels[i]);
        }
        beanChecks = new JCheckBox[OoTMConstants.BEAN_SPOTS_AMOUNT];
        for (int i = 0; i < beanChecks.length; i++) {
            beanChecks[i] = new JCheckBox();
            bsclc.loadInitialBeanState(beanChecks[i], i);
            beanChecks[i].setBounds(borderSpacer + labelWidth + horizontalElementSpacer +
                    ((graphicLabelWidth - checkBoxWidth) / 2), borderSpacer + graphicLabelHeight +
                    ((i + 1) * verticalElementSpacer) + (i * elementHeight), checkBoxWidth, elementHeight);
            beanChecks[i].setActionCommand("" + i);
            beanChecks[i].addActionListener(this::checkBoxBeanActionPerformed);
            cp.add(beanChecks[i]);
        }
        skulltulaChecks = new JCheckBox[OoTMConstants.BEAN_SPOT_SKULLTULAS_AMOUNT];
        for (int i = 0; i < skulltulaChecks.length; i++) {
            skulltulaChecks[i] = new JCheckBox();
            bsclc.loadInitialSkulltulaState(skulltulaChecks[i], i);
            skulltulaChecks[i].setBounds(borderSpacer + labelWidth + (2 * horizontalElementSpacer) +
                    graphicLabelWidth + ((graphicLabelWidth - checkBoxWidth) / 2), borderSpacer + graphicLabelHeight +
                    ((i + 2) * verticalElementSpacer) + ((i + 1) * elementHeight), checkBoxWidth, elementHeight);
            skulltulaChecks[i].setActionCommand("" + i);
            skulltulaChecks[i].addActionListener(this::checkBoxSkulltulaActionPerformed);
            cp.add(skulltulaChecks[i]);
        }
        int frameWidth = (2 * borderSpacer) + labelWidth + (2 * horizontalElementSpacer) + (2 * graphicLabelWidth) +
                rightLAFSpacer;
        int frameHeight = titleBarLAFSpacer + (2 * borderSpacer) + graphicLabelHeight +
                (OoTMConstants.BEAN_SPOTS_AMOUNT * elementHeight) +
                ((OoTMConstants.BEAN_SPOTS_AMOUNT) * verticalElementSpacer);
        setSize(frameWidth, frameHeight);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (d.width - getSize().width) / 2;
        int y = (d.height - getSize().height) / 2;
        setLocation(x, y);
        setResizable(false);
        setVisible(true);
    }

    public void checkBoxBeanActionPerformed(final ActionEvent event) {
        bsclc.switchBeanState(event);
    }

    public void checkBoxSkulltulaActionPerformed(final ActionEvent event) {
        bsclc.switchSkulltulaState(event);
    }
}
