public class setenta_y_cinco_75 {
    double radius;
    static final double PI = 3.14159265358979;

    Q75_CircleClass(double radius) {
        this.radius = radius;
    }

    double area() { return PI * radius * radius; }
    double circumference() { return 2 * PI * radius; }

    public static void main(String[] args) {
        Q75_CircleClass c = new Q75_CircleClass(7.0);
        System.out.println("Area: " + c.area());
        System.out.println("Circumference: " + c.circumference());
    }
}
