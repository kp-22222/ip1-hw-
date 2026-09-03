public class noventa_y_cinco_95 {
    static class Animal {
        Animal reproduce() {
            System.out.println("Animal reproduces");
            return new Animal();
        }
    }
    static class Dog extends Animal {
        @Override
        Dog reproduce() {  // covariant return type: Dog is a subclass of Animal
            System.out.println("Dog reproduces a puppy");
            return new Dog();
        }
    }

    public static void main(String[] args) {
        Animal a = new Dog();
        Animal offspring = a.reproduce();
        System.out.println("Offspring class: " + offspring.getClass().getSimpleName());
    }
}
