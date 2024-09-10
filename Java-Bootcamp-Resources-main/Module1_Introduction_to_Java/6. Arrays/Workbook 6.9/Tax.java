import java.text.DecimalFormat;
import java.util.Arrays;

public class Tax {
    public static void main(String[] args) {
        double[] price = {1.99, 2.99, 3.99, 4.99};
        double[] afterTax = new double[4];
        // See instructions on Learn the Part (Workbook 6.9)
        DecimalFormat formatPrice = new DecimalFormat("#.00");
        for (int i = 0; i < afterTax.length; i++) {
           afterTax[i]=  price[i] + (price[i] * .13);
            // formatPrice.format(price[i]);
            
            // formatPrice.format(afterTax[i]);
        }
        System.out.println("The original prices are: "+ Arrays.toString(price));
        System.out.println("The prices after tax are: "+ Arrays.toString(afterTax));
        
    }
}
