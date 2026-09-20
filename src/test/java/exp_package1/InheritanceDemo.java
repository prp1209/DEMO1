package exp_package1;

// Simple inheritance example showing constructor chaining, method overriding and polymorphism
class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println(name + " makes a sound");
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(String name, String breed) {
        super(name); // call parent constructor
        this.breed = breed;
    }

    @Override
    public void speak() {
        System.out.println(name + " the " + breed + " barks");
    }

    public void fetch() {
        System.out.println(name + " is fetching a ball");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Animal a = new Animal("Generic");
        a.speak();

        Dog d = new Dog("Rex", "Labrador");
        d.speak();
        d.fetch();

        // Polymorphism: reference type is Animal, actual object is Dog
        Animal p = new Dog("Buddy", "Beagle");
        p.speak();
        System.out.println("p instanceof Dog: " + (p instanceof Dog));

        // Downcast to call Dog-specific method
        if (p instanceof Dog) {
            ((Dog) p).fetch();
        }
    }
}
