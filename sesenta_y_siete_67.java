public class sesenta_y_siete_67 {
    interface Vehicle {
        default void horn() {
            System.out.println("Beep beep! (default)");
        }
        static void info() {
            System.out.println("Vehicles help with transportation (static)");
        }
    }
    static class Truck implements Vehicle {}

    public static void main(String[] args) {
        Truck t = new Truck();
        t.horn();
        Vehicle.info();
    }
}
