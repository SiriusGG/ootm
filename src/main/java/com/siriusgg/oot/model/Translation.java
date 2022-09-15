package com.siriusgg.oot.model;

public enum Translation {
    ENGLISH, GERMAN;

    public static Translation fromString(final String translationString) {
        if (translationString == null || translationString.equals("")) return null;
        String translationStringLowerCase = translationString.toLowerCase();
        switch (translationStringLowerCase) {
            case "english": return ENGLISH;
            case "german": return GERMAN;
            default:
                throw new IllegalArgumentException("Unknown translationString: " + translationString);
        }
    }

    public String getTranslatedText(final String englishString) {
        switch (this) {
            case ENGLISH: return englishString;
            case GERMAN:
                switch (englishString) {
                    // main menu frame
                    case "OoT Maps: Main Menu": return "OoT Maps: Hauptmenü";
                    case "New Seed": return "Neuer Seed";
                    case "Load Seed": return "Seed laden";
                    case "Settings": return "Einstellungen";
                    case "Browse": return "Öffne";
                    case " directory": return "-Ordner";
                    case "About": return "Über";
                    // enter seed name dialog
                    case "Enter seed name": return "Seed-Name eingeben";
                    case "Confirm": return "Bestätigen";
                    case "Cancel": return "Abbrechen";
                    case "Name may only contain A-Z, a-z and 0-9.": return "Name darf nur A-Z, a-z und 0-9 beinhalten.";
                    // seed name exists dialog
                    case "Seed name exists": return "Seed-Name vergeben";
                    case "The seed name": return "Der Seed-Name";
                    case "is already in use.": return "wird bereits verwendet.";
                    case "Overwrite": return "Überschreiben";
                    // current location frame
                    case "Main": return "Haupt";
                    case "Main menu": return "Hauptmenü";
                    case "Exit": return "Beenden";
                    case "Seed": return "Seed";
                    case "Set home location": return "Startposition setzen";
                    case "For child": return "Als Kind";
                    case "For adult": return "Als Erwachsener";
                    case "Set child home location": return "Startposition Kind";
                    case "Set adult home location": return "Startposition Erwachsener";
                    case "Set": return "Festlegen";
                    case "View": return "Ansicht";
                    case "Show transitions": return "Verbindungen zeigen";
                    case "Lists": return "Listen";
                    case "Cow list": return "Kuh-Liste";
                    case "Bean spot list": return "Bohnen-Liste";
                    case "Tools": return "Werkzeuge";
                    case "Notes": return "Notizen";
                    case "Child": return "Kind";
                    case "Adult": return "Erwachsener";
                    case "Side": return "Seite";
                    case "Top": return "Oben";
                    case "Zoom": return "Zoom";
                    case "to": return "zu / nach";
                    case "(Door Entrance)": return "(Tür-Eingang)";
                    case "(Door Exit)": return "(Tür-Ausgang)";
                    case "(Dungeon Entrance)": return "(Dungeon-Eingang)";
                    case "(Dungeon Exit)": return "(Dungeon-Ausgang)";
                    case "(Grotto Entrance)": return "(Grotten-Eingang)";
                    case "(Grotto Exit)": return "(Grotten-Ausgang)";
                    case "(Overworld)": return "(Welt)";
                    case "(Owl Start)": return "(Eulen-Startpunkt)";
                    case "(Owl Landing)": return "(Eulen-Landeplatz)";
                    case "(Unchanging)": return "(Unveränderlich)";
                    case "now leads to": return "führt jetzt zu/nach";
                    case "Unknown": return "Unbekannt";
                    // places with map
                    case "Bottom of the Well": return "Grund des Brunnens";
                    case "Dampe's Grave": return "Boris' Grab";
                    case "Death Mountain Crater": return "Todeskrater";
                    case "Death Mountain Trail": return "Todesberg";
                    case "Desert Colossus": return "Wüstenkoloss";
                    case "Dodongo's Cavern": return "Dodongos Höhle";
                    case "Fire Temple": return "Feuertempel";
                    case "Forest Temple": return "Waldtempel";
                    case "Gerudo's Fortress": return "Gerudo-Festung";
                    case "Gerudo Training Ground": return "Gerudo-Arena";
                    case "Gerudo Valley": return "Gerudotal";
                    case "Goron City": return "Goronia";
                    case "Graveyard": return "Friedhof";
                    case "Haunted Wasteland": return "Gespensterwüste";
                    case "Hyrule Castle": return "Schloß Hyrule";
                    case "Hyrule Field": return "Hylianische Steppe";
                    case "Ice Cavern": return "Eishöhle";
                    case "Inside Ganon's Castle": return "Teufelsturm";
                    case "Inside Jabu-Jabu's Belly": return "Jabu-Jabus Bauch";
                    case "Inside the Deku Tree": return "Im Deku-Baum";
                    case "Kakariko Potion Shop": return "Kakariko Magieladen";
                    case "Kakariko Village": return "Kakariko";
                    case "Kokiri Forest": return "Kokiri-Wald";
                    case "Lake Hylia": return "Hylia-See";
                    case "Link's House": return "Links Haus";
                    case "Lon Lon Ranch": return "Lon Lon-Farm";
                    case "Lost Woods": return "Verlorene Wälder";
                    case "Market": return "Marktplatz";
                    case "Market Entrance": return "Schlossbrücke";
                    case "Sacred Forest Meadow": return "Waldlichtung";
                    case "Shadow Temple": return "Schattentempel";
                    case "Spirit Temple": return "Geistertempel";
                    case "Temple of Time": return "Zitadelle der Zeit";
                    case "Temple of Time Entrance": return "Pfad zur Zitadelle der Zeit";
                    case "Thieves' Hideout": return "Diebesversteck";
                    case "Thieves' Hideout Outside": return "Diebesversteck außen";
                    case "Water Temple": return "Wassertempel";
                    case "Windmill": return "Windmühle";
                    case "Zora's Domain": return "Zoras Reich";
                    case "Zora's Fountain": return "Zoras Quelle";
                    case "Zora's River": return "Zoras Fluss";
                    // entrance/exit names
                    // ToDo: doors, grottos...
                    // cow check list dialog
                    case "Cows": return "Kühe";
                    case "HF Cow Grotto": return "HS Kuh-Grotte";
                    case "Stables Left": return "Stall links";
                    case "Stables Right": return "Stall rechts";
                    case "Tower Left": return "Turm links";
                    case "Tower Right": return "Turm rechts";
                    case "Impa's House": return "Impas Haus";
                    case "DMT Cow Grotto": return "TB Kuh-Grotte";
                    case "Jabu-Jabu's Belly MQ": return "Jabu-Jabus Bauch MQ";
                    case "Seed has Master Quest Jabu-Jabu": return "Seed hat Master Quest Jabu-Jabu";
                    // bean spot check list dialog
                    case "Beans": return "Bohnen";
                    case "Lost Woods (Bridge)": return "Verlorene Wälder (Brücke)";
                    case "Lost Woods (Forest Stage)": return "Verlorene Wälder (Waldbühne)";
                    // about frame
                    case "OoT Maps: About": return "OoT Maps: Über";
                    case "version": return "Version";
                    case "Developed by": return "Entwickelt von";
                    case "Maps by": return "Karten von";
                    case "Special thanks to": return "Besonderer Dank an";
                    // AddTransitionDialog
                    case "Add Transition": return "Verbindung hinzufügen";
                    case "Add": return "Hinzufügen";
                    // BidirectionalTransitionDialog
                    case "Do you want to also connect the": return "Ein/-Ausgang der Rückrichtung";
                    case "transition in the other direction?": return "dieser Verbindung angeben?";
                    case "Yes": return "Ja";
                    case "No": return "Nein";
                    case "Remember this decision for this seed": return "Auswahl für diesen Seed speichern";
                    case "Possible exits from": return "Mögliche Ausgänge aus/von";
                    // LoadSeedDialog
                    case "Select seed": return "Seed auswählen";
                    // NoSavedSeedsDialog
                    case "No saved seeds": return "Keine gespeicherten Seeds";
                    case "No saved seeds were found in": return "Es wurden keine gespeicherten Seeds gefunden in";
                    case "OK": return "OK";
                    // NotesDialog (nothing)
                    // SetHomeLocationDialog (nothing)
                    default: return englishString;
                }
            default:
                throw new IllegalStateException("Illegal value for translation: " + this);
        }
    }

