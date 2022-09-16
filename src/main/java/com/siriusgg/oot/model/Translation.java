package com.siriusgg.oot.model;

public enum Translation {
    ENGLISH, GERMAN;

    public static Translation fromString(final String translationString) {
        if (translationString == null || translationString.equals("")) return null;
        String translationStringLowerCase = translationString.toLowerCase();
        switch (translationStringLowerCase) {
            case "english":
                return ENGLISH;
            case "german":
                return GERMAN;
            default:
                throw new IllegalArgumentException("Unknown translationString: " + translationString);
        }
    }

    public String getTranslatedText(final String englishString) {
        switch (this) {
            case ENGLISH:
                return englishString;
            case GERMAN:
                switch (englishString) {
                    // main menu frame
                    case "OoT Maps: Main Menu":
                        return "OoT Maps: Hauptmenü";
                    case "New Seed":
                        return "Neuer Seed";
                    case "Load Seed":
                        return "Seed laden";
                    case "Settings":
                        return "Einstellungen";
                    case "Browse":
                        return "Öffne";
                    case " directory":
                        return "-Ordner";
                    case "About":
                        return "Über";
                    // enter seed name dialog
                    case "Enter seed name":
                        return "Seed-Name eingeben";
                    case "Confirm":
                        return "Bestätigen";
                    case "Cancel":
                        return "Abbrechen";
                    case "Name may only contain A-Z, a-z and 0-9.":
                        return "Name darf nur A-Z, a-z und 0-9 beinhalten.";
                    // seed name exists dialog
                    case "Seed name exists":
                        return "Seed-Name vergeben";
                    case "The seed name":
                        return "Der Seed-Name";
                    case "is already in use.":
                        return "wird bereits verwendet.";
                    case "Overwrite":
                        return "Überschreiben";
                    // current location frame
                    case "Main":
                        return "Haupt";
                    case "Main menu":
                        return "Hauptmenü";
                    case "Exit":
                        return "Beenden";
                    case "Seed":
                        return "Seed";
                    case "Set home location":
                        return "Startposition setzen";
                    case "For child":
                        return "Als Kind";
                    case "For adult":
                        return "Als Erwachsener";
                    case "Set child home location":
                        return "Startposition Kind";
                    case "Set adult home location":
                        return "Startposition Erwachsener";
                    case "Set":
                        return "Festlegen";
                    case "View":
                        return "Ansicht";
                    case "Show transitions":
                        return "Verbindungen zeigen";
                    case "Lists":
                        return "Listen";
                    case "Cow list":
                        return "Kuh-Liste";
                    case "Bean spot list":
                        return "Bohnen-Liste";
                    case "Tools":
                        return "Werkzeuge";
                    case "Notes":
                        return "Notizen";
                    case "Child":
                        return "Kind";
                    case "Adult":
                        return "Erwachsener";
                    case "Side":
                        return "Seite";
                    case "Top":
                        return "Oben";
                    case "Zoom":
                        return "Zoom";
                    case "to":
                        return "zu/nach";
                    case "(Door Entrance)":
                        return "(Tür-Eingang)";
                    case "(Door Exit)":
                        return "(Tür-Ausgang)";
                    case "(Dungeon Entrance)":
                        return "(Dungeon-Eingang)";
                    case "(Dungeon Exit)":
                        return "(Dungeon-Ausgang)";
                    case "(Grotto Entrance)":
                        return "(Grotten-Eingang)";
                    case "(Grotto Exit)":
                        return "(Grotten-Ausgang)";
                    case "(Overworld)":
                        return "(Welt)";
                    case "(Owl Start)":
                        return "(Eulen-Startpunkt)";
                    case "(Owl Landing)":
                        return "(Eulen-Landeplatz)";
                    case "(Unchanging)":
                        return "(Unveränderlich)";
                    case "now leads to":
                        return "führt jetzt zu/nach";
                    case "Unknown":
                        return "Unbekannt";
                    // places with map
                    case "Bottom of the Well":
                        return "Grund des Brunnens";
                    case "Dampe's Grave":
                        return "Boris' Grab";
                    case "Death Mountain Crater":
                        return "Todeskrater";
                    case "Death Mountain Trail":
                        return "Todesberg";
                    case "Desert Colossus":
                        return "Wüstenkoloss";
                    case "Dodongo's Cavern":
                        return "Dodongos Höhle";
                    case "Fire Temple":
                        return "Feuertempel";
                    case "Forest Temple":
                        return "Waldtempel";
                    case "Gerudo's Fortress":
                        return "Gerudo-Festung";
                    case "Gerudo Training Ground":
                        return "Gerudo-Arena";
                    case "Gerudo Valley":
                        return "Gerudotal";
                    case "Goron City":
                        return "Goronia";
                    case "Graveyard":
                        return "Friedhof";
                    case "Haunted Wasteland":
                        return "Gespensterwüste";
                    case "Hyrule Castle":
                        return "Schloß Hyrule";
                    case "Hyrule Field":
                        return "Hylianische Steppe";
                    case "Ice Cavern":
                        return "Eishöhle";
                    case "Inside Ganon's Castle":
                        return "Teufelsturm";
                    case "Inside Jabu-Jabu's Belly":
                        return "Jabu-Jabus Bauch";
                    case "Inside the Deku Tree":
                        return "Im Deku-Baum";
                    case "Kakariko Potion Shop":
                        return "Kakariko Magie-Laden";
                    case "Kakariko Village":
                        return "Kakariko";
                    case "Kokiri Forest":
                        return "Kokiri-Wald";
                    case "Lake Hylia":
                        return "Hylia-See";
                    case "Link's House":
                        return "Links Haus";
                    case "Lon Lon Ranch":
                        return "Lon Lon-Farm";
                    case "Lost Woods":
                        return "Verlorene Wälder";
                    case "Market":
                        return "Marktplatz";
                    case "Market Entrance":
                        return "Schlossbrücke";
                    case "Sacred Forest Meadow":
                        return "Waldlichtung";
                    case "Shadow Temple":
                        return "Schattentempel";
                    case "Spirit Temple":
                        return "Geistertempel";
                    case "Temple of Time":
                        return "Zitadelle der Zeit";
                    case "Temple of Time Entrance":
                        return "Pfad zur Zitadelle der Zeit";
                    case "Thieves' Hideout":
                        return "Diebesversteck";
                    case "Thieves' Hideout Outside":
                        return "Diebesversteck außen";
                    case "Water Temple":
                        return "Wassertempel";
                    case "Windmill":
                        return "Windmühle";
                    case "Zora's Domain":
                        return "Zoras Reich";
                    case "Zora's Fountain":
                        return "Zoras Quelle";
                    case "Zora's River":
                        return "Zoras Fluss";
                    // doors
                    case "Kakariko Potion Shop Front":
                        return "Kakariko Magie-Laden Vordereingang";
                    case "Kakariko Potion Shop (Front)":
                        return "Kakariko Magie-Laden (Vordereingang)";
                    case "Kakariko Potion Shop Back":
                        return "Kakariko Magie-Laden Hintereingang";
                    case "Kakariko Potion Shop (Back)":
                        return "Kakariko Magie-Laden (Hintereingang)";
                    case "Mido's House":
                        return "Midos Haus";
                    case "Saria's House":
                        return "Salias Haus";
                    case "House of Twins":
                        return "Haus der Zwillinge";
                    case "Know-It-All House":
                        return "Haus der allwissenden Brüder";
                    case "Kokiri Shop":
                        return "Kokiri-Laden";
                    case "Guard House":
                        return "Haus mit Krügen/Gespenstermarkt";
                    case "Treasure Chest Game":
                        return "Schatzkisten-Poker";
                    case "Bombchu Shop":
                        return "Krabbelminen-Laden";
                    case "Man-in-Green House":
                        return "Haus des grün gekleideten Mannes";
                    case "Bombchu Bowling":
                        return "Minenbowlingbahn";
                    case "Market Shooting Gallery":
                        return "Marktplatz Schießbude";
                    case "Mask Shop":
                        return "Maskenhändler";
                    case "Market Potion Shop":
                        return "Marktplatz Magie-Laden";
                    case "Market Bazaar":
                        return "Marktplatz Basar";
                    case "Hyrule Castle Great Fairy":
                        return "Schloß Hyrule Feen-Quelle";
                    case "Ganon's Castle Great Fairy":
                        return "Ganons Schloß Feen-Quelle";
                    case "Talon's House":
                        return "Talons Haus/Superhühner";
                    case "Stables":
                        return "Stall";
                    case "Tower":
                        return "Turm";
                    case "Carpenter Boss' House":
                        return "Haus des Zimmermannschefs";
                    case "House of Skulltula":
                        return "Skulltulas Haus";
                    case "Impa's House (Front)":
                        return "Impas Haus (Vordereingang)";
                    case "Kakariko Bazaar":
                        return "Kakariko Basar";
                    case "Kakariko Shooting Gallery":
                        return "Kakariko Schießbude";
                    case "Odd Medicine Building":
                        return "Asas Hexenhaus";
                    case "Impa's House (Back)":
                        return "Impas Haus (Hintereingang)";
                    case "Dampe's House":
                        return "Boris' Haus";
                    case "Death Mountain Trail Great Fairy":
                        return "Todesberg Feen-Quelle";
                    case "Goron Shop":
                        return "Goronen-Laden";
                    case "Death Mountain Crater Great Fairy":
                        return "Todeskrater Feen-Quelle";
                    case "Zora Shop":
                        return "Zora-Laden";
                    case "Fishing Hole":
                        return "Fischweiher";
                    case "Lakeside Laboratory":
                        return "Labor am See";
                    case "Zora's Fountain Great Fairy":
                        return "Zoras Quelle Feen-Quelle";
                    case "Carpenter Tent":
                        return "Zelt der Zimmermänner";
                    case "Colossus Great Fairy":
                        return "Wüstenkoloss Feen-Quelle";
                    // grottos
                    case "Kokiri Forest Storms Grotto":
                        return "Kokiri-Wald Sturm-Grotte";
                    case "Lost Woods Near Shortcuts Grotto":
                        return "Verlorene Wälder Grotte bei Goronia";
                    case "Deku Theater":
                        return "Waldbühne";
                    case "Lost Woods Scrubs Grotto":
                        return "Verlorene Wälder Händler-Deku-Grotte";
                    case "Sacred Forest Meadow Wolfos Grotto":
                        return "Waldlichtung Wolfos-Grotte";
                    case "Sacred Forest Meadow Fairy Grotto":
                        return "Waldlichtung Feen-Brunnen";
                    case "Sacred Forest Meadow Storms Grotto":
                        return "Waldlichtung Sturm-Grotte";
                    case "Hyrule Field South-East Grotto":
                        return "Hylianische Steppe Südost-Grotte";
                    case "Hyrule Field Open Grotto":
                        return "Hylianische Steppe offene Grotte";
                    case "Hyrule Field Inside Fence Grotto":
                        return "Hylianische Steppe eingezäunte Grotte";
                    case "Hyrule Field Cow Grotto":
                        return "Hylianische Steppe Kuh-Grotte";
                    case "Hyrule Field Near Market Grotto":
                        return "Hylianische Steppe Grotte bei Schlossbrücke";
                    case "Hyrule Field Fairy Grotto":
                        return "Hylianische Steppe Feen-Brunnen";
                    case "Hyrule Field Near Kakariko Grotto":
                        return "Hylianische Steppe Grotte bei Kakariko";
                    case "Hyrule Field Tektite Grotto":
                        return "Hylianische Steppe Arachno-Grotte";
                    case "Hyrule Castle Storms Grotto":
                        return "Schloß Hyrule Sturm-Grotte";
                    case "Lon Lon Ranch Grotto":
                        return "Lon Lon-Farm offene Grotte";
                    case "Kakariko Redead Grotto":
                        return "Kakariko Zombie-Grotte";
                    case "Kakariko Open Grotto":
                        return "Kakariko offene Grotte";
                    case "Graveyard Shield Grave":
                        return "Friedhof Schildgrab";
                    case "Graveyard Heart Piece Grave":
                        return "Friedhof Herzteilgrab";
                    case "Graveyard Royal Family's Tomb":
                        return "Friedhof Königsgrab";
                    case "Death Mountain Trail Storms Grotto":
                        return "Todesberg Sturm-Grotte";
                    case "Death Mountain Trail Cow Grotto":
                        return "Todesberg Kuh-Grotte";
                    case "Goron City Open Grotto":
                        return "Goronia offene Grotte";
                    case "DMC Upper Grotto":
                        return "Todeskrater obere Grotte";
                    case "DMC Hammer Grotto":
                        return "Todeskrater Hammer-Grotte";
                    case "Zora's River Open Grotto":
                        return "Zoras Fluss offene Grotte";
                    case "Zora's River Fairy Grotto":
                        return "Zoras Fluss Feen-Brunnen";
                    case "Zora's River Storms Grotto":
                        return "Zoras Fluss Sturm-Grotte";
                    case "Zora's Domain Storms Grotto":
                        return "Zoras Reich Sturm-Grotte";
                    case "Lake Hylia Grotto":
                        return "Hylia-See Grabstein-Grotte";
                    case "Gerudo Valley Storms Grotto":
                        return "Gerudotal Sturm-Grotte";
                    case "Gerudo Valley Octorok Grotto":
                        return "Gerudotal Oktorok-Grotte";
                    case "Gerudo's Fortress Storms Grotto":
                        return "Gerudo-Festung Sturm-Grotte";
                    case "Colossus Grotto":
                        return "Wüstenkoloss Krafthandschuh-Grotte";
                    // cow check list dialog
                    case "Cows":
                        return "Kühe";
                    case "HF Cow Grotto":
                        return "HS Kuh-Grotte";
                    case "Stables Left":
                        return "Stall links";
                    case "Stables Right":
                        return "Stall rechts";
                    case "Tower Left":
                        return "Turm links";
                    case "Tower Right":
                        return "Turm rechts";
                    case "Impa's House":
                        return "Impas Haus";
                    case "DMT Cow Grotto":
                        return "TB Kuh-Grotte";
                    case "Jabu-Jabu's Belly MQ":
                        return "Jabu-Jabus Bauch MQ";
                    case "Seed has Master Quest Jabu-Jabu":
                        return "Seed hat Master Quest Jabu-Jabu";
                    // bean spot check list dialog
                    case "Beans":
                        return "Bohnen";
                    case "Lost Woods (Bridge)":
                        return "Verlorene Wälder (Brücke)";
                    case "Lost Woods (Forest Stage)":
                        return "Verlorene Wälder (Waldbühne)";
                    // about frame
                    case "OoT Maps: About":
                        return "OoT Maps: Über";
                    case "version":
                        return "Version";
                    case "Developed by":
                        return "Entwickelt von";
                    case "Maps by":
                        return "Karten von";
                    case "Special thanks to":
                        return "Besonderer Dank an";
                    // add transition dialog
                    case "Add Transition":
                        return "Verbindung hinzufügen";
                    case "Add":
                        return "Hinzufügen";
                    // bidirectional transition dialog
                    case "Add Transition Exit":
                        return "Rückweg hinzufügen";
                    case "Do you want to also connect the":
                        return "Ein/-Ausgang der Rückrichtung";
                    case "transition in the other direction?":
                        return "dieser Verbindung angeben?";
                    case "Yes":
                        return "Ja";
                    case "No":
                        return "Nein";
                    case "Remember this decision for this seed":
                        return "Auswahl für diesen Seed speichern";
                    case "Possible exits from":
                        return "Mögliche Ausgänge aus/von";
                    // load seed dialog
                    case "Select seed":
                        return "Seed auswählen";
                    // no saved seeds dialog
                    case "No saved seeds":
                        return "Keine gespeicherten Seeds";
                    case "No saved seeds were found in":
                        return "Es wurden keine gespeicherten Seeds gefunden in";
                    case "OK":
                        return "OK";
                    // notes dialog (nothing)
                    // set home location dialog (nothing)
                    default:
                        return englishString;
                }
            default:
                throw new IllegalStateException("Illegal value for translation: " + this);
        }
    }

