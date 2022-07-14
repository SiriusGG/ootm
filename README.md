# ootm
"Ocarina of Time Maps" or OoTM (also ootm) is a simple Ocarina of Time map tool for use with a loading zone randomizer.

It allows the recording and display of transition destinations and features maps for all overworld places, dungeons and some special areas like the "Kakariko Magic Potion Shop" (which connects two door exits) or "Dampe's Grave" (which connects a grotto exit and "Windmill").

OoTM is optimized for the randomization rules and glitchless logic implemented in the randomizer on [OoTRandomizer.com](https://ootrandomizer.com).

This means that for example "Side Alley" is inseparable from "Market", while "Market Entrance" (the single screen between the castle bridge and the market) and "Temple of Time Entrance" (the small path before the temple) are individual overworld areas and the "Carpenter Tent" is not supposed to be accessed as child.

## Screenshots
Placeholder lol

## Download
You can always find the latest stable, tested release on [OoTM's GitHub Releases page](https://github.com/SiriusGG/ootm/releases/latest).

## Installation
### Option 1: Just use the tool
0. Download and install [the latest Java Runtime Environment (JRE)](https://www.oracle.com/java/technologies/downloads) (JRE 8 is recommended).
1. Execute ```OoTM.jar``` from anywhere, either by simply double-clicking ```OoTM.jar``` or by running ```java -jar OoTM.jar``` in your terminal.
### Option 2: Build from source
0. Download and install [the latest Java Development Kit (JDK)](https://www.oracle.com/java/technologies/downloads) (JDK 8 is recommended).
1. Clone this repository with ```git clone https://github.com/SiriusGG/ootm.git```.
2. Open up the project in any IDE.
3. Make sure that ```src/main/java``` is set as the classes root.
4. Build and/or run ```Starter.main()```.

## Special thanks
- Peardian and [VGMaps.com](https://vgmaps.com) for their amazing map database
- [Ship of Harkinian](https://github.com/HarbourMasters/Shipwright) (An OoT PC port which I used for some high-res screenshots to cut out a grotto, an overworld tree in Hyrule Field, the entrance to Dodongo's Cavern, a door and three quarters of Link's house)
- some unknown guy who ripped the owl picture for the owl transition buttons

## Possible additions in future versions
- Pathfinding
  - you enter a target location and an algorithm tells you at least one way how to get there
  - "way with fewest transitions" would be easy to implement
  - "shortest way" (real time) would be hard to judge and implement due to ways between transitions taking differently long
- Include house maps and grotto maps
- Include Castle Garden
- Include blue warps / cutscene warps

## About Forks, Branches and Maintenance
While OoTM is open source with the "The Unlicense" license, it is [published, hosted and centralized on GitHub](https://github.com/SiriusGG/ootm). It is highly endorsed that if you fork this repository to add new features that you also create a pull request and provide the optimizations to everyone! Please also delete forks and branches when they are succesfully merged back into this repository. This way people don't stumple upon old, outdated or untested versions and always find the latest stable version right here. [Issues (which also include feature suggestions) may be opened by anyone on the GitHub Issues page](https://github.com/SiriusGG/ootm/issues).
