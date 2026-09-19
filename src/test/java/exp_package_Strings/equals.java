package exp_package_Strings;

public class equals {


    public static void main(String[] args) {
        String s1="Hello";
        String s2="Hello";
        String s3=new String("Hello");

        System.out.println(s1==s2); // true
        System.out.println(s1==s3); // false
        System.out.println(s1.equals(s2)); // true

        StringBuilder builder=new StringBuilder();
        builder.append("Hello");
        String s4=builder.toString();
        System.out.println(s1==s4); // false
        System.out.println(s1.equals(s4)); // true
    }
}
