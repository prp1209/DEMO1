package exp_package2;

public class typeOfMethods
{


    private String s;

    public static void Method1(String s, int a)
    {
        System.out.println("This is a static method with parameters: " + s + " and " + a);
    }
    public static void main(String[] args)
    {
        Method1("hello", 10);
        typeOfMethods obj = new typeOfMethods();
        obj.Method2("world", 20);
    }

    public void Method2(String s, int a)
    {
        System.out.println("This is a non-static method with parameters: " + s + " and " + a);
    }
}
