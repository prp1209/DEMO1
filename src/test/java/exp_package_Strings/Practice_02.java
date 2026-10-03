package exp_package_Strings;

public class Practice_02 {
//    Reverse string “Test@59I” but ‘@59’ should not be reversed
//    output : "Itse@59T"

    public static void main(String[] args) {

        String str="Test@59Idhhdd";
        String rev="";
        String spec="";
        int index=0;

        // finding index the special character and numbers
        for(int i=0;i<str.length();i++) {
            if (Character.isSpaceChar(str.charAt(i)) || Character.isDigit(str.charAt(i))) {
                index = i;
                break;
            }
        }

                // Seperating the Special character
                for(int i=str.length()-1;i>=0;i--){
                    if(str.charAt(i)=='5' || str.charAt(i) == '9' || str.charAt(i)=='@'){
                        spec=str.charAt(i)+spec;
                }
                    else {
                        rev=rev+str.charAt(i);
            }

        }
//        System.out.println(rev);

        System.out.println(rev.replaceFirst("T" , spec ) + str.charAt(0));

    }
}
