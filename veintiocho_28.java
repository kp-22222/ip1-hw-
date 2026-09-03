public class veintiocho_28 {
    int rollNo;
    String name;
    double marks;

    Q28_StudentClass(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Marks: " + marks);
    }

    public static void main(String[] args) {
        Q28_StudentClass s1 = new Q28_StudentClass(1, "Aarav", 88.5);
        s1.display();
    }
}
