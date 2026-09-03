public class siete_7 {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = new String("hello");

        System.out.println("s1 == s2 : " + (s1 == s2));         // compares references
        System.out.println("s1.equals(s2) : " + s1.equals(s2)); // compares content

        System.out.println("\nExplanation: '==' checks whether both references point to the " +
                "same object in memory. Since s1 and s2 are created with 'new', they are " +
                "different objects, so == is false. equals() compares the actual character " +
                "content, so it returns true.");
    }
}
