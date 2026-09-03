public class cincuenta_y_nueve_59 {
    double length, width;

    Q59_RectangleClass(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() { return length * width; }
    double perimeter() { return 2 * (length + width); }

    public static void main(String[] args) {
        Q59_RectangleClass r = new Q59_RectangleClass(5.0, 3.0);
        System.out.println("Area: " + r.area());
        System.out.println("Perimeter: " + r.perimeter());
    }
}
