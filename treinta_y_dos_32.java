public class treinta_y_dos_32 {
    int age;
    String name;

    Q32_ThisKeyword(int age, String name) {
        this.age = age;   // 'this' resolves ambiguity between param and field
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }

    public static void main(String[] args) {
        Q32_ThisKeyword p = new Q32_ThisKeyword(20, "Riya");
        p.display();
    }
}
