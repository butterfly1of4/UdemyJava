public class BreakAndContinue {
    public static void main(String[] args) {
        //continue skips a single run and continues to the next one
        //break completely breaks the loop/*
         
        for(int i = 0; i <=10; i++){
            if(i%2 !=0){
                //skips the odd numbers
                continue;
                // break;
            }
            System.out.println(i);
        }
    } 
    // int number = 0;

    // while(true){
    //     number++;
    //     if(number >5){
    //         break;
    //     }
    // }
    // System.out.println(number);
// }
}