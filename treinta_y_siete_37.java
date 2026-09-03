public class treinta_y_siete_37 {
    static class Parent {
        Parent() {
            System.out.println("Parent constructor called");
        }
        void greet() {
            System.out.println("Hello from Parent");
        }
    }

    static class Child extends Parent {
        Child() {
            super();  // calls parent constructor
            System.out.println("Child constructor called");
        }
        void greet() {
            super.greet();  // calls parent method
            System.out.println("Hello from Child");
        }
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.greet();
    }
}
