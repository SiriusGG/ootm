# Commit Prefix  Guide
This guide shall help decide which prefix or prefixes commits should have. Multiple prefixes per commit are allowed. At least one prefix per commit is required.

## FEAT (Feature)
The commit contains progress on or a completed new feature.

## CLAR (Clarity)
The commit tries to make the code more self-explaining and easier to understand. This can for example be achieved by commenting or renaming funtions or variables.

## CS (Code Style)
The commit improves on the code style. This can for example be achieved by refactoring, cleaning up imports, declaring values which can be final as final or reordering attributes and functions.

## DECI (Decision)
The commit handles an unspecified implementation detail. Decisions are almost never easy to make and will most of the time feel wrong for some people while being obviously correct to others. Unfortunately, most of the time an implementation has to go either way. Whenever an unspecified detail is implemented it should be well-documented and have a comment attached explaining why the decision was made as it is in the context of the structure of the software or the logical implications in Ocarina of Time and the randomizer.

## CHANGE
The commit contains a modification on the software without the heavy implications of DECI. Changes are minor things which are easy to agree on.

## TEST
The commit either handles unit testing or contains experimental code for debugging and development which is not supposed to stay in the final software.

## EXPERIM (Experimental)
The commit contains experimental code which is not supposed to stay in the final software.

## DEV (Development)
The commit contains code for debugging and development which is not supposed to stay in the final software.

## IMPR (Improvement)
The commit contains an improvement for something already existing, making it either faster, more secure, more stable or is removing a redundancy.

## PREP (Preparation)
The commit handles one or more preparations to preemptively reduce the work amount of upcoming commits or avoid unresolved symbols between two commits where functions are relocated.

## FIX
The commit fixes an objectively wrong behaviour, typo or file.

## UI (User Interface)
The commit improves on the (graphical) user interface.

## UE (User Experience)
The commit improves on how the software is handled by the user. This may include automation of certain tasks in replacement of manual user input.

## DOC (Documentation)
The commit either adds or corrects the documentation of this project.

## COM (Comment)
Nothing except comments is changed in the commit.

## DEL (Deletion)
The commit handles the deletion of obsolete files.

## MOVE
The commit handles the moving of files to different places in order to improve the project structure. This includes renaming files.

## WEB (Web-presence related)
The commit either changes the README.md file, this file or anything related to GitHub pages, the repository appearance or the CNAME file.

## GRAPHICS
The commit changes something about the graphics files of this software.
