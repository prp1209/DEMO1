package exp_package_constructor;

public class Constructor {

    public Constructor(){
        System.out.println("defualt constructor");
    }

    public void constructor(int a , String b , Boolean c)
    {
        System.out.println("parameterized constructor");
        System.out.println("Integer value: " + a);
        System.out.println("String value: " + b);
        System.out.println("Boolean value: " + c);
    }

    public static void main(String[] args) {
        Constructor cons=new Constructor();
        cons.constructor(10,"Pawan",true);
    }
}
