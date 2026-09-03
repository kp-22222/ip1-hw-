public class cincuenta_y_uno_51 {
    public static void main(String[] args) {
        int a = 15, b = 25;
        System.out.println("Before swap: a=" + a + " b=" + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swap: a=" + a + " b=" + b);
    }
}
