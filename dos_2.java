public class dos_2 {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("Before swap (with temp): a=" + a + " b=" + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap (with temp): a=" + a + " b=" + b);

        a = 10; b = 20;
        System.out.println("Before swap (no temp): a=" + a + " b=" + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap (no temp, arithmetic): a=" + a + " b=" + b);
    }
}
