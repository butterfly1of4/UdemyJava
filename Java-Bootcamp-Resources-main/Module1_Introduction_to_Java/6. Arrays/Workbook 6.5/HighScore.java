public class HighScore {
    public static void main(String[] args) {

        int highScore = 0;

        // Instructions for this workbook are on Learn the Part (Workbook 6.5).


        int[] newScores = { randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(),  randomNumber(), randomNumber(), randomNumber(), randomNumber()};

        System.out.print("Here are the scores: ");
        for (int i = 0; i < newScores.length; i++) {

            System.out.print(newScores[i] + " ");
            if (highScore < newScores[i]) {
                highScore = newScores[i];
            } 

        }

        
        System.out.println("\n\nThe highest score is: " + highScore + ". Give that man a cookie!");
    
        
    }

    public static int randomNumber() {
        double randomNumber = (Math.random() * 50000);
        randomNumber += 1;
        int randomInt = (int) randomNumber;
        return randomInt;
    }

}
