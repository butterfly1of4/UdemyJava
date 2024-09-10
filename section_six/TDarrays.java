import java.util.Arrays;

public class TDarrays {
    public static void main(String[] args) {
        //2d arrays are arrays that contain arrays
        //always accessed by row then column
        // int[][] grades =  new int[3][4];
        // grades[0][0] = 72;
        // grades[0][1] = 74;
        // grades[0][2] = 76;
        // grades[0][3] = 78;
        // grades[1][0] = 65;
        // grades[1][1] = 64;
        // grades[1][2] = 61;
        // grades[1][3] = 67;
        // grades[2][0] = 95;
        // grades[2][1] = 99;
        // grades[2][2] = 99;
        // grades[2][3] = 100;

        //if you know thee values before you can ititialize the array in one line.
        int[][] grades = {{72,74,76,78},{65, 64, 61, 67},{99, 95, 99, 100}};

        // System.out.println("\tHarry:"+ Arrays.toString(grades[0]));
        // System.out.println("\tHarry: " + grades[0][0]+" "+grades[0][1] + " "+ grades[0][2]+" "+grades[0][3]);
        // System.out.println("\tRon:  "+ Arrays.toString(grades[1]));
        // System.out.println("\tRon: " + grades[1][0]+" "+grades[1][1] + " "+ grades[1][2]+" "+grades[1][3]);
        // System.out.println("\tHermione: "+ Arrays.toString(grades[2]));
        // System.out.println("\tHermione: " + grades[2][0]+" "+grades[2][1] + " "+ grades[2][2]+" "+grades[2][3]);

        /*NESTED LOOPS */
        for (int i = 0; i < grades.length; i++) {
            switch(i){
                case 0: System.out.print("\tHarry: "); break;
                case 1: System.out.print("\tRon: "); break;
                case 2: System.out.print("\tHermione: "); break;

            }
          for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j] + " ");
        }   
        System.out.println("\n");
    }
        // for (int j = 0; j < grades[1].length; j++) {
        //     System.out.print(grades[1][j] + " ");
        // } 
        // System.out.println("\n");

        // for (int j = 0; j < grades[2].length; j++) {
        //     System.out.print(grades[2][j] + " ");
        // } 
        // System.out.println("\n");

    
    }

}