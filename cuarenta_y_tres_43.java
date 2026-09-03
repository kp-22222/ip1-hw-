public class cuarenta_y_tres_43 {
    static void display(int a) {
        System.out.println("Integer: " + a);
    }
    static void display(String s) {
        System.out.println("String: " + s);
    }
    static void display(int a, String s) {
        System.out.println("Integer: " + a + ", String: " + s);
    }

    public static void main(String[] args) {
        display(10);
        display("Hello");
        display(5, "Test");
    }
}
