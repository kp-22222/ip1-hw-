public class noventa_y_cuatro_94 {
    static class A {
        void show() { System.out.println("A's show()"); }
    }
    static class B extends A {
        @Override
        void show() { System.out.println("B's show()"); }
    }
    static class C extends B {
        @Override
        void show() { System.out.println("C's show()"); }
    }

    public static void main(String[] args) {
        A ref = new C();
        ref.show();  // executes C's overridden version
    }
}
