public class cuarenta_y_seis_46 {
    static abstract class Machine {
        abstract void operate();  // abstract
        void powerOn() {          // concrete
            System.out.println("Machine powered on");
        }
    }
    static class Printer extends Machine {
        @Override
        void operate() { System.out.println("Printer is printing"); }
    }

    public static void main(String[] args) {
        Machine m = new Printer();
        m.powerOn();
        m.operate();
    }
}
