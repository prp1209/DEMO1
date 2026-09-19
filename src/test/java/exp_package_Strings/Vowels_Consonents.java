package exp_package_Strings;

public class Vowels_Consonents {
    public static void main(String[] args) {

        //Java program to Count Vowels and Consonants in a given string "GoodmorningBadNight"

        String str="GoodmorningBadNight";

        int vowel=0 ;
        int consonent=0;

        for(char ch : str.toCharArray()){

            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                vowel++;
            }
            else if (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
                vowel++;
            }
            else {
                consonent++;
            }


        }
        System.out.println("Vowels: " + vowel);
        System.out.println("Consonents: " + consonent);
    }
}

