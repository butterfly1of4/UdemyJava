import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Hangman {

        public static String[] words = { "ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
        "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
        "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
        "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
        "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon",
        "python", "rabbit", "ram", "rat", "raven", "rhino", "salmon", "seal",
        "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
        "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
        "wombat", "zebra" };
        // words = {"ant", "cat", "llama", "dog", "eel"};

        public static String[] gallows = { "+---+\n" +
                        "|   |\n" +
                        "    |\n" +
                        "    |\n" +
                        "    |\n" +
                        "    |\n" +
                        "=========\n",

                        "+---+\n" +
                                        "|   |\n" +
                                        "O   |\n" +
                                        "    |\n" +
                                        "    |\n" +
                                        "    |\n" +
                                        "=========\n",

                        "+---+\n" +
                                        "|   |\n" +
                                        "O   |\n" +
                                        "|   |\n" +
                                        "    |\n" +
                                        "    |\n" +
                                        "=========\n",

                        " +---+\n" +
                                        " |   |\n" +
                                        " O   |\n" +
                                        "/|   |\n" +
                                        "     |\n" +
                                        "     |\n" +
                                        " =========\n",

                        " +---+\n" +
                                        " |   |\n" +
                                        " O   |\n" +
                                        "/|\\  |\n" + // if you were wondering, the only way to print '\' is with a
                                                      // trailing escape
                                                      // character, which also happens to be '\'
                                        "     |\n" +
                                        "     |\n" +
                                        " =========\n",

                        " +---+\n" +
                                        " |   |\n" +
                                        " O   |\n" +
                                        "/|\\  |\n" +
                                        "/    |\n" +
                                        "     |\n" +
                                        " =========\n",

                        " +---+\n" +
                                        " |   |\n" +
                                        " O   |\n" +
                                        "/|\\  |\n" +
                                        "/ \\  |\n" +
                                        "     |\n" +
                                        " =========\n" };

        static Scanner scan = new Scanner(System.in);

        public static void main(String[] args) {

                // Print a welcome statement and the initial hangman board
                System.out.println(
                                "Welcome to Hangman. \n\tA random word will be selected for you. Your mission is to guess a randomly selected word. The number of characters in the word will be outlined. The number of guessess will be determined by the amount of letters present in the word. \n");

                // Select a word at random from the list provided
                System.out.println(gallows[0]);
                String guessWord = randomWord();
                // System.out.println(guessWord);

                /*
                 * Create an array that contains the individual letters for comparison with user
                 * guesses
                 */
                String[] wordLength = wordLength(guessWord);
                String[] printArray = Arrays.copyOf(wordLength, wordLength.length);


                /*
                 * Print out the blanks that correspond with the number of letters in the word
                 */
                String blanks = "";

                /*
                 * Print a placeholder for each letter
                 */
                String[] printBlanksArray = printBlanks(printArray);
                for (int i = 0; i < printBlanksArray.length; i++) {
                        blanks += printBlanksArray[i] + " ";
                }

                System.out.println(blanks);

                /* Guess a letter */
                System.out.print("Please guess a letter: \n");
                String userGuess = scan.nextLine();

                /* Variables for misses and turn counter */

                String misses = "";
                int counter = 0;
                Boolean changed = false;

                /*
                 * See if a letter matches
                 * 
                 * -If a letter matches replace the blank with the letter, print the empty
                 * gallows, increase the turn counter and ask for another turn.
                 * 
                 * -If the letter doesn't match, print the updated gallows, add the incorrect
                 * guess to missses, increase the turn counter, ask for a new letter.
                 */
                String[] updatedBlanks = Arrays.copyOf(printBlanksArray, printBlanksArray.length);
                while (counter < 6) {
                        if(misses.matches(userGuess)){
                                System.out.println("Letter has already been guess. Please choose another letter.");
                userGuess = scan.nextLine();
                            
                        for (int i = 0; i < printArray.length; i++) {
                                if (userGuess.equals(printArray[i])) {
                                        updatedBlanks[i] = userGuess;
                                        blanks = "";

                                        for (int x = 0; x < printBlanksArray.length; x++) {
                                                blanks += updatedBlanks[x] + " ";
                                                changed = true;
                                        }
                                }
                        }
                        if (checkComplete(updatedBlanks)) {
                                // if(changed){
                                        System.out.println(gallows[counter]);
                                        System.out.println("Congratulations, you have won.");
                                        System.out.print("The word was " + guessWord + "\n");
                                        System.exit(0);

                                // }
                        // if (updatedBlanks.equals(printArray)) {
                        // if (changed) {
                        //         int i = 0;
                        //                 while(wordLength[i].equals(updatedBlanks[i])){
                                           
                        //                         changed = true;
                        //                         i+=1;
                                           
                        //                 };
                                                
                        }
                        if (!changed) {
                                    
                                }
                                misses += userGuess;
                                counter += 1;

                        }

                        if (counter == 6) {

                                System.out.println(gallows[counter]);
                                System.out.println("R I P!\n");
                                System.out.print("The word was " + guessWord + "\n");
                                System.exit(0);
                        }
                        System.out.println(gallows[counter]);
                        System.out.println("WORD:    " + blanks);
                        System.out.println("MISSES: " + (misses));
                        changed = false;

                        System.out.print("Please guess a letter: ");

                        userGuess = scan.nextLine();
                } // end counter

        } // end main

        /**
         * Choose a word at random from the pre-set list
         * 
         * Function name: randomWord
         * 
         * @return (String)
         *         Inside the function:
         *         1. Get a random number between 1 and the length of the words array.
         *         2. Return a value that will serve as the index for the word in the
         *         'words' array.
         */
        public static String randomWord() {
                double randomNumber = (Math.random() * words.length);
                randomNumber += 1; // from 1 - words.length
                int randomInt = (int) randomNumber;
                return words[randomInt];

        }

        /**
         * Split the word into an array of letters to determine the length and letters
         * that need to be matcheed in the word.
         * 
         * Function name: wordLength
         * @param guessWord
         * @return (String)
         * 
         *      Inside the function
         *      1. Split the guessWord string into an array of individual characters
         * 
         */
        public static String[] wordLength(String guessWord) {
                String[] letters = guessWord.split("");
                // System.out.println(letters);
                return letters;
        }

        /**
         * Function to create an array that will help with printing out the blanks
         * 
         * Function name: printBlanks
         * @param printArray
         * @return printBlanks (String[])
         * 
         *      Inside the function:
         *      1.Create a variable to hold an array of blanks the length of printArray
         *      2.Create a variable to output the contents of blanksArray to the console
         *      3.Return an array of blanks that correspond with the letters in the word
         *      
         */
        
        public static String[] printBlanks(String[] printArray) {
                String[] blanksArray = new String[printArray.length];
                String[] printBlanks = new String[printArray.length];
                for (int i = 0; i < printArray.length; i++) {
                        blanksArray[i] = "_ ";
                        printBlanks = Arrays.copyOf(blanksArray, i + 1);
                }
                return printBlanks;
        }

        /**
         * Function to check if word is guessed completely
         * 
         * Function name: checkComplete
         * @param printBlanksArray (String[])
         * @return Boolean (complete)
         * 
         *      Inside the function:
         *      1.Create a Boolean variable to compare against
         *      2.Check the array to see if all spaces are filled with letters (not blanks)
         *      3.If yes: complete  = false
         *      4.If no: complete = true-  keep running the function
         */
        public static Boolean checkComplete(String[] checkBlanks) {
                Boolean complete = true;
                for (int i = 0; i < checkBlanks.length; i++) {
                        if (checkBlanks[i].equals("_ ")) {
                                complete = false;
                        }
                }
                return complete;
        }

} // end Hangman Class
