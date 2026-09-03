public class ochenta_y_ocho_88 {
    static class Animal {}
    static class Dog extends Animal {}
    static class Cat extends Animal {}

    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        System.out.println("a1 instanceof Dog: " + (a1 instanceof Dog));
        System.out.println("a1 instanceof Cat: " + (a1 instanceof Cat));
        System.out.println("a1 instanceof Animal: " + (a1 instanceof Animal));
        System.out.println("a2 instanceof Cat: " + (a2 instanceof Cat));
    }
}
