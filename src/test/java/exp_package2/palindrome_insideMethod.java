package exp_package2;

public class palindrome_insideMethod {


    public static void  Palindrome(String s){

        String rev= "";


        for( char c : s.toCharArray()){
            rev=c+rev;

        }
        System.out.println("Reverse of the string is: " + rev);

    }
    public static void main(String[] args) {

        //Java program to find Palindrome number use logic inside method

        Palindrome("Pawan");
    }
}