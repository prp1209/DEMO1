package exp_package_Strings;

public class Reversing_String
{

    public static void main(String[] args)
    {

        String s="Pawan Kumar";

        String[] words = s.split("\\s+");
        for (int i = words.length - 1; i >= 0; i--)
        {
            System.out.print(words[i]);
            if (i > 0)
            {
                System.out.print(" ");
            }
        }
    }
}
