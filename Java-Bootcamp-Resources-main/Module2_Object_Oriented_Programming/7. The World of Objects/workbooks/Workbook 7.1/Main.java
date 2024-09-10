import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
      Person person1 = new Person();
      person1.name = "John";
      person1.nationality = "Irish";
      person1.dateOfBirth = "May 8 2020";
      //Note to define an array you need to explicitly create a new array then pass the new values to it.
      String[] passport1 = new String[]{person1.name, person1.nationality, person1.dateOfBirth};
      person1.passport =  passport1;
      person1.seatNumber = 5;

      System.out.println(person1.name);
      System.out.println(person1.nationality);
      System.out.println(person1.dateOfBirth);
      System.out.println(Arrays.toString(person1.passport));
      System.out.println(person1.seatNumber);

    }
}
