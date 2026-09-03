public class ochenta_80 {
    interface Resizable {
        void resize(double factor);
    }
    static class Rectangle implements Resizable {
        double length, width;
        Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }
        @Override
        public void resize(double factor) {
            length *= factor;
            width *= factor;
        }
        void display() {
            System.out.println("Length: " + length + ", Width: " + width);
        }
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(4, 2);
        r.display();
        r.resize(2.0);
        System.out.println("After resizing:");
        r.display();
    }
}
