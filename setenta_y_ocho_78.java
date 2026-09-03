public class setenta_y_ocho_78 {
    static class Animal {
        void sound() { System.out.println("Some generic animal sound"); }
    }
    static class Dog extends Animal {
        @Override
        void sound() { System.out.println("Dog barks: Woof!"); }
    }
    static class Cat extends Animal {
        @Override
        void sound() { System.out.println("Cat meows: Meow!"); }
    }

    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        a1.sound();
        a2.sound();
    }
}
