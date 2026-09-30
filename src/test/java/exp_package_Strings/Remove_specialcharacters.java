package exp_package_Strings;

public class Remove_specialcharacters {

    //Reverse string “Test@59I” but ‘@59’ should not be reversed
    //output : "Itse@59T"

    public static void main(String[] args)
    {
        String str="Test@59I";

    String result="";

    for(int i=1;i<=str.length()-1;i++)
    {
        char ch=str.charAt(i);

        if(Character.isLetter(ch))
        {
            result=ch+result;
        }
    }
        System.out.println(result);

    }
}
