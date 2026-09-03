public class ochenta_y_tres_83 {
    static long factorialIterative(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    static long factorialRecursive(int n) {
        if (n <= 1) return 1;
        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println("Iterative factorial of " + n + " = " + factorialIterative(n));
        System.out.println("Recursive factorial of " + n + " = " + factorialRecursive(n));
    }
}
