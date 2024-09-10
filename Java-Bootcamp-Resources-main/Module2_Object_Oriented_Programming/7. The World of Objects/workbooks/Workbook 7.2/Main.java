import java.util.Arrays;
 
public class Main {
  
    public static void main(String[] args) {
        Person person = new Person("Rayan Slim", "Canadian","01/01/1111",5);
 
        // person.name = "Rayan Slim";
        // person.nationality = "Canadian";
        // person.dateOfBirth = "01/01/1111";
        // person.passport = new String[]{person.name, person.nationality, person.dateOfBirth};
        // person.seatNumber = 5;

        System.out.println("Name: " + person.name + "\n" + "Nationality: " + person.nationality + "\n" + "Date of Birth: " + person.dateOfBirth + "\n" + "Seat Number: " + person.seatNumber + "\n");


        // System.out.println(person.name);
        // System.out.println(person.nationality);
        // System.out.println(person.dateOfBirth);
        // System.out.println(Arrays.toString(person.passport));
        // System.out.println(person.seatNumber);

    }
  
  
}
