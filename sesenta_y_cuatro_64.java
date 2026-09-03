public class sesenta_y_cuatro_64 {
    int rollNo;
    String name;

    Q64_StudentConstructorOverloading() {
        this.rollNo = 0;
        this.name = "Unknown";
    }

    Q64_StudentConstructorOverloading(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name);
    }

    public static void main(String[] args) {
        Q64_StudentConstructorOverloading s1 = new Q64_StudentConstructorOverloading();
        Q64_StudentConstructorOverloading s2 = new Q64_StudentConstructorOverloading(101, "Meera");
        s1.display();
        s2.display();
    }
}
