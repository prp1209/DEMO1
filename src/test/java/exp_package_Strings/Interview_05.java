package exp_package_Strings;

public class Interview_05 {

    //nput- This is a tcs interview
    // output- weivretni sct a si sihT

    static  String reverse(String words){
        String rev="";
        for(int i=words.length()-1;i>=0;i--){
            rev=rev+words.charAt(i);
        }
        return words;
    }

    public static void main(String[] args) {
        String s="This is a TCS interview";
        String[] words=s.split("");

        String result = "";

        for(int i=0;i<words.length;i++) {

            result =reverse(words[i])+ result;
        }
        System.out.println(result);
    }
}
