import java.lang.reflect.Array;
import java.util.Arrays;

public class Weather {
    public static void main(String[] args) {
        
        // The instructions for this workbook are on Learn the Part (Workbook 6.11)
        double[] celsius = {12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0};
        double[] fahrenheit = celciusToFarenheit(celsius);
        // System.out.println(Arrays.toString(fahrenheit));
        
        // System.out.println(Arrays.toString(celsius));
        printTemperatures(celsius,"Celsius");
        printTemperatures(fahrenheit, "Farenheit");
        
        // System.out.println(Arrays.toString(fahrenheit));

    }
    /*
    * CREATE A NEW FUNCTION
      Function name: celciusToFarenheit.
      @param celsius (double[])
      @return farenheit ( double[])


      Inside the function: 
        1. Create a double[] array called 'farenheit'
        2. Copies all of the values from celsius to farenheit
        3. Updates the farenheit values to (F = (C/5 * 8)+ 32)
        4. Return farenheit
     */
    public static double[] celciusToFarenheit(double[] celsius ){
        double[] fahrenheit = Arrays.copyOf(celsius, celsius.length);
        System.out.println(Arrays.toString(fahrenheit));

        for (int i = 0; i < fahrenheit.length; i++) {
            fahrenheit[i] = (fahrenheit[i]/5 * 9) + 32;
            
        }
        System.out.println(Arrays.toString(fahrenheit));
        return fahrenheit;
    }
    /**
 * Function name - printTemperatures
 * @param temp ( double[] )
 * @param tempType ( String ) can be: Celsius or Fahrenheit
 *
 * Inside the function:
 *  1. System.out.print(type + ": ");
 *  2. A loop prints the temperatures in ONE line System.out.print(temp[i] + " ");
 *  3. Prints a new line after the loop System.out.print("\n");
 */
    public static void printTemperatures(double[] array, String Celsius){
        System.out.print(Celsius + ": ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");
    }
}
