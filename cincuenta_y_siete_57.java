public class cincuenta_y_siete_57 {
    static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n && n != 0;
    }

    public static void main(String[] args) {
        int number = 28;
        System.out.println(number + " is perfect: " + isPerfect(number));

        number = 15;
        System.out.println(number + " is perfect: " + isPerfect(number));
    }
}
