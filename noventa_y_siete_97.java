public class noventa_y_siete_97 {
    static class Base {
        Base() {
            System.out.println("Base no-arg constructor");
        }
        Base(int x) {
            System.out.println("Base constructor with x = " + x);
        }
    }
    static class Derived extends Base {
        Derived() {
            this(10);  // chains to Derived(int)
            System.out.println("Derived no-arg constructor");
        }
        Derived(int y) {
            super(y);  // chains to Base(int)
            System.out.println("Derived constructor with y = " + y);
        }
    }

    public static void main(String[] args) {
        new Derived();
    }
}
