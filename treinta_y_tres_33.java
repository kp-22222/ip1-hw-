public class treinta_y_tres_33 {
    static int count = 0;

    Q33_StaticVariableMethod() {
        count++;
    }

    static void showCount() {
        System.out.println("Count = " + count);
    }

    public static void main(String[] args) {
        new Q33_StaticVariableMethod();
        new Q33_StaticVariableMethod();
        new Q33_StaticVariableMethod();
        Q33_StaticVariableMethod.showCount();  // shared across all objects, prints 3
    }
}
