package exp_package_constructor;

public class Animal {
    public static void main(String[] args) {

        Animal obj = new Animal();
        obj.display();
    }

    private void display() {
    }

    private Animal() {
        super();
    }
    public  class dog extends Animal {
        public void bark() {
            System.out.println("Woof!");
        }
    }
}
