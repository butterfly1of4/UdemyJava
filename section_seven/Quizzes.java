public class Quizzes {
  public static void main(String[] args) {
    Shirt nike  = new Shirt("Nike",20.99,"Small");

String brand = nike.getBrand();
brand = "whoops";

    System.out.println("" + nike.getBrand());
    System.out.println("" + nike.getPrice());
    System.out.println("" + nike.getSize());

  }
}