public class treinta_y_cinco_35 {
    private String name;
    private int age;

    String getName() { return name; }
    void setName(String name) { this.name = name; }

    int getAge() { return age; }
    void setAge(int age) { this.age = age; }

    public static void main(String[] args) {
        Q35_PrivateFieldsGetterSetter p = new Q35_PrivateFieldsGetterSetter();
        p.setName("Kabir");
        p.setAge(21);
        System.out.println("Name: " + p.getName() + ", Age: " + p.getAge());
    }
}