    public static String toEnglish(final String input) {
        switch (input) {
            case "Grund des Brunnens":
                return "Bottom of the Well";
            case "Boris' Grab":
                return "Dampe's Grave";
            case "Todeskrater":
                return "Death Mountain Crater";
            case "Todesberg":
                return "Death Mountain Trail";
            case "Wüstenkoloss":
                return "Desert Colossus";
            case "Dodongos Höhle":
                return "Dodongo's Cavern";
            case "Feuertempel":
                return "Fire Temple";
            case "Waldtempel":
                return "Forest Temple";
            case "Gerudo-Festung":
                return "Gerudo's Fortress";
            case "Gerudo-Arena":
                return "Gerudo Training Ground";
            case "Gerudotal":
                return "Gerudo Valley";
            case "Goronia":
                return "Goron City";
            case "Friedhof":
                return "Graveyard";
            case "Gespensterwüste":
                return "Haunted Wasteland";
            case "Schloß Hyrule":
                return "Hyrule Castle";
            case "Hylianische Steppe":
                return "Hyrule Field";
            case "Eishöhle":
                return "Ice Cavern";
            case "Teufelsturm":
                return "Inside Ganon's Castle";
            case "Jabu-Jabus Bauch":
                return "Inside Jabu-Jabu's Belly";
            case "Im Deku-Baum":
                return "Inside the Deku Tree";
            case "Kakariko Magie-Laden":
                return "Kakariko Potion Shop";
            case "Kakariko":
                return "Kakariko Village";
            case "Kokiri-Wald":
                return "Kokiri Forest";
            case "Hylia-See":
                return "Lake Hylia";
            case "Links Haus":
                return "Link's House";
            case "Lon Lon-Farm":
                return "Lon Lon Ranch";
            case "Verlorene Wälder":
                return "Lost Woods";
            case "Marktplatz":
                return "Market";
            case "Schlossbrücke":
                return "Market Entrance";
            case "Waldlichtung":
                return "Sacred Forest Meadow";
            case "Schattentempel":
                return "Shadow Temple";
            case "Geistertempel":
                return "Spirit Temple";
            case "Zitadelle der Zeit":
                return "Temple of Time";
            case "Pfad zur Zitadelle der Zeit":
                return "Temple of Time Entrance";
            case "Diebesversteck":
                return "Thieves' Hideout";
            case "Diebesversteck außen":
                return "Thieves' Hideout Outside";
            case "Wassertempel":
                return "Water Temple";
            case "Windmühle":
                return "Windmill";
            case "Zoras Reich":
                return "Zora's Domain";
            case "Zoras Quelle":
                return "Zora's Fountain";
            case "Zoras Fluss":
                return "Zora's River";
            case "Kind":
                return "Child";
            case "Erwachsener":
                return "Adult";
            case "Seite":
                return "Side";
            case "Oben":
                return "Top";
            case "Kakariko Magie-Laden Vordereingang":
                return "Kakariko Potion Shop Front";
            case "Kakariko Magie-Laden Hintereingang":
                return "Kakariko Potion Shop Back";
            case "Kakariko Magie-Laden (Vordereingang)":
                return "Kakariko Potion Shop (Front)";
            case "Kakariko Magie-Laden (Hintereingang)":
                return "Kakariko Potion Shop (Back)";
            case "Midos Haus":
                return "Mido's House";
            case "Salias Haus":
                return "Saria's House";
            case "Haus der Zwillinge":
                return "House of Twins";
            case "Haus der allwissenden Brüder":
                return "Know-It-All House";
            case "Kokiri-Laden":
                return "Kokiri Shop";
            case "Haus mit Krügen/Gespenstermarkt":
                return "Guard House";
            case "Schatzkisten-Poker":
                return "Treasure Chest Game";
            case "Krabbelminen-Laden":
                return "Bombchu Shop";
            case "Haus des grün gekleideten Mannes":
                return "Man-in-Green House";
            case "Minenbowlingbahn":
                return "Bombchu Bowling";
            case "Marktplatz Schießbude":
                return "Market Shooting Gallery";
            case "Maskenhändler":
                return "Mask Shop";
            case "Marktplatz Magie-Laden":
                return "Market Potion Shop";
            case "Marktplatz Basar":
                return "Market Bazaar";
            case "Schloß Hyrule Feen-Quelle":
                return "Hyrule Castle Great Fairy";
            case "Ganons Schloß Feen-Quelle":
                return "Ganon's Castle Great Fairy";
            case "Talons Haus/Superhühner":
                return "Talon's House";
            case "Stall":
                return "Stables";
            case "Turm":
                return "Tower";
            case "Haus des Zimmermannschefs":
                return "Carpenter Boss' House";
            case "Skulltulas Haus":
                return "House of Skulltula";
            case "Impas Haus (Vordereingang)":
                return "Impa's House (Front)";
            case "Kakariko Basar":
                return "Kakariko Bazaar";
            case "Kakariko Schießbude":
                return "Kakariko Shooting Gallery";
            case "Asas Hexenhaus":
                return "Odd Medicine Building";
            case "Impas Haus (Hintereingang)":
                return "Impa's House (Back)";
            case "Boris' Haus":
                return "Dampe's House";
            case "Todesberg Feen-Quelle":
                return "Death Mountain Trail Great Fairy";
            case "Goronen-Laden":
                return "Goron Shop";
            case "Todeskrater Feen-Quelle":
                return "Death Mountain Crater Great Fairy";
            case "Zora-Laden":
                return "Zora Shop";
            case "Fischweiher":
                return "Fishing Hole";
            case "Labor am See":
                return "Lakeside Laboratory";
            case "Zoras Quelle Feen-Quelle":
                return "Zora's Fountain Great Fairy";
            case "Zelt der Zimmermänner":
                return "Carpenter Tent";
            case "Wüstenkoloss Feen-Quelle":
                return "Colossus Great Fairy";
            case "Kokiri-Wald Sturm-Grotte":
                return "Kokiri Forest Storms Grotto";
            case "Verlorene Wälder Grotte bei Goronia":
                return "Lost Woods Near Shortcuts Grotto";
            case "Waldbühne":
                return "Deku Theater";
            case "Verlorene Wälder Händler-Deku-Grotte":
                return "Lost Woods Scrubs Grotto";
            case "Waldlichtung Wolfos-Grotte":
                return "Sacred Forest Meadow Wolfos Grotto";
            case "Waldlichtung Feen-Brunnen":
                return "Sacred Forest Meadow Fairy Grotto";
            case "Waldlichtung Sturm-Grotte":
                return "Sacred Forest Meadow Storms Grotto";
            case "Hylianische Steppe Südost-Grotte":
                return "Hyrule Field South-East Grotto";
            case "Hylianische Steppe offene Grotte":
                return "Hyrule Field Open Grotto";
            case "Hylianische Steppe eingezäunte Grotte":
                return "Hyrule Field Inside Fence Grotto";
            case "Hylianische Steppe Kuh-Grotte":
                return "Hyrule Field Cow Grotto";
            case "Hylianische Steppe Grotte bei Schlossbrücke":
                return "Hyrule Field Near Market Grotto";
            case "Hylianische Steppe Feen-Brunnen":
                return "Hyrule Field Fairy Grotto";
            case "Hylianische Steppe Grotte bei Kakariko":
                return "Hyrule Field Near Kakariko Grotto";
            case "Hylianische Steppe Arachno-Grotte":
                return "Hyrule Field Tektite Grotto";
            case "Schloß Hyrule Sturm-Grotte":
                return "Hyrule Castle Storms Grotto";
            case "Lon Lon-Farm offene Grotte":
                return "Lon Lon Ranch Grotto";
            case "Kakariko Zombie-Grotte":
                return "Kakariko Redead Grotto";
            case "Kakariko offene Grotte":
                return "Kakariko Open Grotto";
            case "Friedhof Schildgrab":
                return "Graveyard Shield Grave";
            case "Friedhof Herzteilgrab":
                return "Graveyard Heart Piece Grave";
            case "Friedhof Königsgrab":
                return "Graveyard Royal Family's Tomb";
            case "Todesberg Sturm-Grotte":
                return "Death Mountain Trail Storms Grotto";
            case "Todesberg Kuh-Grotte":
                return "Death Mountain Trail Cow Grotto";
            case "Goronia offene Grotte":
                return "Goron City Open Grotto";
            case "Todeskrater obere Grotte":
                return "DMC Upper Grotto";
            case "Todeskrater Hammer-Grotte":
                return "DMC Hammer Grotto";
            case "Zoras Fluss offene Grotte":
                return "Zora's River Open Grotto";
            case "Zoras Fluss Feen-Brunnen":
                return "Zora's River Fairy Grotto";
            case "Zoras Fluss Sturm-Grotte":
                return "Zora's River Storms Grotto";
            case "Zoras Reich Sturm-Grotte":
                return "Zora's Domain Storms Grotto";
            case "Hylia-See Grabstein-Grotte":
                return "Lake Hylia Grotto";
            case "Gerudotal Sturm-Grotte":
                return "Gerudo Valley Storms Grotto";
            case "Gerudotal Oktorok-Grotte":
                return "Gerudo Valley Octorok Grotto";
            case "Gerudo-Festung Sturm-Grotte":
                return "Gerudo's Fortress Storms Grotto";
            case "Wüstenkoloss Krafthandschuh-Grotte":
                return "Colossus Grotto";
            default:
                return input;
        }
    }
}
