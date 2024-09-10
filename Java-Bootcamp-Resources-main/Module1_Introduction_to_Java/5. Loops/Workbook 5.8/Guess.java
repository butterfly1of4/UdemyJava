import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {

       System.out.print("I chose a number between 1 and 5. Try to guess it: ");
    
       Scanner scan = new Scanner(System.in);
       int myGuess = getNumber();
       int userGuess = scan.nextInt();
       //See Learn the Part for detailed instructions.
       while(userGuess != myGuess){
        System.out.print("Guess again: ");
           int newGuess= scan.nextInt();
        userGuess = newGuess;
    }
    System.out.println("You got it!");
       scan.close();
       
    }

    public static int getNumber() {
        double randomNum = (Math.random() * 5);
        randomNum += 1;
        return (int) randomNum;
    }

   

}
