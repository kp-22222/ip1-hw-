public class setenta_y_cuatro_74 {
    static int countVowels(String s) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char c : s.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "Education is powerful";
        System.out.println("Number of vowels: " + countVowels(str));
    }
}
