public class sesenta_60 {
    int id;
    String name;

    Q60_CopyConstructor(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // copy constructor
    Q60_CopyConstructor(Q60_CopyConstructor other) {
        this.id = other.id;
        this.name = other.name;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {
        Q60_CopyConstructor original = new Q60_CopyConstructor(1, "Original");
        Q60_CopyConstructor copy = new Q60_CopyConstructor(original);

        original.display();
        copy.display();
    }
}
