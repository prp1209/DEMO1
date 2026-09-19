package exp_package_Strings;

public class Uppercase_lowercase {

    public static void main(String[] args) {

        String s="StRING MIXED CaSe";
        String s1;

        System.out.println("Uppercase: " + s.toUpperCase());
        System.out.println("Lowercase: " + s.toLowerCase());

        // get each char from the string . Verify that is in uppercsase or lowercase
        // if it is in uppercase then convert it to lowercase and vice versa

        for(char ch: s.toCharArray()){
            if (Character.isUpperCase(ch)){
                s1= String.valueOf(ch).toLowerCase();
            } else {
                s1= String.valueOf(ch).toUpperCase();
            }
            System.out.print(s1);
        }
    }
}


