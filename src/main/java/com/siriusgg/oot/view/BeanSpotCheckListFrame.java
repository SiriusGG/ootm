package com.siriusgg.oot.view;

import com.siriusgg.oot.constants.*;
import com.siriusgg.oot.controller.*;
import com.siriusgg.oot.model.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BeanSpotCheckListFrame extends JFrame {
    private final BeanSpotCheckListController bsclc;

    public BeanSpotCheckListFrame(final BeanSpotCheckListController bsclc, final CurrentLocationController clc,
                                  final String title) {
        super(title);
        clc.setBeanSpotCheckListOpen(true);
        Translation t = GlobalSettings.getInstance().getTranslation();
        this.bsclc = bsclc;
        setLayout(null);
        Container cp = getContentPane();
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(final WindowEvent e) {
                clc.setBeanSpotCheckListOpen(false);
                dispose();
            }
        });
        int borderSpacer = ViewConstants.BORDER_SPACER;
        int verticalElementSpacer = ViewConstants.VERTICAL_ELEMENT_SPACER;
        int horizontalElementSpacer = ViewConstants.HORIZONTAL_ELEMENT_SPACER;
        int labelWidth = 180;
        int checkBoxWidth = 20;
        int elementHeight = 20;
        int graphicLabelWidth = 30;
        int graphicLabelHeight = 30;
        int rightLAFSpacer = ViewConstants.RIGHT_LAF_SPACER;
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
            beanSpotLabels[i] = new JLabel(t.getTranslatedText(OoTMConstants.BEAN_SPOTS[i]));
            beanSpotLabels[i].setBounds(borderSpacer, borderSpacer + ((i + 1) * verticalElementSpacer) +
                    graphicLabelHeight + (i * elementHeight), labelWidth, elementHeight);
            cp.add(beanSpotLabels[i]);
        }
        JCheckBox[] beanChecks = new JCheckBox[OoTMConstants.BEAN_SPOTS_AMOUNT];
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
        JCheckBox[] skulltulaChecks = new JCheckBox[OoTMConstants.BEAN_SPOT_SKULLTULAS_AMOUNT];
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
        int frameWidth = (2 * borderSpacer) +
                labelWidth +
                (2 * horizontalElementSpacer) +
                (2 * graphicLabelWidth) +
                rightLAFSpacer;
        int frameHeight = ViewConstants.TITLE_BAR_LAF_SPACER +
                (2 * borderSpacer) +
                graphicLabelHeight +
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
