package Oops;

// Simple inheritance example showing constructor chaining, method overriding and polymorphism and Method Overloading
class Animal { // parent class
    protected String name;

    public Animal(String name)
    {

        this.name = name;
    }

    public void speak()
    {

        System.out.println(name + " makes a sound");
    }
}


//-----------------------------------------------------------------------------------------------------------

class Dog extends Animal { // child class

    private String breed;

    public Dog(String name, String breed)
    {
        super(name); // call parent constructor
        this.breed = breed; // initialize breed of child class
    }

    @Override
    public void speak() {
        System.out.println(name + " the " + breed + " barks");
    }

    public void fetch()
    {

        System.out.println(name + " is fetching a ball");
    }

    public void fetch(String toy)
    {
        System.out.println(name + " is fetching a " + toy);
    }
}

//-----------------------------------------------------------------------------------------------------------


public class InheritanceDemo {
    public static void main(String[] args) {
        Animal a = new Animal("Generic");
        a.speak();

        Dog d = new Dog("Rex", "Labrador");
        d.speak();
        d.fetch();
        d.fetch("frisbee");

        // Polymorphism: reference type is Animal, actual object is Dog
        Dog p = new Dog("Buddy", "Beagle");
        p.speak();
        System.out.println("p instanceof Dog: " + true);

        // Downcast to call Dog-specific method
        p.fetch("stick");
    }
}
