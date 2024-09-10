import java.util.Arrays;
//to use arrays they have to be imported
public class UpdatingArrays {
    public static void main(String[] args) {
        String[] menu = {"Espresso", "Iced Coffee", "Macchiado"};

/*YOU CANNOT CHANGE THE LENGTH OF AN ARRAY! 
    A VARIABLE CANNOT STORE AN ARRAY, ONLY A REFERENCE TO IT
 * you bave to create a separate longer array to accomodate more values.
*/

        menu[2] = "Latte";
        // String menuString = Arrays.toString(menu);
        // System.out.println(menuString);
        //or
        System.out.println(Arrays.toString(menu));
        String[] newMenu= new String[5];
        for (int i = 0; i < menu.length; i++) {
            newMenu[i] = menu[i];
        }
        newMenu[3] = "House Blend";
        newMenu[4] = "Dark Roast";
        System.out.println(Arrays.toString(newMenu));

    }
}