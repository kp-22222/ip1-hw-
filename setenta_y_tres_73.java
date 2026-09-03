public class setenta_y_tres_73 {
    static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "madam";
        String s2 = "hello";
        System.out.println(s1 + " is palindrome: " + isPalindrome(s1));
        System.out.println(s2 + " is palindrome: " + isPalindrome(s2));
    }
}
