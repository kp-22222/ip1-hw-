import java.io.IOException;

public class ochenta_y_cinco_85 {
    static class Base {
        void readData() throws IOException {
            System.out.println("Base: reading data");
        }
    }
    static class Derived extends Base {
        @Override
        void readData() throws IOException {
            System.out.println("Derived: reading data with extra validation");
            // could throw new IOException("example") here
        }
    }

    public static void main(String[] args) {
        Base b = new Derived();
        try {
            b.readData();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
