package Oops;

public class ParentClass extends  Baseclass {

    public  String name;
    private int size;

    public  void flat(String name, int size){
        System.out.println(" Flat belongs to base class");
        System.out.println("size is 30*40");
        
        this.name=name;
        this.size=size;
        
    }

    @Override
    void flat() {
        super.flat();
    }
    
    public  void flat1(){
        System.out.println("Method Overloading");
    }

    //-----------------------------------------------------------------------------------------------------

    public int getElementCount(String locator) {
        return 67;
    }

//    // ❌ COMPILE ERROR if uncommented — same name, same params, only return type differs
//     public String getElementCount(String locator) {
//         return "5 elements found";
//     }

    // ✅ Valid only if parameter list also changes
    public String getElementCount(String locator, boolean asText) {
        return "5 elements found";
    }

    public static void main(String[] args) {
        ParentClass obj = new ParentClass();
        System.out.println(obj.getElementCount("div.item"));
        System.out.println(obj.getElementCount("div.item", true));
    }
}
