public class sesenta_y_ocho_68 {
    interface Flyable {
        void fly();
    }
    interface Eatable {
        void eat();
    }
    static class Bird implements Flyable, Eatable {
        @Override
        public void fly() { System.out.println("Bird flies in the sky"); }
        @Override
        public void eat() { System.out.println("Bird eats seeds"); }
    }

    public static void main(String[] args) {
        Bird b = new Bird();
        b.fly();
        b.eat();
    }
}
