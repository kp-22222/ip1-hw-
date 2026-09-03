public class ochenta_y_cuatro_84 {
    final int constant = 100;

    final void display() {
        System.out.println("Constant value: " + constant);
    }

    public static void main(String[] args) {
        Q84_FinalVariableMethod obj = new Q84_FinalVariableMethod();
        obj.display();
        // obj.constant = 200;   // Compile error: cannot assign a value to final variable
        // final methods cannot be overridden by any subclass
        System.out.println("A 'final' variable's value cannot be reassigned, " +
                "and a 'final' method cannot be overridden in a subclass.");
    }
}
