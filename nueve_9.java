import java.util.Scanner;

public class nueve_9 {
    static final double PI = 3.14159265358979;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        double circleArea = PI * r * r;
        System.out.println("Area of Circle: " + circleArea);

        System.out.print("Enter length and breadth of rectangle: ");
        double l = sc.nextDouble(), br = sc.nextDouble();
        double rectArea = l * br;
        System.out.println("Area of Rectangle: " + rectArea);

        System.out.print("Enter base and height of triangle: ");
        double base = sc.nextDouble(), h = sc.nextDouble();
        double triArea = 0.5 * base * h;
        System.out.println("Area of Triangle: " + triArea);

        sc.close();
    }
}
