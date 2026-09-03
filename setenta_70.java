public class setenta_70 {
    private int age;

    int getAge() { return age; }

    void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("Invalid age: must be between 0 and 120");
        }
    }

    public static void main(String[] args) {
        Q70_EncapsulationValidation p = new Q70_EncapsulationValidation();
        p.setAge(25);
        System.out.println("Age: " + p.getAge());

        p.setAge(200);
        System.out.println("Age after invalid set: " + p.getAge());
    }
}
