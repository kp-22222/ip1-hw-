public class ochenta_y_nueve_89 {
    private static Q89_PrivateConstructorSingleton instance;

    private Q89_PrivateConstructorSingleton() {
        System.out.println("Singleton instance created");
    }

    static Q89_PrivateConstructorSingleton getInstance() {
        if (instance == null) {
            instance = new Q89_PrivateConstructorSingleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        Q89_PrivateConstructorSingleton s1 = Q89_PrivateConstructorSingleton.getInstance();
        Q89_PrivateConstructorSingleton s2 = Q89_PrivateConstructorSingleton.getInstance();

        System.out.println("s1 == s2: " + (s1 == s2));  // true, same instance
    }
}
