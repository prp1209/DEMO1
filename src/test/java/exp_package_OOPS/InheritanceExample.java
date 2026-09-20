package exp_package_OOPS;

// Demonstrates inheritance: single-level, multilevel, constructor chaining, overriding and polymorphism
class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
        System.out.println("Person constructor: " + name);
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name);
    }
}

class Employee extends Person {
    protected String company;

    public Employee(String name, String company) {
        super(name);
        this.company = company;
        System.out.println("Employee constructor: " + name + " @" + company);
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + name + ", I work at " + company);
    }

    public void work() {
        System.out.println(name + " is working at " + company);
    }
}

class Manager extends Employee {
    private int teamSize;

    public Manager(String name, String company, int teamSize) {
        super(name, company);
        this.teamSize = teamSize;
        System.out.println("Manager constructor: " + name + " manages " + teamSize);
    }

    @Override
    public void work() {
        System.out.println(name + " is managing a team of " + teamSize + " at " + company);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Person p = new Person("Alex");
        p.introduce();

        Employee e = new Employee("Sam", "Acme Corp");
        e.introduce();
        e.work();

        Manager m = new Manager("Nina", "Acme Corp", 5);
        m.introduce();
        m.work();

        // Polymorphism: reference type Person, actual object Manager
        Person poly = new Manager("Lee", "TechCo", 3);
        poly.introduce(); // calls Manager/Employee override chain
        // downcast to call Manager-specific work()
        if (poly instanceof Manager) {
            ((Manager) poly).work();
        }
    }
}
