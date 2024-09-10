import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int roll1= rollDice();
        int roll2= rollDice();
        int roll3= rollDice();


        System.out.print("Enter 3 numbers between 1 & 6: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if(isLessThanOne(num1, num2, num3) || isHigherThanSix(num1, num2, num3)){
            System.out.print("Number(s) are outside of the valid range.");
            System.exit(0);
        }

        boolean firstResult = isLessThanOne(num1, num2, num3);
        boolean secondResult  =isHigherThanSix(num1, num2, num3);

        int sumNumbers = (num1 + num2 + num3); 
        int sumDiceRolls = (roll1 + roll2 + roll3);
        System.out.println("Your Sum: " + sumNumbers + "Dice sum: "+ sumDiceRolls);
        if(userWon(sumNumbers, sumDiceRolls)){
            System.out.println("Congratulations, you won!");
        } else {
            System.out.println("Good try.");
        }



        System.out.println(roll1);
        System.out.println(roll2);
        System.out.println(roll3);


        scan.close();
    }

    public static boolean isLessThanOne(int num1, int num2, int num3){
        return (num1 < 1 || num2 < 1 || num3 < 1);
    }

    public static boolean isHigherThanSix(int num1, int num2, int num3){
        return (num1 > 6 || num2 > 6 || num3 > 6);
    }

    //User wins if Sum of numbers input > sum of dice rolls && input sum - dice sum < 3
    public static boolean userWon(int sumNumbers, int sumDiceRolls){
        return (sumNumbers> sumDiceRolls && (sumNumbers - sumDiceRolls) < 3);
    }


    public static int rollDice(){
    double randomNumber = (Math.random() * 6 ); // 0 --> <6
    randomNumber +=1; //from 1 -> <7
    return (int) randomNumber;
}; 
}