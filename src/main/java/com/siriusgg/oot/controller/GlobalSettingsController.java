package com.siriusgg.oot.controller;

import com.siriusgg.oot.model.*;
import com.siriusgg.oot.view.*;

import javax.swing.*;

public class GlobalSettingsController {
    private final MainMenuFrame mmf;
    private Translation t;

    public GlobalSettingsController(final MainMenuFrame mmf) {
        this.mmf = mmf;
        t = GlobalSettings.getInstance().getTranslation();
    }

    public void init() {
        new GlobalSettingsDialog(this, mmf, t.getTranslatedText("Global Settings"));
    }

    public void fillLanguageComboBox(final JComboBox<String> languageComboBox) {
        for (final Translation language : Translation.values()) {
            languageComboBox.addItem(t.getTranslatedText(language.toLanguageString()));
        }
    }

    public void setSelectedLanguage(final JComboBox<String> languageComboBox) {
        String languageString = t.getTranslatedText(t.toLanguageString());
        languageComboBox.setSelectedItem(languageString);
    }

    public void updateLanguage(final GlobalSettingsDialog gsd, final JComboBox<String> languageComboBox) {
        GlobalSettings.getInstance().setTranslation(
                Translation.fromString((String) languageComboBox.getSelectedItem()));
        GlobalSettings.saveGlobalSettings(GlobalSettings.getInstance());
        t = GlobalSettings.getInstance().getTranslation();
        gsd.setTitle(t.getTranslatedText("Global Settings"));
        gsd.getLanguageLabel().setText(t.getTranslatedText("Language"));
        languageComboBox.removeAllItems();
        fillLanguageComboBox(languageComboBox);
        setSelectedLanguage(languageComboBox);
        mmf.reTranslate();
    }
}
