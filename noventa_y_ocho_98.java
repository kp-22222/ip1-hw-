public class noventa_y_ocho_98 {
    static abstract class Appliance {
        abstract void operate();       // abstract method
        void plugIn() {                // concrete method
            System.out.println("Appliance plugged in");
        }
    }
    static class WashingMachine extends Appliance {
        @Override
        void operate() { System.out.println("Washing machine is washing clothes"); }
    }

    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();
        wm.plugIn();
        wm.operate();
    }
}
