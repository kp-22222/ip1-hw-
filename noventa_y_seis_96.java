public class noventa_y_seis_96 {
    static int sum(int a, int b) {
        return a + b;
    }
    static int sum(int... nums) {
        int total = 0;
        for (int n : nums) {
            total += n;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println("sum(2,3) [regular]: " + sum(2, 3));
        System.out.println("sum(1,2,3,4,5) [varargs]: " + sum(1, 2, 3, 4, 5));
        System.out.println("sum() [varargs, no args]: " + sum());
    }
}
