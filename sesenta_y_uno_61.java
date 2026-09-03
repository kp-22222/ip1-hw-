public class sesenta_y_uno_61 {
    static class Employee {
        String name;
        double salary;
        Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }
        void display() {
            System.out.println("Name: " + name + ", Salary: " + salary);
        }
    }

    static class Manager extends Employee {
        double bonus;
        Manager(String name, double salary, double bonus) {
            super(name, salary);  // calling parent constructor
            this.bonus = bonus;
        }
        @Override
        void display() {
            super.display();
            System.out.println("Bonus: " + bonus);
        }
    }

    public static void main(String[] args) {
        Manager m = new Manager("Sanya", 80000, 15000);
        m.display();
    }
}
