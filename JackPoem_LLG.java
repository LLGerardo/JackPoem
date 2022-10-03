public class Lauraplayground_week_2_Assignment_2 {
    public static void main(String[] args) {
        //each segment is built upon eachother
        System.out.println("This is the house that jack built");
        System.out.println();
        System.out.println("This is the malt");
        One();
        System.out.println("This is the rat,");
        Two();
        System.out.println("This is the cat,");
        Three();
        System.out.println("This is the dog,");
        Four();
        System.out.println("This is the cow with the crumbled horn");
        Five();
        System.out.println("This is the maiden all forlorn");
        Six();

    }

    public static void
    One() {
        System.out.println("That lay in the house that Jack built.");
        System.out.println();
    }

    // instead of re-typing each line I just appended it to the beginning using this formatted method
    public static void
    Two() {
        System.out.println("That ate the malt");
        One();
    }

    public static void
    Three() {
        System.out.println("That killed the rat,");
        Two();
    }

    /*doing this each method could be two lines and still functional
     a lot easier to understand from a human perspective*/

    /* there is also the advantage that if I need to fix a typo
    I can just go back and fix a single line to fix it in every spot
    just as I had to do when I initially for the comma after rat
     */
    public static void
    Four() {
        System.out.println("That worried the cat,");
        Three();
    }

    public static void
    Five() {
        System.out.println("That tossed the dog,");
        Four();
    }

    public static void
    Six() {
        System.out.println("That milked the cow with the crumpled horn,");
        Five();
    }
}
