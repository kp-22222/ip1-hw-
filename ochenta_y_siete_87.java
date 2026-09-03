public class ochenta_y_siete_87 {
    interface Calculator {
        static int square(int x) {
            return x * x;
        }
        default void welcome() {
            System.out.println("Welcome to the Calculator (default method)");
        }
    }
    static class BasicCalculator implements Calculator {}

    public static void main(String[] args) {
        System.out.println("Square of 5 (static): " + Calculator.square(5));
        BasicCalculator bc = new BasicCalculator();
        bc.welcome();  // default method from implementing class
    }
}
