import javax.sound.midi.SysexMessage;

public class JoiningStrings {
    public static void main(String[] args) {
        //strings
        int year = 2010;
        String winner = "Spain";

        String announcement = " The winner of the " + year + " world cup are " + winner;
        System.out.println(announcement);

    }
}

