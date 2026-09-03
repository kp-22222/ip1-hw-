public class sesenta_y_tres_63 {
    static abstract class Shape {
        abstract void draw();
    }
    static class Circle extends Shape {
        @Override
        void draw() { System.out.println("Drawing Circle"); }
    }
    static class Rectangle extends Shape {
        @Override
        void draw() { System.out.println("Drawing Rectangle"); }
    }
    static class Triangle extends Shape {
        @Override
        void draw() { System.out.println("Drawing Triangle"); }
    }

    public static void main(String[] args) {
        Shape[] shapes = { new Circle(), new Rectangle(), new Triangle() };
        for (Shape s : shapes) {
            s.draw();
        }
    }
}
