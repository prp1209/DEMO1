package exp_package_Strings;

public class Practice5 {
    public static void main(String[] args) {
//        Input: JavApRogr2m
//        Output: J@@A@R@@@&@

        String s="JavApRogr2m";

        int length=s.length();
        String result="";

        for(int i=0;i<length;i++){
            char c = s.charAt(i);
            if(Character.isLowerCase(c))
            {
               result=result+"@";
            }
            else {
               result=result+c;
            }
        }
        System.out.println(result);

    }
}
