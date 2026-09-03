public class cuarenta_y_uno_41 {
    static class Shape {
        void draw() { System.out.println("Generic shape"); }
    }
    static class Circle extends Shape {
        @Override
        void draw() { System.out.println("Circle drawn"); }
    }
    static class Rectangle extends Shape {
        @Override
        void draw() { System.out.println("Rectangle drawn"); }
    }

    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();

        for (Shape s : shapes) {
            s.draw();  // runtime polymorphism
        }
    }
}
