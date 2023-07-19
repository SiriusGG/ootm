package com.siriusgg.oot.view;

import com.siriusgg.oot.constants.*;
import com.siriusgg.oot.controller.AddItemController;
import com.siriusgg.oot.translation.Translation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.TimerTask;

public class AddItemDialog extends JDialog {
    private final AddItemController aic;
    private final JLabel labelQuestion;
    private final JButton buttonNormal;
    private final JButton buttonSpecial;
    private final JList<String> listItems;
    private final JScrollPane listScrollPane;
    private final JButton buttonConfirmItem;
    private final JLabel labelAmount;
    private final JLabel labelCost;
    private final JSpinner amountSpinner;
    private final JSpinner costSpinner;
    private final JButton buttonConfirmFinal;

    public AddItemDialog(final AddItemController aic, final Translation t) {
        super(aic.getItemDialogOwnerWindow(), t.getTranslatedText("Add new item"), true);
        this.aic = aic;
        setLayout(null);
        Container cp = getContentPane();
        int borderSpacer = ViewConstants.BORDER_SPACER;
        int labelQuestionWidth = ViewConstants.ADD_ITEM_QUESTION_LABEL_SALE_TYPE_WIDTH;
        int labelQuestionHeight = ViewConstants.ADD_ITEM_QUESTION_LABEL_SALE_TYPE_HEIGHT;
        int verticalElementSpacer = ViewConstants.VERTICAL_ELEMENT_SPACER;
        int horizontalElementSpacer = ViewConstants.HORIZONTAL_ELEMENT_SPACER;
        int buttonWidth = ViewConstants.ADD_ITEM_BUTTON_WIDTH;
        int buttonHeight = ViewConstants.ADD_ITEM_BUTTON_HEIGHT;
        int itemListWidth = ViewConstants.ADD_ITEM_LIST_WIDTH;
        int itemListHeight = ViewConstants.ADD_ITEM_LIST_HEIGHT;
        int smallLabelWidth = ViewConstants.ADD_ITEM_SMALL_LABEL_WIDTH;
        int smallLabelHeight = ViewConstants.ADD_ITEM_SMALL_LABEL_HEIGHT;
        int selectorHeight = ViewConstants.ADD_ITEM_AMOUNT_COST_SELECTOR_HEIGHT;
        String htmlPrefix = ViewConstants.HTML_PREFIX_CENTERED;
        String br = ViewConstants.HTML_BR;
        String htmlSuffix = ViewConstants.HTML_SUFFIX;
        labelQuestion = new JLabel(htmlPrefix +
                t.getTranslatedText("Is this a \"normal\"" + br + "or a special deal?") +
                htmlSuffix);
        labelQuestion.setHorizontalTextPosition(JLabel.CENTER);
        labelQuestion.setHorizontalAlignment(JLabel.CENTER);
        labelQuestion.setBounds(borderSpacer, borderSpacer, labelQuestionWidth, labelQuestionHeight);
        cp.add(labelQuestion);
        buttonSpecial = new JButton(t.getTranslatedText("Special Deal!"));
        buttonSpecial.setBounds(borderSpacer, borderSpacer + labelQuestionHeight + verticalElementSpacer,
                buttonWidth, buttonHeight);
        buttonSpecial.addActionListener(this::buttonSpecialActionPerformed);
        cp.add(buttonSpecial);
        buttonNormal = new JButton(t.getTranslatedText("Normal"));
        buttonNormal.setBounds(borderSpacer + buttonWidth + horizontalElementSpacer, borderSpacer +
                labelQuestionHeight + verticalElementSpacer, buttonWidth, buttonHeight);
        buttonNormal.addActionListener(this::buttonNormalActionPerformed);
        cp.add(buttonNormal);
        listItems = new JList<>();
        DefaultListModel<String> listModel = new DefaultListModel<>();
        listScrollPane = new JScrollPane(listItems);
        listItems.setModel(listModel);
        listScrollPane.setBounds(borderSpacer, borderSpacer, itemListWidth, itemListHeight);
        listItems.addKeyListener(createCustomKeyListener());
        listItems.addMouseListener(createCustomMouseListener());
        listScrollPane.setVisible(false);
        cp.add(listScrollPane);
        buttonConfirmItem = new JButton(t.getTranslatedText("Confirm"));
        buttonConfirmItem.setBounds(borderSpacer, borderSpacer + itemListHeight + verticalElementSpacer,
                itemListWidth, buttonHeight);
        buttonConfirmItem.setVisible(false);
        buttonConfirmItem.addActionListener(this::buttonConfirmItemActionPerformed);
        cp.add(buttonConfirmItem);
        labelAmount = new JLabel(t.getTranslatedText("Amount:"));
        labelAmount.setBounds(borderSpacer, borderSpacer, smallLabelWidth, smallLabelHeight);
        labelAmount.setVisible(false);
        cp.add(labelAmount);
        labelCost = new JLabel(t.getTranslatedText("Cost:"));
        labelCost.setBounds(borderSpacer + horizontalElementSpacer + smallLabelWidth, borderSpacer,
                smallLabelWidth, smallLabelHeight);
        labelCost.setVisible(false);
        cp.add(labelCost);
        amountSpinner = new JSpinner();
        amountSpinner.setBounds(borderSpacer, borderSpacer + smallLabelHeight + verticalElementSpacer,
                smallLabelWidth, selectorHeight);
        amountSpinner.setVisible(false);
        cp.add(amountSpinner);
        costSpinner = new JSpinner();
        costSpinner.setBounds(borderSpacer + smallLabelWidth + horizontalElementSpacer, borderSpacer +
                smallLabelHeight + verticalElementSpacer, smallLabelWidth, selectorHeight);
        costSpinner.setVisible(false);
        cp.add(costSpinner);
        buttonConfirmFinal = new JButton(t.getTranslatedText("Confirm"));
        buttonConfirmFinal.setBounds(borderSpacer, borderSpacer + smallLabelHeight + (2 * verticalElementSpacer) +
                selectorHeight, (smallLabelWidth * 2) + horizontalElementSpacer, buttonHeight);
        buttonConfirmFinal.addActionListener(this::buttonConfirmFinalActionPerformed);
        buttonConfirmFinal.setVisible(false);
        cp.add(buttonConfirmFinal);
        int dialogWidth = ViewConstants.ADD_ITEM_DIALOG_SALE_TYPE_WIDTH;
        int dialogHeight = ViewConstants.ADD_ITEM_DIALOG_SALE_TYPE_HEIGHT;
        setSize(dialogWidth, dialogHeight);
        center();
        setResizable(false);
        setVisible(true);
    }

