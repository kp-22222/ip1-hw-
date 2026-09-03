public class cuarenta_y_siete_47 {
    interface Drawable {
        void draw();
    }
    static class Circle implements Drawable {
        @Override
        public void draw() { System.out.println("Drawing Circle"); }
    }
    static class Square implements Drawable {
        @Override
        public void draw() { System.out.println("Drawing Square"); }
    }

    public static void main(String[] args) {
        Drawable d1 = new Circle();
        Drawable d2 = new Square();
        d1.draw();
        d2.draw();
    }
}
