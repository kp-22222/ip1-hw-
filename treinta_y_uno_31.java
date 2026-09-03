public class treinta_y_uno_31 {
    String brand;
    String model;

    Q31_CarClass(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    void display() {
        System.out.println("Brand: " + brand + ", Model: " + model);
    }

    public static void main(String[] args) {
        Q31_CarClass car1 = new Q31_CarClass("Toyota", "Corolla");
        Q31_CarClass car2 = new Q31_CarClass("Honda", "Civic");
        car1.display();
        car2.display();
    }
}
