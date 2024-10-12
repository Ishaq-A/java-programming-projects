import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainGame {
    /*
        Author: Joe Yuen, for CS3IOS Project 2021-2022
        block
            0 (townhall)     1(postOffice)      2(cavernseB)
            3(cavernsA)      4 (field)          5(n/a)
            6(field)         7 (exitGate)       8 (field)
    */
    /*
        solvePuzzle()                               :A function will be called when player uses the key at the exit gate.  The function returns true if player has solved the puzzle, false otherwise.

        block_0(String action, string noun)         :A function will be called when player enters the particular block and issue a command.  The function returns "undefined" if the action is invalid
        :                                               each function represents one block in the game world.  The arrangement is listed above
        block_8(String action, string noun)             block_0: means the block with ID 0

        getNextBlock(int currentBlock, String dir)  :get the ID of the block next to the current block in "dir" direction.  currentBlock=ID of currentBlock, dir={north|west|east|south}

        getBlockName(int i)                         :return the name of the block with give an ID (i)

        printBag(String bag[])                      :print out the content of player's bag

        printMap(int playerLocation)                :Given the player's location (in term of block ID), print the map around the player

        start()                                     :The main game loop.  The main component is a while loop that keep reading "action" and "noun" from user input until "exit" is entered

        main()                                      :The main method which create the MainGame object and call the method start to start the game.

    */

    static List<String> bag = new ArrayList<>();

    boolean puzzleSolved = false;

    public static void takeItem(String item) {
        if (bag.size() < 5 && !bag.contains(item)) {
            bag.add(item);
            System.out.println(item + " added to the bag.");
        } else if (bag.contains(item)) {
            System.out.println(item + " already in bag.");
        } else {
            System.out.println("The bag is full - drop an item.");
        }
    }

    public static void dropItem(String item) {
        if (bag.contains(item)) {
            bag.remove(item);
            System.out.println(item + " has been removed.");
        } else {
            System.out.println(item + " is not in the bag.");
        }
    }

    void printBag(List<String> bag) {
        for (String s : bag) {
            System.out.println(s);
        }

        if(bag.size() < 1) {
            System.out.println("There is nothing in the bag.");
        }
    }

    boolean solvePuzzle() {
        int token = 3;
        Scanner in = new Scanner(System.in);
        System.out.println("You have bested the Trials of The Grasses... But now to truly be a Witcher, answer me this!");
        System.out.println("Who does Ithilline's Prophecy speak of...");
        while (token > 0) {

            String ans = in.nextLine();
            if (ans.equalsIgnoreCase("Cirilla of Cintra") || ans.equalsIgnoreCase("Ciri")) {
                System.out.println("That is... Correct. Your child surprise is your destiny... Geralt of Rivia." +
                                   " You may pass, if you posses the medallion.");
                return true;
            } else {
                token -= 1;
                if (token > 0)
                    System.out.println("That is not the answer.  You have a mere " + token + " attempts left... speak wisely.");
            }

        }

        return false;
    }


    String block0(String action, String noun) {
        if (action.equals("check") && noun.equals("block")) {
            return "townHall";
        } else if (action.equals("examine")) {
            //return "ok" if the (1)examining item is valid (2) the command is "examine all".  Otherwise, return "undefined"
            if (noun.equals("all")) {
                System.out.println("1. photo");
                System.out.println("2. paper");
                System.out.println("3. toolboxes");
                System.out.println("4. map");
                System.out.println("5. medallion");
                System.out.println("6. battery");

            } else if (noun.equals("photo")) {
                System.out.println("Photo: A photo of a caverns");
            } else if (noun.equals("paper")) {
                System.out.println("Paper: A notice posted on a message board");
            } else if (noun.equals("map")) {
                System.out.println("A local map, with a mark on cavernsB");
            } else if (noun.equals("medallion")) {
                System.out.println("A medallion from the School of The Wolf");
            } else if (noun.equals("battery")) {
                System.out.println("An AA sized battery");

            } else {
                System.out.println("Item not found");
                return "Item not found";
            }
            return "ok";
        } else if (action.equals("take")) {
            if (noun.equals("photo")) {
                takeItem("photo");
                return "photo";
            } else if (noun.equals("paper")) {
                takeItem("paper");
                return "paper";
            } else if (noun.equals("toolboxes")) {
                takeItem("toolboxes");
                return "toolboxes";
            } else if (noun.equals("map")) {
                takeItem("map");
                return "map";
            } else if (noun.equals("medallion")) {
                takeItem("medallion");
                return "key";
            } else if (noun.equals("battery")) {
                takeItem("battery");
                return "battery";
            } else {
                return "undefined";
            }
        }
        return "undefined";
    }

    String block1(String action, String noun) {
        if (action.equals("check") && noun.equals("block")) {
            return "postOffice";
        }
        return "undefined";
    }

    String block2(String action, String noun) {
        if (action.equals("check") && noun.equals("block")) {
            return "cavernsB";
        }
        return "undefined";
    }

    String block3(String action, String noun) {
        if (action.equals("check") && noun.equals("block")) {
            return "cavernsA";
        }
        return "undefined";
    }

    String block4(String action, String noun) {
        if (action.equals("check") && noun.equals("block")) {
            return "field";
        }
        return "undefined";
    }

    String block5(String action, String noun) {
        if (action.equals("check") && noun.equals("block")) {
            return "n/a";
        }
        return "undefined";
    }

    String block6(String action, String noun) {
        if (action.equals("check") && noun.equals("block")) {
            return "field";
        }
        return "field";
    }

    String block7(String action, String noun) {
        if (action.equals("check") && noun.equals("block")) {
            return "exitGate";
        } else if (action.equals("examine")) {
            if (noun.equals("all")) {
                System.out.println("1. gate");
                System.out.println("2. giant");

            } else if (noun.equals("gate")) {
                System.out.println("The gate is locked");
            } else if (noun.equals("giant")) {
                if (puzzleSolved) {
                    System.out.println("You already solved the puzzle");
                } else if (solvePuzzle()) {
                    puzzleSolved = true;
                } else {
                    System.out.println("Please try again if you know the answer");
                }
            } else {
                System.out.println("Item not found");
            }
        } else if (action.equals("take")) {

            return "undefined";

        } else if (action.equals("use")) {
            //The start method should check if the player has the item to be used first
            if (noun.equals("medallion")) {
                if (puzzleSolved) {

                    return "GameCompleted";
                } else {
                    System.out.println("Talk to the giant first");
                    return "invalid";
                }
            } else {
                System.out.println(noun + " cannot be used here");
            }
        }


        return "undefined";
    }

    String block8(String action, String noun) {
        if (action.equals("check") && noun.equals("block")) {
            return "field";
        }
        return "undefined";
    }


    int getNextBlock(int currentBlock, String direction) {
        int nextBlock = -1;

        if (direction.equals("north")) {
            nextBlock = currentBlock - 3;
            if (nextBlock < 0)
                nextBlock = -1;
        } else if (direction.equals("east")) {
            nextBlock = currentBlock + 1;
            if (nextBlock == 3 || nextBlock == 6 || nextBlock == 9)
                nextBlock = -1;
        } else if (direction.equals("south")) {
            nextBlock = currentBlock + 3;
            if (nextBlock > 8)
                nextBlock = -1;
        } else if (direction.equals("west")) {
            nextBlock = currentBlock - 1;
            if (nextBlock == 2 || nextBlock == 5)
                nextBlock = -1;
        }

        if (nextBlock != -1) {
            if (nextBlock == 0 && block0("check", "block") != "n/a")
                return nextBlock;
            if (nextBlock == 1 && block1("check", "block") != "n/a")
                return nextBlock;
            if (nextBlock == 2 && block2("check", "block") != "n/a")
                return nextBlock;
            if (nextBlock == 3 && block3("check", "block") != "n/a")
                return nextBlock;
            if (nextBlock == 4 && block4("check", "block") != "n/a")
                return nextBlock;
            if (nextBlock == 5 && block5("check", "block") != "n/a")
                return nextBlock;
            if (nextBlock == 6 && block6("check", "block") != "n/a")
                return nextBlock;
            if (nextBlock == 7 && block7("check", "block") != "n/a")
                return nextBlock;
            if (nextBlock == 8 && block8("check", "block") != "n/a")
                return nextBlock;
            nextBlock = -1;
        }
        return nextBlock;
    }

    String getBlockName(int id) {
        String name = "Error";
        if (id == 0) {
            name = block0("check", "block");
        } else if (id == 1) {
            name = block1("check", "block");
        } else if (id == 2) {
            name = block2("check", "block");
        } else if (id == 3) {
            name = block3("check", "block");
        } else if (id == 4) {
            name = block4("check", "block");
        } else if (id == 5) {
            name = block5("check", "block");
        } else if (id == 6) {
            name = block6("check", "block");
        } else if (id == 7) {
            name = block7("check", "block");
        } else if (id == 8) {
            name = block8("check", "block");
        }
        return name;
    }

    void printMap(int playerLocation) {
        if(playerLocation == 0) {
            System.out.println("| Current: Town Hall |      ->      | East: Post Office |");
            System.out.println("          |         ");
            System.out.println("          v         ");
            System.out.println("| South: cavernsA |");
        } else if(playerLocation == 1) {
            System.out.println("| West: Town Hall |      <-      | Current: Post Office |      ->      | East: cavernsB |");
            System.out.println("                                               |         ");
            System.out.println("                                               v         ");
            System.out.println("                                       | South: Field |");
        } else if(playerLocation == 2) {
            System.out.println("| West: Post Office |      <-      | Current: cavernsB |");
            System.out.println("                                               |         ");
            System.out.println("                                               v         ");
            System.out.println("                                    | South: Kaer Mohren |");
        } else if(playerLocation == 3) {
            System.out.println("| North: Town Hall |");
            System.out.println("          ^         ");
            System.out.println("          |         ");
            System.out.println("| Current: CavernsA |      ->      | East: Field |");
            System.out.println("          |         ");
            System.out.println("          v         ");
            System.out.println("  | South: Field |");
        } else if(playerLocation == 4) {
            System.out.println("                               | North: Post Office |");
            System.out.println("                                         ^         ");
            System.out.println("                                         |         ");
            System.out.println("| West: cavernsA |      <-      | Current: Field |      ->      | East: Kaer Mohren |");
            System.out.println("                                         |         ");
            System.out.println("                                         v         ");
            System.out.println("                                | South: Exit Gate |");
        } else if(playerLocation == 6) {
            System.out.println("| North: cavernsA |");
            System.out.println("          ^         ");
            System.out.println("          |         ");
            System.out.println(" | Current: Field |      ->      | East: Exit Gate |");
        } else if(playerLocation == 7) {
            System.out.println("                                | North: Field |    ");
            System.out.println("                                         ^         ");
            System.out.println("                                         |         ");
            System.out.println("| West: Field |      <-      | Current: Exit Gate |      ->      | East: Field |");
        } else if(playerLocation == 8) {
            System.out.println("                               | North: Kaer Mohren |");
            System.out.println("                                         ^         ");
            System.out.println("                                         |         ");
            System.out.println("| West: Exit Gate |      <-      | Current: Field | ");
        }
    }

    void start() {
        Scanner in = new Scanner(System.in);

        String action = "";
        String noun = "";
        int currentBlock = 4;
        System.out.println("==================================== \n Welcome to your CS3IOS Coursework (Java version)! \n | Game started, type 'exit' to quit. | \n==================================== \n");


        while (!action.equals("exit")) {
            String[] words = in.nextLine().split(" ");
            //action = in.next();
            action = words[0];
            if (words.length > 1)
                noun = words[1];
            if (!action.equals("go") && !action.equals("examine") && !action.equals("take") && !action.equals("drop") && !action.equals("use") && !action.equals("exit") && !action.equals("show") && !action.equals("check")) {
                System.out.println("Invalid command, please use go|examine|take|drop|use|show|check|exit");
            } else if (words.length > 2) {
                System.out.println("Invalid command, please use \"action noun\"");
            } else {
                if (action.equals("exit")) {
                    System.out.println("You have quit the game successfully");
                    System.exit(0);
                }

                if (action.equals("go")) {
                    //check whether the destination is a valid move
                    int n;
                    if (noun.equals("north") || noun.equals("east") || noun.equals("south") || noun.equals("west")) {
                        n = getNextBlock(currentBlock, noun);
                        if (n != -1) {
                            currentBlock = n;
                            System.out.println("Player moves to " + getBlockName(currentBlock) + "\n");
                            printMap(currentBlock);
                        } else {
                            System.out.println("There's still monsters that need slaying." +
                                               " It is not time for winter just yet.");
                        }
                    } else {
                        System.out.println("Invalid direction, please use north|east|south|west");
                    }

                } else if (action.equals("drop")) {
                    //action = drop, noun is stored in variable "noun"
                    dropItem(noun);

                } else if (action.equals("show")) {
                    //action = show, noun is stored in the variable "noun", which should be map
                    if (noun.equals("map")) {
                        printMap(currentBlock);
                    } else if(noun.equals("bag")) {
                        printBag(bag);
                    } else {
                        System.out.println("Invalid noun, please use \"show map\" or \"show bag\"");
                    }

                } else if (action.equals("check")) {
                    //action = check, noun is stored in the variable "noun", which should be "block"
                    if (noun.equals("block")) {
                        System.out.println(getBlockName(currentBlock));
                    } else {
                        System.out.println("Invalid noun, please use \"check block\"");
                    }
                } else {
                    // Let the current block handle the command first
                    // The result of a given action will be stored in "result"
                    String result = "";
                    if (currentBlock == 0) {
                        result = block0(action, noun);
                    } else if (currentBlock == 1) {
                        result = block1(action, noun);
                    } else if (currentBlock == 2) {
                        result = block2(action, noun);
                    } else if (currentBlock == 3) {
                        result = block3(action, noun);
                    } else if (currentBlock == 4) {
                        result = block4(action, noun);
                    } else if (currentBlock == 5) {
                        result = block5(action, noun);
                    } else if (currentBlock == 6) {
                        result = block6(action, noun);
                    } else if (currentBlock == 7) {
                        result = block7(action, noun);
                    } else if (currentBlock == 8) {
                        result = block8(action, noun);
                    }
                    //Handle the result
                    //
                    if (action.equals("use") && noun.equals("medallion") && result.equals("GameCompleted")) {
                        System.out.println("Congratulations! You are a fine Witcher!");
                        break;
                    }

                }
            }
        }//end while
    }

    public static void main(String[] args) {
        MainGame m = new MainGame();
        m.start();
    }
}
