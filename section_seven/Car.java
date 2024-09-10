import java.util.Arrays;

public class Car {
    /*
     * In order to NOT change the values of any variables inadvertently, the
     * variables have to be PRIVATE to the car class.
     * Now it's only visible to the 'car' class.
     * 
     */

    private String make;
    private double price;
    private int year;
    private String color;
    private String[] parts;

    /*
     * CONSTRUCTOR: a constructor runs when the obj is created. it updates the
     * fields.
     * 
     * To make a constructor:
     * they need the access (usually public), a class name (ex 'Car') and
     * parameterss (String make, double price, etc.)
     * 
     * when the constructor is called, a new 'Car' object is created from the car
     * class. The parameters are updated when the obj is creted
     * 
     * 'THIS': refers to the current obj. It's to distinguish between 'fields' and
     * j'parameters'
     */

    // *FIXING REFERENENCE ERRORRS */
    /*
     * Every 'parts' variable references the exact same array.
     * If a variable is updated from the outer (main) class, ALL of them will be
     * updated simultaneiously.
     * 
     * Instead, the variables have to be set to a COPY of the array.
     */

    // constructor
    public Car(String make, double price, int year, String color, String[] parts) {
        /*
         * every object defined has a field that matches the parameters of the
         * constructor. 'this' refers to the field in that specific object.
         */
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
        // bad: this.parts = parts;
        //good;
        this.parts = Arrays.copyOf(parts, parts.length);
    }

    /*
     * CREATE A COPY CONSTRUCTOR:
     * 1. Create a constructor that defines 1 parameter
     * - public access, then Class and it takes the 'source' car as a parameter
     * 2. Call the constructor while creating a new car object.
     * 3. The constructor must update the object's fields.
     */

     /* 
      * HOW TO FIX A COPY CONSTRUCTOR TO ACCOUNT FOR AN ADDED ARRAY FIELD:
      * - When you make a copy of this object (ex: nissan2), the EXACT same reference to the array will be recreated and the new parts filed will be exactly the same as the field copied from. The getters/setters will update both of the references.
        -
      */
    // copy constructor ==
    public Car(Car source) {
        // this refers to the new car class (ex nissan2) and the 'source' is the
        // previous value from the sorce object.
        this.make = source.make;
        this.price = source.price;
        this.year = source.year;
        this.color = source.color;
        //bad: this.parts =  source.parts;
        //good:
        this.parts = Arrays.copyOf(source.parts, source.parts.length);
    }

    /*
     * GETTER: a public method that updates the values of the variables in a method
     * -there neesd to be 1 method for each parameter
     * -they all start with 'get' (ex. getPrice) & are in camelCase
     */
    // Access 'make'
    public String getMake() {
        return make;
    }
    
         /*
          * HOW TO FIX A GETTER TO AVOID REFERENECE OVERLAP:
          * use the 'Arrays.copyOf()'method
          */
    // get parts
    public String[] getParts() {
        //bad: return parts;
        //good
        return Arrays.copyOf(this.parts, this.parts.length);
    }

    // Access 'price'
    public double getPrice() {
        return price;
    }

    // Access 'year'
    public int getYear() {
        return year;
    }

    // Access 'color'
    public String getColor() {
        return color;
    }

    /*
     * SETTERS: a method that can update the value of the private field from within
     * the class;
     *
     * The setter sets the field equal to a copy of the parameters in the main method so the fields already established are safe from external updates.
     * -Always start with set (ex. setPrice) and are 'void' methods.
     */



    
    // set 'make'
    public void setMake(String make) {
        // we need 'this' to distinguish between the update and the value passed down
        this.make = make;
    }

    // set 'price'
    public void setPrice(double price) {
        this.price = price;
    }

    // set 'year'
    public void setYear(int year) {
        this.year = year;
    }

    // set 'color'
    public void setColor(String color) {
        this.color = color;
    }

    // set parts
    public void setParts(String[] parts) {
        //bad: this.parts= parts;
        //good:
        this.parts = Arrays.copyOf(parts, parts.length);
    }

    /*
     * Drive ;'METHOD'
     * methods allow objects to have actions
     */
     
    public void drive() {
        System.out.println(
                "\nYou bought a beautiful " + this.year + " " + this.color + " " + this.make + " for" + this.price);
        System.out.println("Please drive to the nearest exit.");
    }
    /*
     * MUTALBE OBJECT: object with setters. The 'Car'class has get/set so they can
     * be updated indefinitely.
     * -avoid setting variales = to each other (they share a reference to the same
     * object)
     * -that allows for multiple variables to be updated from 1 reference
     */

     /*
      * toString()method: this the default print, where the class is the class was created, @, string that represents a hashcode.
      */

        public String toString() {
        // return getClass().getName() + "@" + Integer.toHexString(hashCode());
                return "Make: " + this.make + ".\n" 
            +  "Price: " + this.price + ".\n"
            +  "Year: " + this.year + ".\n"
            +  "Color: " + this.color + ".\n"
            +  "Parts: " + Arrays.toString(parts) + ".\n";

    }

}
