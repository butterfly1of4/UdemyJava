public class Main {
  public static void main(String[] args) {
        String[] spareParts = new String[] { "Tires", "Keys" };

        Car nissan = new Car("Nissan", 10000, 2020, "green", spareParts);

        Car dodge = new Car("Dodge", 11000, 2013, "blue", new String[] { "Tires", "Keys" });

        Car nissan2 = nissan;

        System.out.println(nissan);
        System.out.println(dodge);
        System.out.println(nissan2);



  }  
}
