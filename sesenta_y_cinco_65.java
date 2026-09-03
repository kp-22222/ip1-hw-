public class sesenta_y_cinco_65 {
    static abstract class Bird {
        void fly() {
            System.out.println("Bird is flying");
        }
        abstract void makeSound();
    }
    static class Sparrow extends Bird {
        @Override
        void makeSound() { System.out.println("Chirp chirp"); }
    }
    static class Crow extends Bird {
        @Override
        void makeSound() { System.out.println("Caw caw"); }
    }

    public static void main(String[] args) {
        Bird b1 = new Sparrow();
        Bird b2 = new Crow();
        b1.fly(); b1.makeSound();
        b2.fly(); b2.makeSound();
    }
}
