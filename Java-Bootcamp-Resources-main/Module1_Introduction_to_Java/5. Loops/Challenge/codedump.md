 public static String hitOrStay(){
        System.out.print("Would you like to hit or stay? ");
        String answer = scan.nextLine(); 
        if (answer.equals("hit")) { 
            System.out.println("You have chosen: "+answer);
            return answer; 
        }
        else if(answer.equals("stay")){
            System.out.println("You have chosen: "+answer);
            return answer;
        }
        else {
        System.out.print( "Please enter 'hit' to get another card, and 'stay' to stay. ");
           return answer = scan.nextLine();
        }

        //    return answer;

        }