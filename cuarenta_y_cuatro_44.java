public class cuarenta_y_cuatro_44 {
    static void show(int a) {
        System.out.println("show(int): " + a);
    }
    static void show(double a) {
        System.out.println("show(double): " + a);
    }
    static void show(String a) {
        System.out.println("show(String): " + a);
    }

    public static void main(String[] args) {
        // Compiler decides which overload to call based on argument type,
        // at compile time -- this is compile-time (static) polymorphism.
        show(10);
        show(3.14);
        show("hello");
    }
}
