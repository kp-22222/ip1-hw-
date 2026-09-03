public class noventa_90 {
    static void show(int a, String b) {
        System.out.println("show(int, String): " + a + ", " + b);
    }
    static void show(String a, int b) {
        System.out.println("show(String, int): " + a + ", " + b);
    }

    public static void main(String[] args) {
        // compiler picks the overload based on the order/type of arguments
        show(10, "Hello");
        show("World", 20);
    }
}
