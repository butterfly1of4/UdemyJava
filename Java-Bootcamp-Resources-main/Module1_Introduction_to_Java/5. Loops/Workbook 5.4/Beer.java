public class Beer {
    public static void main(String[] args) {
        // See detailed instructions on Learn the Part.
        sing(99);
    }

    public static void sing( int i){ {
        for(i = 99; i >1; i--){
            System.out.println(i+ " bottles of beer on the wall, "+ i + " bottles of beer!");
            System.out.println("take one down, pass it around " +(i-1)+ ", bottles of beer on the wall!");
        };
    }
}
}
