package exp_package2;

public class Palindrome {

    public static void main(String[] args) {
        String name = "MADAM";
        String rev = "";

        for (char c : name.toCharArray()) {
            rev = c + rev; // build reversed string
        }

        System.out.println(name.equals(rev) ? name + " is a palindrome" : name + " is not a palindrome");
    }
}
