package exp_package_Strings;

public class practice_04
{
    public static void main(String[] args)
    {
        String str = "Paawan JAAVA";
        // step 1: convert string into char
        // by using for find out the occurance of char
        // step 3 : count

        char[] ch=str.toCharArray();

        boolean[] b=new boolean[ch.length];
        String[] s=str.split(" ");

        for(int i=0;i<ch.length;i++){
            if(b[i]) // skips the character after count
            continue;
            int count=1; // reset teh count of a word
            for (int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]) {
                    count++;
                    b[j] = true; //

                }
            }
            System.out.print(ch[i] + "=" + count + " ");
        }
    }
}
