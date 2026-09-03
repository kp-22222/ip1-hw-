import java.util.Scanner;

public class setenta_y_dos_72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();

        int max = Math.max(a, b);
        int lcm = max;
        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                break;
            }
            lcm += max;
        }
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
        sc.close();
    }
}
