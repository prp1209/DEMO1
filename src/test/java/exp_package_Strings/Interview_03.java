package exp_package_Strings;

public class Interview_03 {

    public static void main(String[] args) {

//        Write a program to count number of upper case and lower case letter
//      String s = "WelcomE to JavA AutomAtioN"


        String s = "WelcomE to JavA AutomAtioN";


        int uppercase=0;
        int lowercase=0;

        char[] chr=s.toCharArray();

     for(char ch : chr){

         if(Character.isUpperCase(ch))
             uppercase++;
         else if (Character.isLowerCase(ch)) {
             lowercase++;
         }

     }
        System.out.println(uppercase);
        System.out.println(lowercase);
    }
}
