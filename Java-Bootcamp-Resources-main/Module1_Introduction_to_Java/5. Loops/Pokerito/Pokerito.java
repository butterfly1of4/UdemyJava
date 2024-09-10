import java.time.Year;
import java.util.Scanner;

public class Pokerito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        // String card = randomCard();
        // System.out.println(card);
        /*
         * Task 2: Explain the rules
         */
        System.out.println("Let's play Pokerito. Type anything when you're ready.");
        scan.nextLine();
        System.out.print("It's like Poker, but a lot simpler.");
        // >> (new line)
        System.out.println(" There are two players, you and the computer.");
        System.out.println("The dealer will give each player one card.");
        System.out.println("Then, the dealer will draw five cards (the river)");
        System.out.println("The player with the most river matches wins!");
        System.out.println("If the matches are equal, everyone's a winner!");

        // >> (new line)
        System.out.println("Ready? Type anything if you are.");
        scan.nextLine();

        /*
         * Task 3: Present the user with a card
         * println 'Here's your card:'
         * <show card>
         * <new line>
         * println 'Here's the computer's card:'
         * <show computer's card>
         */
        String userCard = randomCard();
        System.out.println("Here's your card: " );
        System.out.println(userCard);
        String computerCard = randomCard();
        System.out.println("Here's the computer's card: ");
        System.out.println(computerCard);

        /**
         * Task 4 - Draw five cards
         * 
         * • print: Now, the dealer will draw five cards. Press enter to continue.
         * • The dealer will draw a card every time the user presses enter.
         * • Before you draw a card, print the order it was drawn in:
         * Card 1
         * <2 new lines>
         * <print card>
         * Card 2
         * <2 new lines>
         * <print card>
         * ...
         */

         int yourMatches = 0;
         int computerMatches = 0;
        System.out.println("Now, the dealer will draw five cards. Press enter to continue.");
        scan.nextLine();
        System.out.println("The dealer will draw a card every time the user presses enter.");
        String newCard = "";

        for(int i = 1; i < 6; i++){
        newCard = randomCard();
          System.out.println("Card "+ i);  
          System.out.println(newCard);
          System.out.println(" ");
          System.out.println(" ");
          if(newCard.equals(userCard)){
            yourMatches+=1;
            // newCard=randomCard();

          scan.nextLine();

        } else if(newCard.equals(computerCard)){
            computerMatches+=1;
            // newCard=randomCard();
          scan.nextLine();

        }else{
          scan.nextLine();
        }
        }

        /**
         * Task 5 - Get the winner
         * 
         * • Count your number of matches.
         * • Count the computer's number of matches.
         * • print: Your number of matches: <yourMatches>
         * • print: Computer number of matches: <computerMatches>
         * 
         * • If you have more matches, print: You win!.
         * • If the computer has more matches, print: The computer wins!
         * • If the matches are equal, print: everyone wins!.
         */
     
         System.out.println("Your number of matches: " + yourMatches);
         System.out.println("Computer number of matches: " + computerMatches);
        if(yourMatches> computerMatches){
            System.out.println("You win!");
        } else if(computerMatches> yourMatches){
            System.out.println("The computer wins!");
        } else {
            System.out.println("Everyone wins!");
        }

        
        scan.close();
    }

    /**
     * Task 1
     * 
     * Function name – randomCard
     * 
     * @return (String)
     * 
     *         Inside the function:
     *         1. Gets a random number between 1 and 13.
     *         2. Returns a card that matches the random number (get the String
     *         values from cards.text).
     */
    public static String randomCard() {
        double randomNumber = (Math.random() * 13); // 0 --> <6
        randomNumber += 1; // from 1 -> <14
        int randomInt = (int) randomNumber;
        String printCard = "";
        switch (randomInt) {
            case 1:
                return
                printCard =  
                "   _____\n"+
                "  |A _  |\n"+ 
                "  | ( ) |\n"+
                "  |(_'_)|\n"+
                "  |  |  |\n"+
                "  |____V|\n";
            case 2:
                return printCard = 
                "   _____\n"+              
                "  |2    |\n"+ 
                "  |  o  |\n"+
                "  |     |\n"+
                "  |  o  |\n"+
                "  |____Z|\n";
            case 3:
                return printCard = 
                "   _____\n" +
                "  |3    |\n"+
                "  | o o |\n"+
                "  |     |\n"+
                "  |  o  |\n"+
                "  |____E|\n";
            case 4:
                return printCard = 
                "   _____\n" +
                "  |4    |\n"+
                "  | o o |\n"+
                "  |     |\n"+
                "  | o o |\n"+
                "  |____h|\n";
            case 5:
                return printCard = 
                "   _____ \n" +
                "  |5    |\n" +
                "  | o o |\n" +
                "  |  o  |\n" +
                "  | o o |\n" +
                "  |____S|\n";
            case 6:
                return printCard =
                "   _____ \n" +
                "  |6    |\n" +
                "  | o o |\n" +
                "  | o o |\n" +
                "  | o o |\n" +
                "  |____6|\n";
            case 7:
                return printCard = 
                    "   _____ \n" +
                    "  |7    |\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |____7|\n";
            case 8:
                return printCard = 
                "   _____ \n" +
                "  |8    |\n" +
                "  |o o o|\n" +
                "  | o o |\n" +
                "  |o o o|\n" +
                "  |____8|\n";
            case 9:
                return printCard = 
                    "   _____ \n" +
                    "  |9    |\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |____9|\n";
            case 10:
                return printCard = 
                "   _____ \n" +
                "  |10  o|\n" +
                "  |o o o|\n" +
                "  |o o o|\n" +
                "  |o o o|\n" +
                "  |___10|\n";
            case 11:
                return printCard = 
                "   _____\n" +
                "  |J  ww|\n"+ 
                "  | o {)|\n"+ 
                "  |o o% |\n"+ 
                "  | | % |\n"+ 
                "  |__%%[|\n";
            case 12:
                return printCard = 
                "   _____\n" +
                "  |Q  ww|\n"+ 
                "  | o {(|\n"+ 
                "  |o o%%|\n"+ 
                "  | |%%%|\n"+ 
                "  |_%%%O|\n";
            case 13:
                return printCard =   
                    "   _____\n" +
                    "  |K  WW|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%>|\n";

        }

        return printCard;
        // return null;
    }

}
