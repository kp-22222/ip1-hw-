public class sesenta_y_nueve_69 {
    static abstract class Animal {
        abstract void eat();
    }
    interface Pet {
        void play();
    }
    static class Dog extends Animal implements Pet {
        @Override
        void eat() { System.out.println("Dog eats food"); }
        @Override
        public void play() { System.out.println("Dog plays fetch"); }
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.play();
    }
}
