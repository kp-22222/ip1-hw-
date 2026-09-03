public class noventa_y_dos_92 {
    static abstract class Shape {
        String name;
        Shape(String name) {
            this.name = name;
            System.out.println("Shape constructor called for: " + name);
        }
        abstract void draw();
    }
    static class Square extends Shape {
        Square() {
            super("Square");  // abstract class constructor invoked here
        }
        @Override
        void draw() { System.out.println("Drawing a " + name); }
    }

    public static void main(String[] args) {
        Square s = new Square();
        s.draw();
    }
}
