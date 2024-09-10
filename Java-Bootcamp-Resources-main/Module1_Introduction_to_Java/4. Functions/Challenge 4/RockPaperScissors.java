import java.security.interfaces.RSAKey;
import java.sql.ResultSet;
import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class RockPaperScissors {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");

    //Task 1: See if the user wants to play. 
        String readyToPlay = scan.nextLine();
        
        if(readyToPlay.equals("yes")){
            System.out.println("Great!");
            System.out.println("rock - paper  - scissors, shoot!");
            String userChoice = scan.nextLine();
            String choice = computerChoice();
            result(userChoice,choice);
            printResult(userChoice, userChoice, choice);
        }
        else {
            System.out.println("Darn, some other time...!");
            System.exit(0);
        }
    /*Task 2: Set up the game
    
    
       • if the answer is yes: 
             – print: Great!
             – print: rock - paper - scissors, shoot!
             – pick up user's choice.
             – get the computer choice (can only be done after task 3).
             – get the result (can only be done after task 4)
             – print everything (can only be done after task 5).

       • else:

       – print: Darn, some other time...!        
    */
        

        scan.close();
    }

    

    //Task 3  – Write a function where the computer picks a random choice.

    /**
     * Function name: computerChoice - picks randomly between rock paper and scissors
     * @return a choice (String).
     * 
     * Inside the function:
     *   1. Picks a random number between 0 and 2.
     *   2. if 0: returns the choice 'rock'
     *      if 1: returns the choice 'paper'
     *      if 2: returns the choice 'scissors'
     */
    public static String computerChoice(){
        double randomNumber = (Math.random() * 2);
        randomNumber +=1;
        int randomInt = (int) randomNumber;
       if(randomInt == 0){
        return  "rock";
       }else if(randomInt == 1){
        return  "paper";
       } else {
        randomInt = 2;
        return "scissors";
       }

    }

    //Task 4  – Write a function that compares the choices and returns the result.

    /**
     * Function name: result - It returns the result of the game.
     *  @param yourChoice (String)
     *  @param computerChoice (String) 
     *  @return result (String) 

     * Inside the function:
     *   
     *   1. result is "You win!" if:
     *
     *       You: "rock"      Computer: "scissors"
     *       You: "paper"     Computer: "rock"
     *       You: "scissors"  Computer: "paper"
     *
     *   2. result is "You lose" if:
     * 
     *       Computer: "rock"      You: "scissors"
     *       Computer: "paper"     You: "rock"
     *       Computer: "scissors"  You: "paper"
     *
     *   3. result is "It's a tie" if: Your choice equals computer choice.
     * 
     *   4. Otherwise, print "INVALID CHOICE" and exit the program.
     *
     */

    public static String result(String yourChoice, String choice) {
        String result = "";
        if((yourChoice.equals("rock") && choice.equals("scissors")) || (yourChoice.equals("paper") && choice.equals("rock")) || yourChoice.equals("scissos") && choice.equals("paper")){
            result = "You win!";
            System.out.println(result);
        } else if((choice.equals("rock") && yourChoice.equals("scissors")) || (choice.equals("paper") && yourChoice.equals("rock")) || (choice.equals("scissorss") && yourChoice.equals("paper"))){
            result = "You lose";
            System.out.println(result);
        } else if( choice.equals(yourChoice)){
            result = "It's a tie";
            System.out.println(result);
        } else {
            System.exit(0);
            result = "INVALID CHOICE";
        }
        return result;
      }
 
     //Task 5  – Write a function that prints your choice, the computer's, and the result.

    /**
     * Name: printResult - It prints everything (your choice, computer choice, result)
     * @param yourChoice (String)
     * @param computerChoice (String)
     * @param result (String)
     * 
     * Inside the function:
     * 
     *  1. prints everything:
     *      – prints: You chose:          <your choice>
     *      – prints: The computer chose: <computer choice>
     *      – prints: <result>
     */
    
     public static void printResult(String yourChoice, String computerChoice, String result){
        System.out.println("You chose: " + yourChoice);
        System.out.println("The computer chose: " + computerChoice);
        System.out.println(result);
     }
}
