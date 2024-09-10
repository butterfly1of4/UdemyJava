import java.lang.reflect.Array;
import java.util.Arrays;

public class ReferenceTrap {
    public static void main(String[] args) {
        //this happens when many variables share a reference to 1 array
        /*
         * NEVER SET ARRAY VARIABLES EQUAL TO EACH OTHER
         * always create another array of the same length and use a loop to copy over the values to the new array. 
         * 
         * The arrays util method has a copy:
         * Arrays.copyOf()
         */
        String[] staffLastYear = {"Tommy", "Joel",  "Ellie"};
        //BAD
        // String[] staffThisYear = staffLastYear;
        //This changes the data from staffLastYear and staffTHisYear
        
        //GOOD
        // String[] staffThisYear = new String[3];
        // for (int i = 0; i < staffThisYear.length; i++) {
            //     staffThisYear[i] = staffLastYear[i];
            // }
            
            //EVEN BETTER
            String[] staffThisYear = Arrays.copyOf(staffLastYear,staffLastYear.length);
            
            staffThisYear[1] = "Abby";
        

        System.out.println(Arrays.toString(staffLastYear));
        System.out.println(Arrays.toString(staffThisYear));

    }
}