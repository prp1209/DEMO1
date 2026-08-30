package exp_package2;

public class numberOfDigits {
    // program to find the number of digits in a given number 14578



    public static void main(String[] args) {
        int count=0;
        int n=14578;

        while(n!=0){
            n=n/10; // to remove the last number and count the number of digits
            count++;

        }
        System.out.println("Number of digits in " +" is: " + count);
    }
}
