public class MainNotes {
  public static void main(String[] args) {

    String[] spareParts = new String[] { "Tires", "Keys" };
    /*
     * Arrays are mutable objects:
     * ex:
     * String[] parts - new String[4];
     * -new keyword dentoess a new object
     * 
     * Arrays are mutable because their elements can still be updated.
     * -when using mutable objects avoid references to the same object
     */

    // constructor updated to include the parts field
    Car nissan = new Car("Nissan", 10000, 2020, "green", spareParts);
    /* These can't be accessed since the fields are now private */
    // nissan.make = "Nissan";
    // nissan.price = 10000;
    // nissan.year = 2020;
    // nissan.color = "green";

    /*
     * constructor example
     */
    Car dodge = new Car("Dodge", 11000, 2013, "blue", new String[] { "Tires", "Keys" });

    // UPDASTE the element at indesx 0
    // spareParts[0] = "Filter";

    /* These can't be accessed since the fields are now private */
    // dodge.make = "Dodge";
    // dodge.price = 11000;
    // dodge.year = 2019;
    // dodge.color = "blue";

    /*
     * Use a setter to update values
     */

    /*
     * In order to avoid setting variables to each other: make sure the the 'get' method is updated to create a unique copy of the array so that values will not be overwritten. 
     */

    // String[] carParts = nissan.getParts();
    // carParts[0] = "Filters";

    // Setter examples
    // nissan.setColor("Jet black");
    // dodge.setColor("Teal");
    // nissan.setPrice(nissan.getPrice()/ 2);
    // dodge.setPrice(dodge.getPrice() / 2);

    // Car nissan2 = nissan;

    // copy constructor
    // -can be initalized with all or 1 parameter
    Car nissan2 = new Car(nissan);

    // nissan2.setColor("Yellow");
    // nissan.setColor("Orange");

    // CALL the new method created in the person class
    nissan2.drive();

    System.out.println(nissan);
    /*
     * System.out.println("This " + nissan.getMake() + " is worth $" +
     * nissan.getPrice() +
     * ". It was built in " + nissan.getYear() + ". It is " + nissan.getColor() +
     * ".\n");
     * System.out.println("This " + dodge.getMake() + " is worth $" +
     * dodge.getPrice() +
     * ". It was built in " + dodge.getYear() + ". It is " + dodge.getColor() +
     * ".\n");
     */
  }
}

/*
 * CLASS: a blueprint from which you can create an object
 * 
 * Objects:
 * 
 * THING: contains fields
 * THING: performs tasks
 * 
 * EXAMPLE OUTLINE:
 * 
 * OBJECT: car
 * FIELDS: make, price, year, color
 * TASKS: drive
 * 
 * 
 */
