package exp_package_Strings;

public class Interview_04 {



    static String reverse(String str){

        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev + str.charAt(i);
        }

        return rev;
    }


    public static void main(String[] args) {
//        Write a program to reverse only the smallest and Largest words in a given string.
//                String str = "Java is Beautiful programming"
//        output = "Java si Beautiful gnimmargorp"



        String s = "Java is Beautiful programming programmingu";

        String[] str=s.split(" ");

        int minword=0;
        int maxword=0;

        // finding the minimum and largest index in the string
        for(int i=0;i< str.length;i++){
            if (str[i].length() < str[minword].length()) minword=i;
            if(str[i].length() > str[maxword].length()) maxword=i;
        }
        // finding the largest and smallest and reverse .

        String result="";
        for(int i=0; i< str.length;i++){
            if(i==minword || i==maxword){
                result=result + reverse(str[i]);
            }
            else {
                result= result + str[i];
            }
            if(i< str.length-1){
                result=result + " ";
            }
        }
        System.out.println(result);
    }
}
