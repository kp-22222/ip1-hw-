public class seis_6 {
    public static void main(String[] args) {
        int a = 5;
        System.out.println("Initial a = " + a);

        System.out.println("Prefix ++a = " + (++a));   // increments then returns
        System.out.println("Value after prefix: a = " + a);

        a = 5;
        System.out.println("Postfix a++ = " + (a++));  // returns then increments
        System.out.println("Value after postfix: a = " + a);

        a = 5;
        System.out.println("Prefix --a = " + (--a));
        System.out.println("Value after prefix decrement: a = " + a);

        a = 5;
        System.out.println("Postfix a-- = " + (a--));
        System.out.println("Value after postfix decrement: a = " + a);
    }
}
