public class veintinueve_29 {
    double length, breadth, height;

    Q29_BoxClass(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    double volume() {
        return length * breadth * height;
    }

    public static void main(String[] args) {
        Q29_BoxClass box = new Q29_BoxClass(2.0, 3.0, 4.0);
        System.out.println("Volume of Box: " + box.volume());
    }
}
