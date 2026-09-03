import java.util.Scanner;

public class quince_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter four numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
        int max;

        if (a >= b) {
            if (a >= c) {
                if (a >= d) max = a;
                else max = d;
            } else {
                if (c >= d) max = c;
                else max = d;
            }
        } else {
            if (b >= c) {
                if (b >= d) max = b;
                else max = d;
            } else {
                if (c >= d) max = c;
                else max = d;
            }
        }
        System.out.println("Maximum number is: " + max);
        sc.close();
    }
}
