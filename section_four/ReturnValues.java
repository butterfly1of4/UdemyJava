public class ReturnValues {
    public static void main(String[] args) {
    double area=  calculateArea(2.3,3.6);
    // double area1=  calculateArea(1.6,2.4);
    // double area3 = calculateArea(-5,4.2);
    printArea(2.3, 3.6, area);
    String englishEcplanation =  explainArea("English");
    // String frenchEcplanation =  explainArea("French");
    // String spanishEcplanation =  explainArea("Spanish");
    // String italianEcplanation =  explainArea("Italian");
        System.out.println(englishEcplanation);

        }
    public static double calculateArea(double length, double width){
        //above double defines the return type
        if(length < 0 || width < 0){
            System.out.println("Invalid dimensions");
            System.exit(0);
        }
        double area = length * width;
        System.out.println("Area: "+ area);
        return area;
    }

//functions should only handle one thing.  
    public static String explainArea(String language){
        switch (language) {
            case "English": return "Area equals length * width"; 
            case "Spanish":  return  "area es igual a largo * ancho";               
            case "French":   return "La surface est egale a la longueur * la largeur";             
            default: return "Language not available.";
        }
    }
    public static void printArea(double length, double width, double area){
        System.out.println("A rectangle with a length of "+ length + " and a width of "+width+ " has an area of "+area);
    }
}
// English "Area equals length * width"

// French "La surface est egale a la longueur * la largeur"

// Spanish "area es igual a largo * ancho"

//It's bad practice for functions to handle the final result
//It's good practice for functions to return the final result.