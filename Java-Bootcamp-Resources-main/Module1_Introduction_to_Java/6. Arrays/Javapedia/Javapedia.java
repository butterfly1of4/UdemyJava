import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n**********Javapedia**********");
        System.out.println("How many historical figures will you register?");
        // Task 1 – Ask the user: how many historical figures will you register?
        // – Store the value.
        int numberOfFigures = scan.nextInt();
        // Task 2 – Create a 2D array with a variable number of rows, and 3 values per
        // row.
        String[][] database = new String[numberOfFigures][3];
        scan.nextLine();
        // Watch out for the nextLine() pitfall.
        for (int i = 0; i < database.length; i++) {
            System.out.println("\n\tFigure " + (i + 1));
            // for (int j = 0; j < arr.length; j++) {

                System.out.print("\t - Name: ");
                String name = scan.nextLine();
                database[i][0] = name;
                System.out.print("\t - Date of birth: ");
                String birthDay = scan.nextLine();
                database[i][1] = birthDay;

                System.out.print("\t - Occupation: ");
                String occuptionString = scan.nextLine();
                database[i][2] = occuptionString;

                System.out.print("\n");

            // }
        }
        /**
         * Task 3
         * 
         * for (____) {
         * 
         * System.out.println("\n\tFigure " + (i+1));
         * 
         * System.out.print("\t - Name: ");
         * pick up and store figure's name.
         * 
         * System.out.print("\t - Date of birth: ");
         * pick up and store figure's birthday.
         * 
         * System.out.print("\t - Occupation: ");
         * pick up and store figure's occupation.
         * 
         * System.out.print("\n");
         * 
         * }
         * 
         */
        System.out.println("These are the values you stored:");
        // Task 4: call print2DArray.

            print2DArray(database);

        System.out.print("\nWho do you want information on? ");
        String nameLookup  = scan.nextLine();
        // scan.nextLine();
        for (int i = 0; i < database.length; i++) {
            // for (int j = 0; j < database[i].length; j++) {
                if(database[i][0].equals(nameLookup)){
                    System.out.println("\tName: "+ database[i][0]);
                    System.out.println("\tDate of birth: "+ database[i][1]);
                    System.out.println("\tOccupation: "+ database[i][2]);

                // }
            }
        }
        /**
         * Task 5: Let the user search the database by name.
         * If there's a match:
         * print( tab of space Name: <name>)
         * print( tab of space Date of birth: <date of birth>)
         * print( tab of space Occupation: <occupation>)
         * 
         */
       
        scan.close();
    }

    /**
     * Function name: print2DArray
     * 
     * @param array (String[][])
     * 
     *              Inside the function
     *              1. print the database
     *              • a tab of space precedes each row.
     *              • each value in database has one space from the other value.
     *              • print a new line.
     */

     public static void print2DArray(String[][] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print("\t ");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
                
            }   
            System.out.print("\n");
        }
     }
}