    public static String toEnglish(final String input) {
        switch (input) {
            case "Grund des Brunnens": return "Bottom of the Well";
            case "Boris' Grab": return "Dampe's Grave";
            case "Todeskrater": return "Death Mountain Crater";
            case "Todesberg": return "Death Mountain Trail";
            case "Wüstenkoloss": return "Desert Colossus";
            case "Dodongos Höhle": return "Dodongo's Cavern";
            case "Feuertempel": return "Fire Temple";
            case "Waldtempel": return "Forest Temple";
            case "Gerudo-Festung": return "Gerudo's Fortress";
            case "Gerudo-Arena": return "Gerudo Training Ground";
            case "Gerudotal": return "Gerudo Valley";
            case "Goronia": return "Goron City";
            case "Friedhof": return "Graveyard";
            case "Gespensterwüste": return "Haunted Wasteland";
            case "Schloß Hyrule": return "Hyrule Castle";
            case "Hylianische Steppe": return "Hyrule Field";
            case "Eishöhle": return "Ice Cavern";
            case "Teufelsturm": return "Inside Ganon's Castle";
            case "Jabu-Jabus Bauch": return "Inside Jabu-Jabu's Belly";
            case "Im Deku-Baum": return "Inside the Deku Tree";
            case "Kakariko Magieladen": return "Kakariko Potion Shop";
            case "Kakariko": return "Kakariko Village";
            case "Kokiri-Wald": return "Kokiri Forest";
            case "Hylia-See": return "Lake Hylia";
            case "Links Haus": return "Link's House";
            case "Lon Lon-Ranch": return "Lon Lon Ranch";
            case "Verlorene Wälder": return "Lost Woods";
            case "Marktplatz": return "Market";
            case "Schlossbrücke": return "Market Entrance";
            case "Waldlichtung": return "Sacred Forest Meadow";
            case "Schattentempel": return "Shadow Temple";
            case "Geistertempel": return "Spirit Temple";
            case "Zitadelle der Zeit": return "Temple of Time";
            case "Pfad zur Zitadelle der Zeit": return "Temple of Time Entrance";
            case "Diebesversteck": return "Thieves' Hideout";
            case "Diebesversteck außen": return "Thieves' Hideout Outside";
            case "Wassertempel": return "Water Temple";
            case "Windmühle": return "Windmill";
            case "Zoras Reich": return "Zora's Domain";
            case "Zoras Quelle": return "Zora's Fountain";
            case "Zoras Fluss": return "Zora's River";
            case "Kind": return "Child";
            case "Erwachsener": return "Adult";
            case "Seite": return "Side";
            case "Oben": return "Top";
            // ToDo: Missing cases!
            default: return input;
        }
    }
}
