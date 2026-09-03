public class setenta_y_siete_77 {
    static void show(int a) {
        System.out.println("show(int): " + a);
    }
    static void show(double a) {
        System.out.println("show(double): " + a);
    }

    public static void main(String[] args) {
        int x = 10;
        show(x);       // matches show(int) exactly
        long y = 20;
        show(y);       // no show(long) exists -> promoted to double, calls show(double)
        float f = 5.5f;
        show(f);       // promoted to double
    }
}
