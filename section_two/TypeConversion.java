public class TypeConversion {

    public static void main(String[] args) {
//you can add (type) before a variable to change the output to be an appropriate type. 
        int ants = 2000;
        // double purchasedBlocksOfCheese = 1;
        int purchasedBlocksOfCheese = 1;

        System.out.println("There are " + ants + " ants, and " + purchasedBlocksOfCheese + " block of cheese.");
        System.out.println("Each ant carried " + ((double)purchasedBlocksOfCheese / ants) + " from the total cheese amount"); 

        double salary = 5423.94;
        int roundedSalary = (int)salary;
        System.out.println("Mortgage Broker: What is your monthly salary in dollars?");
        System.out.println("My monthly salary is: " + roundedSalary);

        int apples = 5;
        int bananas = 10;
        System.out.println("john has " + apples + bananas + " fruits");

    }

}
