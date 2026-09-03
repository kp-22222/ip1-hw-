public class cuarenta_40 {
    static class Parent {
        void show() { System.out.println("Parent's show()"); }
    }
    static class Child extends Parent {
        @Override
        void show() { System.out.println("Child's show()"); }
    }

    public static void main(String[] args) {
        Parent p = new Child();
        p.show();  // dynamic dispatch -> executes Child's version
    }
}
