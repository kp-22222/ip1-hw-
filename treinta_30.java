public class treinta_30 {
    int x;

    // default constructor
    Q30_ConstructorOverloading() {
        x = 0;
        System.out.println("Default constructor called, x = " + x);
    }

    // parameterized constructor
    Q30_ConstructorOverloading(int x) {
        this.x = x;
        System.out.println("Parameterized constructor called, x = " + x);
    }

    public static void main(String[] args) {
        Q30_ConstructorOverloading obj1 = new Q30_ConstructorOverloading();
        Q30_ConstructorOverloading obj2 = new Q30_ConstructorOverloading(50);
    }
}
