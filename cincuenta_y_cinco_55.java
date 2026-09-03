import java.util.Scanner;

public class cincuenta_y_cinco_55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = Math.abs(sc.nextInt());

        int count = 0;
        if (n == 0) {
            count = 1;
        } else {
            do {
                count++;
                n /= 10;
            } while (n != 0);
        }
        System.out.println("Number of digits: " + count);
        sc.close();
    }
}
