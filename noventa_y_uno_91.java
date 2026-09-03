import java.util.Arrays;

public class noventa_y_uno_91 {
    static class Person implements Comparable<Person> {
        String name;
        int age;
        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        @Override
        public int compareTo(Person other) {
            return this.age - other.age;
        }
        @Override
        public String toString() {
            return name + "(" + age + ")";
        }
    }

    public static void main(String[] args) {
        Person[] people = {
            new Person("Ravi", 30),
            new Person("Amit", 25),
            new Person("Sara", 28)
        };
        Arrays.sort(people);
        System.out.println("Sorted by age: " + Arrays.toString(people));
    }
}
