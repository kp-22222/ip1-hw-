public class treinta_y_nueve_39 {
    static class Shape {
        void draw() {
            System.out.println("Drawing a generic shape");
        }
    }
    static class Circle extends Shape {
        @Override
        void draw() { System.out.println("Drawing a Circle"); }
    }
    static class Rectangle extends Shape {
        @Override
        void draw() { System.out.println("Drawing a Rectangle"); }
    }

    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();
        s1.draw();
        s2.draw();
    }
}
