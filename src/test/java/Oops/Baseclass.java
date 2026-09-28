package Oops;

public class Baseclass {

    private String name;

    void flat(){
        System.out.println("Flat is a type of house");
    }

    public static void main(String[] args) {

        Baseclass baseclass=new Baseclass();
        baseclass.flat();

        Baseclass baseclass1=new ParentClass();
        baseclass1.flat();
//        baseclass1.flat("Vijayanagara", 30);

        ParentClass parentClass=new ParentClass();
        parentClass.flat();
        parentClass.flat("Vijaynagara", 1200);
    }

}