    private KeyListener createCustomKeyListener() {
        return new KeyAdapter() {
            @Override
            public void keyPressed(final KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    enterConfirmItemActionPerformed();
                }
            }
        };
    }

    private MouseListener createCustomMouseListener() {
        return new MouseAdapter() {
            final int doubleClickMaxDelay = OoTMConstants.DOUBLE_CLICK_MAX_DELAY;
            boolean isAlreadyOneClick;
            java.util.Timer timer;

            @Override
            public void mouseClicked(final MouseEvent e) {
                if (isAlreadyOneClick) {
                    doubleClickConfirmItemActionPerformed();
                    isAlreadyOneClick = false;
                } else {
                    isAlreadyOneClick = true;
                    timer = new java.util.Timer("double click timer", false);
                    timer.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            isAlreadyOneClick = false;
                        }
                    }, doubleClickMaxDelay);
                }
            }
        };
    }

    public void center() {
        int dialogWidth = ViewConstants.ADD_ITEM_DIALOG_SALE_TYPE_WIDTH;
        int dialogHeight = ViewConstants.ADD_ITEM_DIALOG_SALE_TYPE_HEIGHT;
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (d.width - dialogWidth) / 2;
        int y = (d.height - dialogHeight) / 2;
        setLocation(x, y);
    }

    private void buttonNormalActionPerformed(final ActionEvent actionEvent) {
        aic.buttonNormal(this);
    }

    private void buttonSpecialActionPerformed(final ActionEvent actionEvent) {
        aic.buttonSpecial(this);
    }

    private void buttonConfirmItemActionPerformed(final ActionEvent actionEvent) {
        confirmItem();
    }

    private void enterConfirmItemActionPerformed() {
        confirmItem();
    }

    private void doubleClickConfirmItemActionPerformed() {
        confirmItem();
    }

    public void confirmItem() {
        String selectedValue = listItems.getSelectedValue();
        if (selectedValue != null) aic.confirmItem(Translation.toEnglish(selectedValue));
    }

    private void buttonConfirmFinalActionPerformed(final ActionEvent actionEvent) {
        aic.confirmFinal((int) amountSpinner.getValue(), (int) costSpinner.getValue());
    }

    public JLabel getLabelQuestion() {
        return labelQuestion;
    }

    public JButton getButtonNormal() {
        return buttonNormal;
    }

    public JButton getButtonSpecial() {
        return buttonSpecial;
    }

    public JScrollPane getListScrollPane() {
        return listScrollPane;
    }

    public JList<String> getListItems() {
        return listItems;
    }

    public JButton getButtonConfirmItem() {
        return buttonConfirmItem;
    }

    public JLabel getLabelAmount() {
        return labelAmount;
    }

    public JLabel getLabelCost() {
        return labelCost;
    }

    public JSpinner getAmountSpinner() {
        return amountSpinner;
    }

    public JSpinner getCostSpinner() {
        return costSpinner;
    }

    public JButton getButtonConfirmFinal() {
        return buttonConfirmFinal;
    }
}
