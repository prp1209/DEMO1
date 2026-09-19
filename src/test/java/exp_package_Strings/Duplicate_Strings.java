package exp_package_Strings;

public class Duplicate_Strings {

    public static void main(String[] args) {
        //Java program to print duplicate characters in a string "Programming"

        String str = "Programming";
        int count;

        str.equalsIgnoreCase("");
        char[] ch=str.toCharArray();
        System.out.println("Duplicate characters in the string: ");
        for (int i=0; i<str.length(); i++)
        {
            for(int j=i+1; j<str.length(); j++)
            {
                if (ch[i] == ch[j])
                {
                    System.out.println(ch[j]);
                    break;
                }
            }
        }
    }
}
