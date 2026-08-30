package exp_package2;

public class Reverse_numbers {

    //program to reverse the given number input=14578 , output=87541 using logic inside method

    public static void main(String[] args) {
        int n=14578;
        int reverse=0;

        while(n!=0){
            int remainder=n%10; // to get the last digit of the number
            reverse=reverse*10+remainder; // to reverse the number
            n=n/10; //  to remove the last digit of the number

        }
        System.out.println("Reverse of the given number is: " + reverse);
    }
}
