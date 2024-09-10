import java.util.Scanner;

public class JavaRolls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // See Learn the Part for detailed instructions.
        int diceRoll = 0;
        int score = 0;
        System.out.println("Let's play Rolling Java. Type anything to start.");
        scan.nextLine();
        System.out.println("Great, here are the rules:\n");
        System.out.println(" -  If you roll a 6, the game stops.");
        System.out.println(" -  if you roll a 4, nothing happens.");
        System.out.println(" -  Otherwise, you get 1 point.\n");
        System.out.println("You must collect at least 3 points to win. Enter anything to roll:");
        scan.nextLine();

        
        while (diceRoll != 6) {
            diceRoll = rollDice();
            System.out.println("You rolled a " + diceRoll);
            if (diceRoll == 6) {
                System.out.println("End of game.");
                endGame(score);
            } else if (diceRoll == 4) {
                System.out.println("Zero points. Keeep rolling.");

            } else {
                System.out.println("One point. Keep rolling.");
                score += 1;
                
            }
        }

    }

    public static int rollDice() {
        double randomNumber = (Math.random() * 6); // 0 --> <6
        randomNumber += 1; // from 1 -> <7
        return (int) randomNumber;
    };

    public static void endGame(int localScore) {
                System.out.println("Your current score is: " + localScore);

        if (localScore >= 3) {
            System.out.println("Wow, that's lucky. You win!");
        } else {
            System.out.println("Tough luck, you lose :( ");
        }
    }
}
