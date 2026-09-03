public class cuarenta_y_ocho_48 {
    interface Greetable {
        default void greet() {
            System.out.println("Hello from default method");
        }
        static void info() {
            System.out.println("This is a static interface method");
        }
    }
    static class Person implements Greetable {}

    public static void main(String[] args) {
        Person p = new Person();
        p.greet();
        Greetable.info();
    }
}
