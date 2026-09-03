public class sesenta_y_dos_62 {
    String name;
    int age;

    Q62_OverrideToString(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }

    public static void main(String[] args) {
        Q62_OverrideToString p = new Q62_OverrideToString("Dev", 22);
        System.out.println(p);  // implicitly calls toString()
    }
}
