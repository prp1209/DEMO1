package exp_package_Strings;

public class Practice4 {
    public static void main(String[] args) {
//        Write a program to reverse only the smallest and Largest words in a given string.
//                String str = "Java is Beautiful programming"
//        output = "Java si Beautiful gnimmargorp"


        // STEP1 : GET THE WORDS AND SPLIT INTO DIFFERENT WORD


        String str = "Java is Beautiful programming";
        String[] word=str.split(" ");

        String reverse="";
        String reverseword = "";
        char[] ch=str.toCharArray();

            for (int i = ch.length - 1; i >= 0; i--) {

                reverseword = reverseword + ch[i];
            }
            reverse = reverse + reverseword + " ";
        {
            System.out.println(reverse);
        }
        }





    }

