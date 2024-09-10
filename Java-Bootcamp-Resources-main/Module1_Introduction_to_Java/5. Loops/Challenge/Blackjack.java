import java.util.Scanner;

import javax.swing.plaf.synth.SynthPasswordFieldUI;

public class Blackjack {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press anything to begin!");
        //Task 3 – Wait for the user to press enter.
        scan.nextLine();
        //Task 4 – Get two random cards.
        //       – Print them: \n You get a \n" + <randomCard> + "\n and a \n" + <randomCard>
        int card1Value  = drawRandomCard();
        int card2Value = drawRandomCard();
        
        String card1 = cardString(card1Value);
        String card2  = cardString(card2Value);
        if(card1Value > 10 || card2Value > 10){
            card1Value = Math.min(card1Value, 10);
            card2Value = Math.min(card2Value, 10);
        }
        if((card1Value+card2Value)>21){
            card1Value=drawRandomCard();
            card2Value=drawRandomCard();
            // card1 = cardString(card1Value);  
            // card2 = cardString(card2Value);
        System.out.println(Math.min(card1Value, card2Value));
        System.out.println("\n You get a \n" + card1Value + "\n and a \n" + card2Value);
        // System.out.println("your total is: "+ cardTotal);
    }
        System.out.println("\n You get a \n" + card1 + "\n and a \n" + card2);

        //Task 5 – Print the sum of your hand value.
        //       – print: your total is: <hand value>
        int cardTotal = card1Value + card2Value;
        // Math.min(card2Value, cardTotal)
        System.out.println("your total is: "+ cardTotal);

        //Task 6 – Get two random cards for the dealer.
        //       – Print: The dealer shows \n" + <first card> + "\nand has a card facing down \n" + <facedown card>
        //       – Print: \nThe dealer's total is hidden

        int dealer1Value = drawRandomCard();
        int dealer2Value = drawRandomCard();
        String dealerCard1 = cardString(dealer1Value);
        String dealerCard2  = cardString(dealer2Value);
        if(dealer1Value > 10 || dealer2Value > 10){
            dealer1Value = Math.min(dealer1Value, 10);
            dealer2Value = Math.min(dealer2Value, 10);
        }
        String downCard = faceDown();
        System.out.println("The dealer shows \n" + dealerCard1 + "\nand has a card facing down \n" + downCard);
        System.out.println("\nThe dealer's total is hidden");
       
        //Task 8 – Keep asking the player to hit or stay (while loop).
        //       1. Every time the player hits
        //             – draw a new card.
        //             – calculate their new total.
        //             – print: (new line) You get a (new line) <show new card>.
        //             - print: your new total is <total>

        //       2. Once the player stays, break the loop. 
        while(hitOrStay().equals("hit")){
                int draw = drawRandomCard();
                String hitCard = cardString(draw);
                if(draw>10){
                    draw=Math.min(draw,10);
                }
                int newTotal  = cardTotal+= draw;
                cardTotal = newTotal;
                System.out.println("\n You get a \n" + hitCard);
                System.out.println("Your new total is " + newTotal);
                if(newTotal > 21){
                    System.out.println("Bust! Player loses");
                    System.exit(0);
                }
                // break;
            }
            
                // if(hitOrStay().equals("stay")){
                    System.out.println("Player stays. ");
                    
                    int dealerTotal = dealer1Value + dealer2Value;
                    System.out.println("Dealer's turn\n The dealer's cards are\n "+dealerCard1+ "\n and a \n"+ dealerCard2);
                    System.out.println("Dealer's total: "+ dealerTotal);
                // }
            while(dealerTotal <=17){
                int dealerDraw = drawRandomCard();
                String dealerHit = cardString(dealerDraw);
                if(dealerDraw> 10){
                    Math.min(dealerDraw, 10);
                }
                int dealerNewTotal  = dealerTotal+=dealerDraw;
                dealerTotal= dealerNewTotal;
                System.out.println("\n Dealer gets a \n" + dealerHit);
                System.out.println("Dealer's new total is " + dealerNewTotal);
                if(dealerNewTotal>21){
                    System.out.println("Bust! Dealer loses");
                    System.exit(0);
                }
            }
            if(cardTotal > dealerTotal){
                System.out.println("Player wins!");
            }
            else if(cardTotal < dealerTotal){
                System.out.println("Dealer wins!");
            }
            else if (cardTotal == dealerTotal){
                System.out.println("Push. ");
            }
            else{
                System.out.println("Error.");
            }
        //For tasks 9 to 13, see the article: Blackjack Part II. 
        /*Task 9 
         * While the player is hitting, if they go bust (total exceeds 21) print: "Bust! Player loses". Then, shut down the game with System.exit(0) (System.exit(0) terminates execution).
         */

         /*Task 10 
          * After the player chooses to stay, it becomes the dealer's turn. First, reveal the dealer's hidden card. Print:
(new line) Dealer's turn
(new line) The dealer's cards are (new line) <dealer card 1> (new line) and a (new line) <dealer card 2>
         */

        /*Task 11 
         * The dealer must keep "hitting" until their total gets to 17. Every time the dealer hits, print:
(new line) Dealer gets a (new line) <show new card>
(new line) Dealer's total is <dealer's total>

At 17 points or higher, end the dealer's turn.
        */

        /*Task 12 
         * If the dealer's total is higher than 21, print: "Bust! Dealer loses" and end the game with System.exit(0).
        */

        /*Task 13 
         * If at this point, the program didn't terminate, compare the dealer and player's hand values.
If the player's hand value is higher, print: Player wins!
Otherwise, print: Dealer wins!


        */

         scan.close();

    }

    /** Task 1 – make a function that returns a random number between 1 and 13
     * Function name – drawRandomCard
     * @return (int)
     *
     * Inside the function:
     *   1. Gets a random number between 1 and 13.
     *   2. Returns a card.
     */
    public static int drawRandomCard() {
        double randomNumber = (Math.random() * 13); // 0 --> <6
        randomNumber += 1; // from 1 -> <14        
        int randomInt = (int) randomNumber;
        return randomInt;
        }

    /** Task 2 – make a function that returns a String drawing of the card.
     * Function name – cardString
     * @param cardNumber (int)
     * @return (String)
     *
     * Inside the function:
     *   1. Returns a String drawing of the card.
     */
    public static String cardString(int cardNumber){
            String printCard = "";
            switch (cardNumber) {
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
    }
    public static String faceDown() {
        return
        "   _____\n"+
        "  |     |\n"+ 
        "  |  J  |\n"+
        "  | JJJ |\n"+
        "  |  J  |\n"+
        "  |_____|\n";
    }
    
    /** Task 7 – make a function that asks the user to hit or stay.
     * Function name – hitOrStay
     * @return (String)
     *
     * Inside the function:
     *   1. Asks the user to hit or stay.
     *   2. If the user doesn't enter "hit" or "stay", keep asking them to try again by printing:
     *      Please write 'hit' or 'stay'
     *   3. Returns the user's option 
     */
    public static String hitOrStay(){
        System.out.print("Would you like to hit or stay? ");
        String answer = scan.nextLine(); 

        if (answer.equals("hit") || answer.equals("stay")){
            System.out.println(answer);

        }
            else if(!answer.equals("hit") || !answer.equals("stay")){
        System.out.print( "Please enter 'hit' to get another card, and 'stay' to stay. ");
            answer = scan.nextLine();  
                   }
            return answer;
        
    }

    }