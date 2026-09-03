public class treinta_y_ocho_38 {
    static class A {
        A() { System.out.println("Constructor A called"); }
    }
    static class B extends A {
        B() { System.out.println("Constructor B called"); }
    }
    static class C extends B {
        C() { System.out.println("Constructor C called"); }
    }

    public static void main(String[] args) {
        C obj = new C();  // triggers A -> B -> C constructor chaining
    }
}
