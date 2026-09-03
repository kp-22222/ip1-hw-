public class setenta_y_seis_76 {
    static int value;

    static {
        value = 100;
        System.out.println("Static block executed, value initialized to " + value);
    }

    static void showValue() {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        // static block runs once, before main, when class is loaded
        Q76_StaticBlockMethod.showValue();
    }
}
