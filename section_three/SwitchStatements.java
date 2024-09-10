public class SwitchStatements {
    public static void main(String[] args) {

        // Section 1: Weather conditions
        String weather = "rainy";
        // Determine what to wear based on the weather (e.g., sunny, cloudy, rainy, snowy)
        // Decide whether to use if-else or switch
        //key = variable to compare
        switch (weather) {

                case "sunny" : System.out.println("wear a shirt");
                break;
            case "cloudy" : System.out.println("bring an coat");
            break;
            case "rainy" : System.out.println("bring an umbrella");
            break;
            case "snowy": System.out.println("bring a parka");
            break;
            default:System.out.println("Wear whatever you want");
                // optional break;
        }
        // Section 2: User role
        int role = 2;
        // Determine user access level based on the role (e.g., 1: admin, 2: editor, 3: user)
        // Decide whether to use if-else or switch
        switch (role) {
            case 1: System.out.println("you're an admin");
                break;
            case  2: System.out.println("you're an editor");
                break;
            case 3: System.out.println("you'rer a user");
                break;
            default: System.out.println("enter a number");
                break;
        }
        // Section 3: Temperature and humidity
        int temperature = 75;
        int humidity = 65;
        // Determine the comfort level based on both temperature and humidity (e.g., too hot, too cold, comfortable)
        // Decide whether to use if-else or switch
        //YOU  CAN'T USE SWITCH HERE SINCE THERE ARE 2 VARIABLES
        if(temperature >= 80 && humidity >=60){
                System.out.println("too hot and humid");
        }   else if(temperature >= 80){
                System.out.println("its too hot");
        }   else if(temperature <= 60 && humidity >= 60){
                System.out.println("too cold and humid");
        } else if( temperature <= 60){
                System.out.println("i'tsss too cold");
        }   else {
            System.out.println( "it's nice out.");
        }
        // Section 5: Age and income
        int age = 25;
        int income = 50000;
        // Determine eligibility for a specific credit card based on age and income
        // Decide whether to use if-else or switch
        if(age >= 18 && age <= 60 && income >=30000){
            System.out.println("congrats you can apply");
        }   else {
            System.out.println("sorry no dice");
        }
        // Section 1: Traffic light colors
        String lightColor = "green";
        // Determine what action to take based on the traffic light color (e.g., green, yellow, red)
        // Decide whether to use if-else or switch
        switch (lightColor) {
            case "green": System.out.println("go"); break;
            case "red": System.out.println("stop"); break;
            case "yellow":  System.out.println("slow down"); break;
            default:
            System.out.println("power outage");
                break;
        }
        // Section 2: Exam grade
        int grade = 85;
        // Determine the letter grade based on the numeric grade (e.g., A, B, C, D, F)
        // Decide whether to use if-else or switch
        if(grade >= 80){
            System.out.println("You got an A!");
        } else if(grade >= 70){
            System.out.println("You got a B!");
        } else if(grade >= 60){
            System.out.println("You got a C.");
        } else if(grade >= 50) {
            System.out.println("You got a D.");
        } else{
            System.out.println("You failed :(");
        }
        // Section 3: Browser type
        String browser = "Chrome";
        // Check if the browser is one of the following: Chrome, Firefox, Safari, Edge, or Opera
        // Decide whether to use if-else or switch
        
        switch (browser) {
            case "Chrome": System.out.println("enjoy your chrome extensions"); break;
            case "Firefox": System.out.println("best non-profit browser");  break;
            case "Safari": System.out.println("you must have a mac");  break;              
        
            default:
                System.out.println("curious");
        }
        

    }
}
