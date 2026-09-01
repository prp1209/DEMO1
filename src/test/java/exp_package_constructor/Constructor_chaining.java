package exp_package_constructor;

public class Constructor_chaining {
    String s;

    Constructor_chaining(){
        this.s="Hello";
        System.out.println("Default constructor");
    }

    public static void main(String[] args)
    {
            Constructor_chaining obj=new Constructor_chaining();
            obj.s="world";
            System.out.println("String value: " + obj.s);
    }
}
