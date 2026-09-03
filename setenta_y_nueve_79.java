public class setenta_y_nueve_79 {
    static abstract class Shape {
        abstract double area();
        abstract double volume();
    }
    static class Cube extends Shape {
        double side;
        Cube(double side) { this.side = side; }
        @Override
        double area() { return 6 * side * side; }
        @Override
        double volume() { return side * side * side; }
    }

    public static void main(String[] args) {
        Cube c = new Cube(3.0);
        System.out.println("Surface Area: " + c.area());
        System.out.println("Volume: " + c.volume());
    }
}
