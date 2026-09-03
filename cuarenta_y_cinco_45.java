public class cuarenta_y_cinco_45 {
    static abstract class Vehicle {
        abstract void start();
    }
    static class Car extends Vehicle {
        @Override
        void start() { System.out.println("Car starts with a key/button"); }
    }
    static class Bike extends Vehicle {
        @Override
        void start() { System.out.println("Bike starts with a kick/self-start"); }
    }

    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        v1.start();
        v2.start();
    }
}
