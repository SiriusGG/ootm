# Ocarina of Time Maps
## About
Ocarina of Time Maps (also 'OoTM', 'OoT Maps' or 'ootm') is a simple Ocarina of Time map tool for use with a loading zone randomizer.

It allows the recording and display of transition destinations and features maps for all overworld places, dungeons and some special areas like the "Kakariko Potion Shop" (which connects two doors in Kakariko Village) or "Dampe's Grave".

OoTM is optimized for the randomization rules and glitchless logic implemented in the randomizer on [OoTRandomizer.com](https://ootrandomizer.com). This means that for example "Side Alley" is inseparable from "Market", while "Market Entrance" (the single screen between the castle bridge and the market) and "Temple of Time Entrance" (the small path before the temple) are individual overworld areas and the "Carpenter Tent" is not supposed to be accessed as child. The transition from Gerudo Valley through the river to Lake Hylia, the Spirit Temple hand transitions, the Castle Garden entrance and the Thieves' Hideout transitions are always connected to their normal exits.

## Screenshots
Placeholder lol

## Download
You can always find the latest stable, tested release on [OoTM's GitHub Releases page](https://github.com/SiriusGG/ootm/releases/latest).

## Installation
### Option 1: Just use the tool
0. Download and install [the latest Java Runtime Environment (JRE)](https://www.oracle.com/java/technologies/downloads) (JRE 8 is recommended).
1. Execute ```OoTM.jar``` from anywhere, either by simply double-clicking ```OoTM.jar``` or by running ```java -jar OoTM.jar``` in your terminal.
### Option 2: Build from source
0. Download and install [the latest Java Development Kit (JDK)](https://www.oracle.com/java/technologies/downloads) (JDK 8 is the recommended LTS version until at least December of 2030) and [git](https://git-scm.com/downloads).
1. Clone this repository by entering ```git clone https://github.com/SiriusGG/ootm.git``` into the terminal.
2. Open up the project in any IDE.
3. Make sure that ```src/main/java``` is set as the classes root.
4. Build and/or run ```Starter.main()```.

## Special thanks
- Peardian and [VGMaps.com](https://vgmaps.com) for their amazing map database
- [Ship of Harkinian](https://github.com/HarbourMasters/Shipwright) (An OoT PC port which I used for some high-res screenshots to cut out a grotto, an overworld tree in Hyrule Field, the entrance to Dodongo's Cavern, an entrance into the Thieves' Hideout, a door in Kakariko and three quarters of Link's house)

## Possible additions in future versions
- Pathfinding
  - you enter a target location and an algorithm tells you at least one way how to get there
  - "way with fewest transitions" would be easy to implement
  - "shortest way" (real time) would be hard to judge and implement due to ways between transitions taking differently long
- Include house maps and grotto maps
- Include Guard Stealth Passage and Castle Garden
- Include blue warps / cutscene warps

## About Forks, Branches and Maintenance
While OoTM is open source with the "The Unlicense" license, it is [published, hosted and centralized on GitHub](https://github.com/SiriusGG/ootm). It is highly endorsed that if you fork this repository to add new features that you also create a pull request to share the improvements with everyone. Please also delete forks and branches when they are succesfully merged back into this repository. This way people don't stumble upon outdated versions and always find the latest stable version right here. [Issues (which also include feature suggestions) may be opened by anyone on the GitHub Issues page](https://github.com/SiriusGG/ootm/issues).
