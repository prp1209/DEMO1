package exp_package_Strings;

public class String_excerise_01 {

    public static String reverse(String input){

        //        Reverse alternative word:
//
//        give string input = "i am good guy";
//        string output = "i ma good yug";

        String rev="";
        for(int i=input.length()-1;i>=0;i++){
            rev=rev+input.charAt(i);

        }
        return rev;
    }

    public static void main(String args[])
    {
        String input="i am good guy";
        String[] word=input.split(" ");
        String result="";

        for(int i=0;i<=word.length;i++)
        {
            if(i%2!=0){
                result=result +reverse(word[i] + " ");

            }
            else {
                result = result + word[i] + " ";
            }
        }
        System.out.println(result);

    }
}
