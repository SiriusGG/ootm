package com.siriusgg.oot.model;

import com.siriusgg.oot.constants.ViewConstants;

public enum Translation {
    ENGLISH, GERMAN;

    public static Translation fromString(final String translationString) {
        if (translationString == null || translationString.equals("")) return null;
        String translationStringLowerCase = translationString.toLowerCase();
        switch (translationStringLowerCase) {
            case "english":
            case "englisch":
                return ENGLISH;
            case "german":
            case "deutsch":
                return GERMAN;
            default:
                throw new IllegalArgumentException("Unknown translationString: " + translationString);
        }
    }

    public String toLanguageString() {
        String name = toString().toLowerCase();
        char firstLetter = toString().charAt(0);
        return firstLetter + name.substring(1);
    }

    public String getTranslatedText(final String englishString) {
        final String br = ViewConstants.HTML_BR;
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
                    // global settings dialog
                    case "Global Settings":
                        return "Allgemeine Einstellungen";
                    case "Language":
                        return "Sprache";
                    case "English":
                        return "Englisch";
                    case "German":
                        return "Deutsch";
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
                    case "Shops":
                        return "Läden";
                    case "Cows":
                        return "Kühe";
                    case "Bean spots":
                        return "Bohnenplätze";
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
                        return "Schloss Hyrule";
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
                        return "Schloss Hyrule Feen-Quelle";
                    case "Ganon's Castle Great Fairy":
                        return "Ganons Schloss Feen-Quelle";
                    case "Talon's House":
                        return "Talons Haus/Superhühner";
                    case "Stable":
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
                        return "Schloss Hyrule Sturm-Grotte";
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
                    // zoom area transition names
                    case "Gerudo's Fortress B":
                        return "Gerudo-Festung B";
                    case "Gerudo's Fortress C":
                        return "Gerudo-Festung C";
                    case "Gerudo's Fortress D":
                        return "Gerudo-Festung D";
                    case "Gerudo's Fortress E":
                        return "Gerudo-Festung E";
                    case "Gerudo's Fortress F":
                        return "Gerudo-Festung F";
                    case "Gerudo's Fortress G":
                        return "Gerudo-Festung G";
                    case "Gerudo's Fortress H":
                        return "Gerudo-Festung H";
                    case "Gerudo's Fortress I":
                        return "Gerudo-Festung I";
                    case "Gerudo's Fortress J":
                        return "Gerudo-Festung J";
                    case "Gerudo's Fortress K":
                        return "Gerudo-Festung K";
                    case "Gerudo's Fortress L":
                        return "Gerudo-Festung L";
                    case "Gerudo's Fortress M":
                        return "Gerudo-Festung M";
                    case "Gerudo's Fortress N":
                        return "Gerudo-Festung N";
                    case "Thieves' Hideout B":
                        return "Diebesversteck B";
                    case "Thieves' Hideout C":
                        return "Diebesversteck C";
                    case "Thieves' Hideout D":
                        return "Diebesversteck D";
                    case "Thieves' Hideout E":
                        return "Diebesversteck E";
                    case "Thieves' Hideout F":
                        return "Diebesversteck F";
                    case "Thieves' Hideout G":
                        return "Diebesversteck G";
                    case "Thieves' Hideout H":
                        return "Diebesversteck H";
                    case "Thieves' Hideout I":
                        return "Diebesversteck I";
                    case "Thieves' Hideout J":
                        return "Diebesversteck J";
                    case "Thieves' Hideout K":
                        return "Diebesversteck K";
                    case "Thieves' Hideout L":
                        return "Diebesversteck L";
                    case "Thieves' Hideout M":
                        return "Diebesversteck M";
                    case "Thieves' Hideout N":
                        return "Diebesversteck N";
                    // remaining places
                    // grottos
                    case "Heart Piece Grave":
                        return "Herzteil-Grab";
                    case "Royal Family Tomb":
                        return "Königsgrab";
                    case "Shield Grave":
                        return "Schild-Grab";
                    case "Desert Colossus Left Hand":
                        return "Wüstenkoloss linke Hand";
                    case "Desert Colossus Right Hand":
                        return "Wüstenkoloss rechte Hand";
                    case "Storms Grotto":
                        return "Sturm-Grotte";
                    case "Octorok Grotto":
                        return "Oktorok-Grotte";
                    case "Grotto":
                        return "Grotte";
                    case "Open Grotto":
                        return "Offene Grotte";
                    case "Inside Fence Grotto":
                        return "eingezäunte Grotte";
                    case "South-East Grotto":
                        return "Südost-Grotte";
                    case "Cow Grotto":
                        return "Kuh-Grotte";
                    case "Tektite Grotto":
                        return "Arachno-Grotte";
                    case "Fairy Grotto":
                        return "Feen-Brunnen";
                    case "Near Market Grotto":
                        return "Grotte bei Schlossbrücke";
                    case "Near Kakariko Grotto":
                        return "Grotte bei Kakariko";
                    case "Redead Grotto":
                        return "Zombie-Grotte";
                    case "Lost Woods Bridge Kokiri Side":
                        return "Verlorene Wälder Brücke Kokiri-Seite";
                    case "Lost Woods Main Entrance":
                        return "Verlorene Wälder Haupteingang";
                    case "Outside Ganon's Castle Great Fairy":
                        return "Ganons Schloss Feen-Quelle";
                    case "Outside Ganon's Castle":
                        return "Ganons Schloss (außen)";
                    case "DMT Storms Grotto":
                        return "TB Sturm-Grotte";
                    case "DMT Great Fairy":
                        return "TB Feen-Quelle";
                    case "DMC Great Fairy":
                        return "TK Feen-Quelle";
                    case "Kokiri Forest Main Entrance":
                        return "Kokiri-Wald Haupteingang";
                    case "Kokiri Forest Upper Entrance":
                        return "Kokiri-Wald oberer Eingang";
                    case "Scrubs Grotto":
                        return "Händler-Deku-Grotte";
                    case "Near Shortcuts Grotto":
                        return "Grotte bei Goronia";
                    case "Wolfos Grotto":
                        return "Zombie-Grotte";
                    case "Spirit Temple Left Hand":
                        return "Zombie-Grotte";
                    case "Spirit Temple Right Hand":
                        return "Zombie-Grotte";
                    // cow check list dialog
                    case "HF Cow Grotto":
                        return "HS Kuh-Grotte";
                    case "Stable Left":
                        return "Stall links";
                    case "Stable Right":
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
                    // items
                    case "Deku Stick":
                        return "Deku-Stab";
                    case "Deku Stick Upgrade":
                        return "Deku-Stab-Upgrade";
                    case "Deku Nuts":
                        return "Deku-Nüsse";
                    case "Deku Nut Upgrade":
                        return "Deku-Nuss-Upgrade";
                    case "Progressive Slingshot":
                        return "Feenschleuder/Deku-Kern-Tasche";
                    case "Bombs":
                        return "Bomben";
                    case "Progressive Bomb Bag":
                        return "Bombentasche";
                    case "Bombchus":
                        return "Krabbelminen";
                    case "Boomerang":
                        return "Bumerang";
                    case "Progressive Ocarina":
                        return "Okarina";
                    case "Magic Beans":
                        return "Wundererbsen";
                    case "Progressive Bow":
                        return "Feen-Bogen/Köcher";
                    case "Fire Arrows":
                        return "Feuerpfeile";
                    case "Ice Arrows":
                        return "Eispfeile";
                    case "Light Arrows":
                        return "Lichtpfeile";
                    case "Progressive Hookshot":
                        return "Fanghaken/Enterhaken";
                    case "Megaton Hammer":
                        return "Stahlhammer";
                    case "Lens of Truth":
                        return "Auge der Wahrheit";
                    case "Din's Fire":
                        return "Dins Feuerinferno";
                    case "Farore's Wind":
                        return "Farores Donnersturm";
                    case "Nayru's Love":
                        return "Nayrus Umarmung";
                    case "Kokiri Sword":
                        return "Kokiri-Schwert";
                    case "Master Sword":
                        return "Master-Schwert";
                    case "Giant's Knife":
                        return "Langschwert";
                    case "Biggoron's Sword":
                        return "Biggoron-Schwert";
                    case "Deku Shield":
                        return "Deku-Schild";
                    case "Hylian Shield":
                        return "Hylia-Schild";
                    case "Mirror Shield":
                        return "Spiegel-Schild";
                    case "Goron Tunic":
                        return "Goronen-Rüstung";
                    case "Zora Tunic":
                        return "Zora-Rüstung";
                    case "Iron Boots":
                        return "Eisenstiefel";
                    case "Hover Boots":
                        return "Gleitstiefel";
                    case "Progressive Strength":
                        return "Stärke-Upgrade";
                    case "Progressive Scale":
                        return "Silberschuppe/Goldschuppe";
                    case "Progressive Wallet":
                        return "Geldbörse";
                    case "Gerudo Membership Card":
                        return "Gerudo-Pass";
                    case "Stone of Agony":
                        return "Stein des Wissens";
                    case "Bottle":
                        return "Flasche";
                    case "Bottle with Ruto's Letter":
                        return "Flasche mit Rutos Brief";
                    case "Bottle with Milk":
                        return "Flasche mit Milch";
                    case "Bottle with half Milk":
                        return "Flasche mit halber Milch";
                    case "Bottle with Red Potion":
                        return "Flasche mit rotem Elixir";
                    case "Bottle with Green Potion":
                        return "Flasche mit grünem Elixir";
                    case "Bottle with Blue Potion":
                        return "Flasche mit blauem Elixir";
                    case "Bottle with Fairy":
                        return "Flasche mit Fee";
                    case "Bottle with Blue Fire":
                        return "Flasche mit blauem Feuer";
                    case "Bottle with Fish":
                        return "Flasche mit Fisch";
                    case "Bottle with Bugs":
                        return "Flasche mit Käfern";
                    case "Bottle with Poe":
                        return "Flasche mit Irrlicht";
                    case "Bottle with Big Poe":
                        return "Flasche mit Nachtschwärmer";
                    case "Piece of Heart":
                        return "Herzteil";
                    case "Recovery Heart":
                        return "Herz";
                    case "Small Magic Jar":
                        return "Kleine Magieflasche";
                    case "Large Magic Jar":
                        return "Große Magieflasche";
                    case "Progressive Magic":
                        return "Magie";
                    case "Deku Seeds":
                        return "Deku-Kerne";
                    case "Arrows":
                        return "Pfeile";
                    case "Green Rupee":
                        return "Grüner Rubin";
                    case "Blue Rupee":
                        return "Blauer Rubin";
                    case "Red Rupee":
                        return "Roter Rubin";
                    case "Purple Rupee":
                        return "Violetter Rubin";
                    case "Silver Rupee":
                        return "Silberner Rubin";
                    case "Yellow Rupee":
                        return "Gelber Rubin";
                    case "Orange Rupee":
                        return "Oranger Rubin";
                    case "Skulltula Token":
                        return "Skulltula-Symbol";
                    case "Ice Trap":
                        return "Eis-Falle";
                    case "Dungeon Map Deku Tree":
                        return "Karte Deku-Baum";
                    case "Dungeon Map Dodongo's Cavern":
                        return "Karte Dodongos Höhle";
                    case "Dungeon Map Jabu-Jabu":
                        return "Karte Jabu-Jabu";
                    case "Dungeon Map Forest Temple":
                        return "Karte Waldtempel";
                    case "Dungeon Map Fire Temple":
                        return "Karte Feuertempel";
                    case "Dungeon Map Water Temple":
                        return "Karte Wassertempel";
                    case "Dungeon Map Ice Cavern":
                        return "Karte Eishöhle";
                    case "Dungeon Map Bottom of the Well":
                        return "Karte Grund des Brunnens";
                    case "Dungeon Map Shadow Temple":
                        return "Karte Schattentempel";
                    case "Dungeon Map Spirit Temple":
                        return "Karte Geistertempel";
                    case "Compass Deku Tree":
                        return "Kompass Deku-Baum";
                    case "Compass Dodongo's Cavern":
                        return "Kompass Dodongos Höhle";
                    case "Compass Jabu-Jabu":
                        return "Kompass Jabu-Jabu";
                    case "Compass Forest Temple":
                        return "Kompass Waldtempel";
                    case "Compass Fire Temple":
                        return "Kompass Feuertempel";
                    case "Compass Water Temple":
                        return "Kompass Wassertempel";
                    case "Compass Ice Cavern":
                        return "Kompass Eishöhle";
                    case "Compass Bottom of the Well":
                        return "Kompass Grund des Brunnens";
                    case "Compass Shadow Temple":
                        return "Kompass Schattentempel";
                    case "Compass Spirit Temple":
                        return "Kompass Geistertempel";
                    case "Small Key Forest Temple":
                        return "Kleiner Schlüssel Waldtempel";
                    case "Small Key Fire Temple":
                        return "Kleiner Schlüssel Feuertempel";
                    case "Small Key Water Temple":
                        return "Kleiner Schlüssel Wassertempel";
                    case "Small Key Ice Cavern":
                        return "Kleiner Schlüssel Eishöhle";
                    case "Small Key Bottom of the Well":
                        return "Kleiner Schlüssel Grund des Brunnens";
                    case "Small Key Shadow Temple":
                        return "Kleiner Schlüssel Schattentempel";
                    case "Small Key Spirit Temple":
                        return "Kleiner Schlüssel Geistertempel";
                    case "Small Key Gerudo Training Ground":
                        return "Kleiner Schlüssel Gerudo-Arena";
                    case "Boss Key Forest Temple":
                        return "Großer Schlüssel Waldtempel";
                    case "Boss Key Fire Temple":
                        return "Großer Schlüssel Feuertempel";
                    case "Boss Key Water Temple":
                        return "Großer Schlüssel Wassertempel";
                    case "Boss Key Shadow Temple":
                        return "Großer Schlüssel Schattentempel";
                    case "Boss Key Spirit Temple":
                        return "Großer Schlüssel Geistertempel";
                    case "Small Key Ganon's Castle":
                        return "Kleiner Schlüssel Ganons Schloss";
                    case "Boss Key Ganon's Castle":
                        return "Großer Schlüssel Ganons Schloss";
                    case "Heart Container":
                        return "Herzcontainer";
                    case "Keaton Mask":
                        return "Fuchs-Maske";
                    case "Skull Mask":
                        return "Schädel-Maske";
                    case "Spooky Mask":
                        return "Geister-Maske";
                    case "Bunny Hood":
                        return "Hasenohren";
                    case "Mask of Truth":
                        return "Maske des Wissens";
                    case "Goron Mask":
                        return "Goronen-Maske";
                    case "Zora Mask":
                        return "Zora-Maske";
                    case "Gerudo Mask":
                        return "Gerudo-Maske";
                    case "Pocket Egg":
                        return "Ei";
                    case "Pocket Cucco":
                        return "Kiki";
                    case "Cojiro":
                        return "Henni";
                    case "Odd Mushroom":
                        return "Schimmelpilz";
                    case "Odd Potion":
                        return "Modertrank";
                    case "Poacher's Saw":
                        return "Säge";
                    case "Broken Goron's Sword":
                        return "Goronen-Schwert (zerbrochen)";
                    case "Prescription":
                        return "Rezept";
                    case "Eyeball Frog":
                        return "Augen-Frosch"; // ToDo
                    case "Eye Drops":
                        return "Augentropfen"; // ToDo
                    case "Claim Check":
                        return "Zertifikat"; // ToDo
                    case "Kokiri's Emerald":
                        return "Kokiri-Smaragd";
                    case "Goron's Ruby":
                        return "Goronen-Opal";
                    case "Zora's Sapphire":
                        return "Zora-Saphir";
                    case "Light Medallion":
                        return "Amulett des Lichts";
                    case "Forest Medallion":
                        return "Amulett des Waldes";
                    case "Fire Medallion":
                        return "Amulett des Feuers";
                    case "Water Medallion":
                        return "Amulett des Wassers";
                    case "Shadow Medallion":
                        return "Amulett des Schattens";
                    case "Spirit Medallion":
                        return "Amulett der Geister";
                    case "Weird Egg":
                        return "Seltsames Ei";
                    case "Cucco":
                        return "Huhn";
                    case "Zelda's Letter":
                        return "Zeldas Brief";
                    case "Kokiri Boots":
                        return "Lederstiefel";
                    case "Kokiri Tunic":
                        return "Kokiri-Rüstung";
                    case "Zelda's Lullaby":
                        return "Zeldas Wiegenlied";
                    case "Epona's Song":
                        return "Eponas Lied";
                    case "Saria's Song":
                        return "Salias Lied";
                    case "Sun's Song":
                        return "Hymne der Sonne";
                    case "Song of Time":
                        return "Hymne der Zeit";
                    case "Song of Storms":
                        return "Hymne des Sturms";
                    case "Minuet of Forest":
                        return "Menuett des Waldes";
                    case "Bolero of Fire":
                        return "Bolero des Feuers";
                    case "Serenade of Water":
                        return "Serenade des Wassers";
                    case "Nocturne of Shadow":
                        return "Nocturne des Schattens";
                    case "Requiem of Spirit":
                        return "Requiem der Geister";
                    case "Prelude of Light":
                        return "Kantate des Lichts";
                    case "Scarecrow's Song":
                        return "Vogelscheuchen-Polka";
                    case "Double Hearts":
                        return "Doppelte Herzen"; // ToDo
                    case "Milk":
                        return "Milch"; // ToDo
                    case "Half Milk":
                        return "Halbe Milch"; // ToDo
                    case "Red Potion":
                        return "Rotes Elixir";
                    case "Green Potion":
                        return "Grünes Elixir";
                    case "Blue Potion":
                        return "Blaues Elixir";
                    case "Fairy":
                        return "Fee";
                    case "Blue Fire":
                        return "Blaues Feuer";
                    case "Fish":
                        return "Fisch";
                    case "Bugs":
                        return "Käfer";
                    case "Poe":
                        return "Irrlicht";
                    // shopItemPanel
                    case "Empty":
                        return "Leer";
                    case " for ":
                        return " für ";
                    case "rupees":
                        return "Rubine";
                    case "(normal)":
                        return "(Normal)";
                    case "(special deal!)":
                        return "(Sonderangebot!)";
                    // AddItem
                    case "Add new item":
                        return "Neuen Gegenstand hinzufügen";
                    case "Is this a \"normal\"" + br + "or a special deal?":
                        return "Ist dies ein \"normales\"" + br + "oder ein Sonderangebot?";
                    case "Normal":
                        return "Normal";
                    case "Special Deal!":
                        return "Sonderangebot!";
                    case "Select item":
                        return "Gegenstand wählen";
                    case "Set amount / cost":
                        return "Anzahl / Preis angeben";
                    case "Amount:":
                        return "Anzahl:";
                    case "Cost:":
                        return "Preis:";
                    default:
                        return englishString;
                }
            default:
                throw new IllegalStateException("Illegal value for translation: " + this);
        }
    }

    public static String toEnglish(final String input) {
        switch (input) {
            // place with map
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
            case "Schloss Hyrule":
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
            // ages
            case "Kind":
                return "Child";
            case "Erwachsener":
                return "Adult";
            // perspectives
            case "Seite":
                return "Side";
            case "Oben":
                return "Top";
            // doors
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
            case "Schloss Hyrule Feen-Quelle":
                return "Hyrule Castle Great Fairy";
            case "Ganons Schloss Feen-Quelle":
                return "Ganon's Castle Great Fairy";
            case "Talons Haus/Superhühner":
                return "Talon's House";
            case "Stall":
                return "Stable";
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
            // grottos
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
            case "Schloss Hyrule Sturm-Grotte":
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
            // zoom area transition names
            case "Gerudo-Festung B":
                return "Gerudo's Fortress B";
            case "Gerudo-Festung C":
                return "Gerudo's Fortress C";
            case "Gerudo-Festung D":
                return "Gerudo's Fortress D";
            case "Gerudo-Festung E":
                return "Gerudo's Fortress E";
            case "Gerudo-Festung F":
                return "Gerudo's Fortress F";
            case "Gerudo-Festung G":
                return "Gerudo's Fortress G";
            case "Gerudo-Festung H":
                return "Gerudo's Fortress H";
            case "Gerudo-Festung I":
                return "Gerudo's Fortress I";
            case "Gerudo-Festung J":
                return "Gerudo's Fortress J";
            case "Gerudo-Festung K":
                return "Gerudo's Fortress K";
            case "Gerudo-Festung L":
                return "Gerudo's Fortress L";
            case "Gerudo-Festung M":
                return "Gerudo's Fortress M";
            case "Gerudo-Festung N":
                return "Gerudo's Fortress N";
            case "Diebesversteck B":
                return "Thieves' Hideout B";
            case "Diebesversteck C":
                return "Thieves' Hideout C";
            case "Diebesversteck D":
                return "Thieves' Hideout D";
            case "Diebesversteck E":
                return "Thieves' Hideout E";
            case "Diebesversteck F":
                return "Thieves' Hideout F";
            case "Diebesversteck G":
                return "Thieves' Hideout G";
            case "Diebesversteck H":
                return "Thieves' Hideout H";
            case "Diebesversteck I":
                return "Thieves' Hideout I";
            case "Diebesversteck J":
                return "Thieves' Hideout J";
            case "Diebesversteck K":
                return "Thieves' Hideout K";
            case "Diebesversteck L":
                return "Thieves' Hideout L";
            case "Diebesversteck M":
                return "Thieves' Hideout M";
            case "Diebesversteck N":
                return "Thieves' Hideout N";
            // remaining places
            // grottos
            case "Herzteil-Grab":
                return "Heart Piece Grave";
            case "Königsgrab":
                return "Royal Family Tomb";
            case "Schild-Grab":
                return "Shield Grave";
            // languages
            case "Englisch":
                return "English";
            case "Deutsch":
                return "German";
            // items
            case "Deku-Stab":
                return "Deku Stick";
            case "Deku-Stab-Upgrade":
                return "Deku Stick Upgrade";
            case "Deku-Nüsse":
                return "Deku Nuts";
            case "Deku-Nuss-Upgrade":
                return "Deku Nut Upgrade";
            case "Feenschleuder/Deku-Kern-Tasche":
                return "Progressive Slingshot";
            case "Bomben":
                return "Bombs";
            case "Bombentasche":
                return "Progressive Bomb Bag";
            case "Krabbelminen":
                return "Bombchus";
            case "Bumerang":
                return "Boomerang";
            case "Okarina":
                return "Progressive Ocarina";
            case "Wundererbsen":
                return "Magic Beans";
            case "Feen-Bogen/Köcher":
                return "Progressive Bow";
            case "Feuerpfeile":
                return "Fire Arrows";
            case "Eispfeile":
                return "Ice Arrows";
            case "Lichtpfeile":
                return "Light Arrows";
            case "Fanghaken/Enterhaken":
                return "Progressive Hookshot";
            case "Stahlhammer":
                return "Megaton Hammer";
            case "Auge der Wahrheit":
                return "Lens of Truth";
            case "Dins Feuerinferno":
                return "Din's Fire";
            case "Farores Donnersturm":
                return "Farore's Wind";
            case "Nayrus Umarmung":
                return "Nayru's Love";
            case "Kokiri-Schwert":
                return "Kokiri Sword";
            case "Master-Schwert":
                return "Master Sword";
            case "Langschwert":
                return "Giant's Knife";
            case "Biggoron-Schwert":
                return "Biggoron's Sword";
            case "Deku-Schild":
                return "Deku Shield";
            case "Hylia-Schild":
                return "Hylian Shield";
            case "Spiegel-Schild":
                return "Mirror Shield";
            case "Goronen-Rüstung":
                return "Goron Tunic";
            case "Zora-Rüstung":
                return "Zora Tunic";
            case "Eisenstiefel":
                return "Iron Boots";
            case "Gleitstiefel":
                return "Hover Boots";
            case "Stärke-Upgrade":
                return "Progressive Strength";
            case "Silberschuppe/Goldschuppe":
                return "Progressive Scale";
            case "Geldbörse":
                return "Progressive Wallet";
            case "Gerudo-Pass":
                return "Gerudo Membership Card";
            case "Stein des Wissens":
                return "Stone of Agony";
            case "Flasche":
                return "Bottle";
            case "Flasche mit Rutos Brief":
                return "Bottle with Ruto's Letter";
            case "Flasche mit Milch":
                return "Bottle with Milk";
            case "Flasche mit halber Milch":
                return "Bottle with half Milk";
            case "Flasche mit rotem Elixir":
                return "Bottle with Red Potion";
            case "Flasche mit grünem Elixir":
                return "Bottle with Green Potion";
            case "Flasche mit blauem Elixir":
                return "Bottle with Blue Potion";
            case "Flasche mit Fee":
                return "Bottle with Fairy";
            case "Flasche mit blauem Feuer":
                return "Bottle with Blue Fire";
            case "Flasche mit Fisch":
                return "Bottle with Fish";
            case "Flasche mit Käfern":
                return "Bottle with Bugs";
            case "Flasche mit Irrlicht":
                return "Bottle with Poe";
            case "Flasche mit Nachtschwärmer":
                return "Bottle with Big Poe";
            case "Herzteil":
                return "Piece of Heart";
            case "Herz":
                return "Recovery Heart";
            case "Kleine Magieflasche":
                return "Small Magic Jar";
            case "Große Magieflasche":
                return "Large Magic Jar";
            case "Magie":
                return "Progressive Magic";
            case "Deku-Kerne":
                return "Deku Seeds";
            case "Pfeile":
                return "Arrows";
            case "Grüner Rubin":
                return "Green Rupee";
            case "Blauer Rubin":
                return "Blue Rupee";
            case "Roter Rubin":
                return "Red Rupee";
            case "Violetter Rubin":
                return "Purple Rupee";
            case "Silberner Rubin":
                return "Silver Rupee";
            case "Gelber Rubin":
                return "Yellow Rupee";
            case "Oranger Rubin":
                return "Orange Rupee";
            case "Skulltula-Symbol":
                return "Skulltula Token";
            case "Eis-Falle":
                return "Ice Trap";
            case "Karte Deku-Baum":
                return "Dungeon Map Deku Tree";
            case "Karte Dodongos Höhle":
                return "Dungeon Map Dodongo's Cavern";
            case "Karte Jabu-Jabu":
                return "Dungeon Map Jabu-Jabu";
            case "Karte Waldtempel":
                return "Dungeon Map Forest Temple";
            case "Karte Feuertempel":
                return "Dungeon Map Fire Temple";
            case "Karte Wassertempel":
                return "Dungeon Map Water Temple";
            case "Karte Eishöhle":
                return "Dungeon Map Ice Cavern";
            case "Karte Grund des Brunnens":
                return "Dungeon Map Bottom of the Well";
            case "Karte Schattentempel":
                return "Dungeon Map Shadow Temple";
            case "Karte Geistertempel":
                return "Dungeon Map Spirit Temple";
            case "Kompass Deku-Baum":
                return "Compass Deku Tree";
            case "Kompass Dodongos Höhle":
                return "Compass Dodongo's Cavern";
            case "Kompass Jabu-Jabu":
                return "Compass Jabu-Jabu";
            case "Kompass Waldtempel":
                return "Compass Forest Temple";
            case "Kompass Feuertempel":
                return "Compass Fire Temple";
            case "Kompass Wassertempel":
                return "Compass Water Temple";
            case "Kompass Eishöhle":
                return "Compass Ice Cavern";
            case "Kompass Grund des Brunnens":
                return "Compass Bottom of the Well";
            case "Kompass Schattentempel":
                return "Compass Shadow Temple";
            case "Kompass Geistertempel":
                return "Compass Spirit Temple";
            case "Kleiner Schlüssel Waldtempel":
                return "Small Key Forest Temple";
            case "Kleiner Schlüssel Feuertempel":
                return "Small Key Fire Temple";
            case "Kleiner Schlüssel Wassertempel":
                return "Small Key Water Temple";
            case "Kleiner Schlüssel Eishöhle":
                return "Small Key Ice Cavern";
            case "Kleiner Schlüssel Grund des Brunnens":
                return "Small Key Bottom of the Well";
            case "Kleiner Schlüssel Schattentempel":
                return "Small Key Shadow Temple";
            case "Kleiner Schlüssel Geistertempel":
                return "Small Key Spirit Temple";
            case "Kleiner Schlüssel Gerudo-Arena":
                return "Small Key Gerudo Training Ground";
            case "Großer Schlüssel Waldtempel":
                return "Boss Key Forest Temple";
            case "Großer Schlüssel Feuertempel":
                return "Boss Key Fire Temple";
            case "Großer Schlüssel Wassertempel":
                return "Boss Key Water Temple";
            case "Großer Schlüssel Schattentempel":
                return "Boss Key Shadow Temple";
            case "Großer Schlüssel Geistertempel":
                return "Boss Key Spirit Temple";
            case "Kleiner Schlüssel Ganons Schloss":
                return "Small Key Ganon's Castle";
            case "Großer Schlüssel Ganons Schloss":
                return "Boss Key Ganon's Castle";
            case "Herzcontainer":
                return "Heart Container";
            case "Fuchs-Maske":
                return "Keaton Mask";
            case "Schädel-Maske":
                return "Skull Mask";
            case "Geister-Maske":
                return "Spooky Mask";
            case "Hasenohren":
                return "Bunny Hood";
            case "Maske des Wissens":
                return "Mask of Truth";
            case "Goronen-Maske":
                return "Goron Mask";
            case "Zora-Maske":
                return "Zora Mask";
            case "Gerudo-Maske":
                return "Gerudo Mask";
            case "Ei":
                return "Pocket Egg";
            case "Kiki":
                return "Pocket Cucco";
            case "Henni":
                return "Cojiro";
            case "Schimmelpilz":
                return "Odd Mushroom";
            case "Modertrank":
                return "Odd Potion";
            case "Säge":
                return "Poacher's Saw";
            case "Goronen-Schwert (zerbrochen)":
                return "Broken Goron's Sword";
            case "Rezept":
                return "Prescription";
            case "Augen-Frosch":
                return "Eyeball Frog";
            case "Augentropfen":
                return "Eye Drops";
            case "Zertifikat":
                return "Claim Check";
            case "Kokiri-Smaragd":
                return "Kokiri's Emerald";
            case "Goronen-Opal":
                return "Goron's Ruby";
            case "Zora-Saphir":
                return "Zora's Sapphire";
            case "Amulett des Lichts":
                return "Light Medallion";
            case "Amulett des Waldes":
                return "Forest Medallion";
            case "Amulett des Feuers":
                return "Fire Medallion";
            case "Amulett des Wassers":
                return "Water Medallion";
            case "Amulett des Schattens":
                return "Shadow Medallion";
            case "Amulett der Geister":
                return "Spirit Medallion";
            case "Seltsames Ei":
                return "Weird Egg";
            case "Huhn":
                return "Cucco";
            case "Zeldas Brief":
                return "Zelda's Letter";
            case "Lederstiefel":
                return "Kokiri Boots";
            case "Kokiri-Rüstung":
                return "Kokiri Tunic";
            case "Zeldas Wiegenlied":
                return "Zelda's Lullaby";
            case "Eponas Lied":
                return "Epona's Song";
            case "Salias Lied":
                return "Saria's Song";
            case "Hymne der Sonne":
                return "Sun's Song";
            case "Hymne der Zeit":
                return "Song of Time";
            case "Hymne des Sturms":
                return "Song of Storms";
            case "Menuett des Waldes":
                return "Minuet of Forest";
            case "Bolero des Feuers":
                return "Bolero of Fire";
            case "Serenade des Wassers":
                return "Serenade of Water";
            case "Nocturne des Schattens":
                return "Nocturne of Shadow";
            case "Requiem der Geister":
                return "Requiem of Spirit";
            case "Kantate des Lichts":
                return "Prelude of Light";
            case "Vogelscheuchen-Polka":
                return "Scarecrow's Song";
            case "Doppelte Herzen":
                return "Double Hearts";
            case "Milch":
                return "Milk";
            case "Halbe Milch":
                return "Half Milk";
            case "Rotes Elixir":
                return "Red Potion";
            case "Grünes Elixir":
                return "Green Potion";
            case "Blaues Elixir":
                return "Blue Potion";
            case "Fee":
                return "Fairy";
            case "Blaues Feuer":
                return "Blue Fire";
            case "Fisch":
                return "Fish";
            case "Käfer":
                return "Bugs";
            case "Irrlicht":
                return "Poe";
            default:
                return input;
        }
    }
}
