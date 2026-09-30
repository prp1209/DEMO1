package exp_package_Strings;

public class Reversing_String
{

    public static void main(String[] args)
    {
        String s="Maths";

        String rev="";

        for(int i=s.length()-1;i>=0;i--)
        {

            rev=rev + s.charAt(i);
        }
        System.out.println(rev);
    }
}
//Reverse string “Test@59I” but ‘@59’ should not be reversed
//output : "Itse@59T"