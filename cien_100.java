public class cien_100 {
    private String name;
    private int age;

    // no-arg constructor (required for Java Bean)
    public Q100_JavaBeanStyle() {}

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public static void main(String[] args) {
        Q100_JavaBeanStyle bean = new Q100_JavaBeanStyle();
        bean.setName("Ishaan");
        bean.setAge(20);
        System.out.println("Name: " + bean.getName() + ", Age: " + bean.getAge());
    }
}
