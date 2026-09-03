public class veinticuatro_24 {
    static boolean isPalindrome(int num) {
        int original = num, reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return original == reversed;
    }

    public static void main(String[] args) {
        int number = 12321;
        System.out.println(number + " is palindrome: " + isPalindrome(number));

        number = 12345;
        System.out.println(number + " is palindrome: " + isPalindrome(number));
    }
}
