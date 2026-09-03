public class cincuenta_y_seis_56 {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 1 and 1000:");
        for (int n = 1; n <= 1000; n++) {
            int temp = n, sum = 0, digits = String.valueOf(n).length();
            while (temp != 0) {
                int d = temp % 10;
                sum += Math.pow(d, digits);
                temp /= 10;
            }
            if (sum == n) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }
}
