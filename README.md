# Ocarina of Time Maps
## About
Ocarina of Time Maps (also 'OoTM', 'OoT Maps' or 'ootm') is a simple Ocarina of Time map tool for use with a loading zone randomizer.

It allows the recording and display of transition destinations and features maps for all overworld places, dungeons and some special areas like the "Kakariko Potion Shop" (which connects two doors in Kakariko Village) or "Dampe's Grave".

OoTM is optimized for the randomization rules and glitchless logic implemented in the randomizer on [OoTRandomizer.com](https://ootrandomizer.com). This means that for example "Side Alley" is inseparable from "Market", while "Market Entrance" (the single screen between the castle bridge and the market) and "Temple of Time Entrance" (the small path before the temple) are individual overworld areas and the "Carpenter Tent" is not supposed to be accessed as child. The transition from Gerudo Valley through the river to Lake Hylia, the Spirit Temple hand transitions, the Castle Garden entrance and the Thieves' Hideout transitions are always connected to their normal exits.

## Screenshots
Example for a connected entrance (in this case Dampe's House leads to the Temple of Time)

<img src="https://raw.githubusercontent.com/SiriusGG/ootm/gh-pages/www/graphics/connected.png" alt="Example connection" width="620"/>

Features child and adult maps (left side Kakariko as child, right side Kakariko as adult)

<img src="https://raw.githubusercontent.com/SiriusGG/ootm/gh-pages/www/graphics/kak_child.png" alt="Kakariko as child" width="310"/> <img src="https://raw.githubusercontent.com/SiriusGG/ootm/gh-pages/www/graphics/kak_adult.png" alt="Kakariko as adult" width="310"/>

And side and top perspective maps for all locations

<img src="https://raw.githubusercontent.com/SiriusGG/ootm/gh-pages/www/graphics/water_side.png" alt="Water Temple side perspective" width="310"/> <img src="https://raw.githubusercontent.com/SiriusGG/ootm/gh-pages/www/graphics/water_top.png" alt="Water Temple top perspective" width="310"/>

Adding a conection is super easy, just click on any connection and you see a list of all transitions that make sense.

<img src="https://raw.githubusercontent.com/SiriusGG/ootm/gh-pages/www/graphics/set_exit.png" alt="Set an exit" width="620"/>

And adding the way back

<img src="https://raw.githubusercontent.com/SiriusGG/ootm/gh-pages/www/graphics/way_back.png" alt="Way back" width="300"/>

## Download
You can always find the latest stable, tested release on [OoTM's GitHub Releases page](https://github.com/SiriusGG/ootm/releases/latest).

## Installation
### Option 1: Just use the tool
0. Download and install [the Java Runtime Environment (JRE)](https://www.oracle.com/java/technologies/downloads) (JRE 8 is recommended).
1. Execute ```OoTM.jar``` from anywhere, either by simply double-clicking ```OoTM.jar``` or by running ```java -jar OoTM.jar``` in your terminal.
### Option 2: Build from source
0. Download and install [git](https://git-scm.com/downloads) and [the Java Development Kit (JDK)](https://www.oracle.com/java/technologies/downloads) (JDK 8 is the recommended LTS version until at least December of 2030).
1. Clone this repository by entering ```git clone https://github.com/SiriusGG/ootm.git``` into the terminal.
2. Open up the project in any IDE.
3. Make sure that ```src/main/java``` is set as the classes root.
4. Build and/or run ```Starter.main()```.

## Special thanks
- Peardian and [VGMaps.com](https://vgmaps.com) for their amazing map database
- [Ship of Harkinian](https://github.com/HarbourMasters/Shipwright) (An OoT PC port which I used for some high-res screenshots to cut out a grotto, an overworld tree in Hyrule Field, the entrance to Dodongo's Cavern, an entrance into the Thieves' Hideout, a door in Kakariko and three quarters of Link's house)

## Possible additions in future versions
- Include house maps and grotto maps
- Include Guard Stealth Passage and Castle Garden
- Include blue warps / cutscene warps
- "Mixed connection types" option, where connections don't depend on the connection type
- option to show non-intended connections (worker's tent as child, ice cavern as child, jabu as adult...)

## Translations
Currently this software is available in English and German only.\
However, due to planning in advance, we can easily add as many languages as we like!

If you speak either English or German and any other language and would like to help translate this software there are 2 options:
- If you are a regular user, you can contact me at contact@siriusgg.com and we'll figure out something.
- If you are a developer you can directly [create a pull request](https://github.com/SiriusGG/ootm/compare) to add a language in the package ```src/main/java/com/siriusgg/oot/translation```.

## About Forks, Branches and Maintenance
While OoTM is open source with the "The Unlicense" license, it is [published, hosted and centralized on GitHub](https://github.com/SiriusGG/ootm). It is highly endorsed that if you fork this repository to add new features that you also create a pull request to share the improvements with everyone. Please also delete forks and branches when they are succesfully merged back into this repository. This way people don't stumble upon outdated versions and always find the latest stable version right here. [Issues (which also include feature suggestions) may be opened by anyone on the GitHub Issues page](https://github.com/SiriusGG/ootm/issues).
