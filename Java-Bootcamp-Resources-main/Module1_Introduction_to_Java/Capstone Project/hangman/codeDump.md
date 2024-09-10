int misses = 0;
    int numberOfGuesses = printArray.length;
    System.out.println("Word: "+ board);

    for (int i = numberOfGuesses; i > 0; i--) {
         System.out.println("Please guess a letter: ");
         String guess = scan.nextLine();
       scan.nextLine();
        System.out.println("You have entered: " + guess);
    }



        public static String[] printBlanks(String blanks, String[] printArray) {
                String[] blanksArray = new String[printArray.length];
                String[] printBlanks = new String[printArray.length];

                for (int i = 0; i < printArray.length; i++) {
                        blanksArray[i] = "_ ";
                        blanks += blanksArray[i] + " ";
                        printBlanks = Arrays.copyOf(blanksArray, i+1);
                        // System.out.println(Arrays.toString(printBlanks));
                }
                
                System.out.println(blanks);
                return printBlanks;
        }


            public static void printGallows(String misses, String blankString, Boolean changes){
                if(changes=true){
                System.out.println(gallows[counter]);
                System.out.println("WORD: \n" + blanks);
        }
                // System.out.println("MISSES: "+ (misses+= userGuess));
        }