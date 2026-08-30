package exp_package2;

public class String_Length {
    public static void main(String[] args) {
        // calculate the length of the string without using length() method
        String s="Hello";
        int count=0;

        for(char c:s.toCharArray()){
            count++;
        }
        System.out.println("Length of the string is: " + count);

        //Using length() method
        String str= String.valueOf(s.length());
        System.out.println("Length of the string is: " + str);
    }
}
