public class ochenta_y_seis_86 {
    static abstract class Vehicle {
        abstract void start();

        final void checkFuel() {
            System.out.println("Checking fuel level... (cannot be overridden)");
        }
    }
    static class Bike extends Vehicle {
        @Override
        void start() { System.out.println("Bike started"); }
    }

    public static void main(String[] args) {
        Bike b = new Bike();
        b.checkFuel();
        b.start();
    }
}
