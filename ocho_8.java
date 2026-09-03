import java.util.Scanner;

public class ocho_8 {
    public static void main(String[] args) {
        final double FACTOR = 9.0 / 5.0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * FACTOR) + 32;
        System.out.println(celsius + " Celsius = " + fahrenheit + " Fahrenheit");
        sc.close();
    }
}
