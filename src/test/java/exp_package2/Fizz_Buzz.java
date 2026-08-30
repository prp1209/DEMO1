package exp_package2;

public class Fizz_Buzz {
    //Program: Fizz-Buzz range from 1-50
    //when the number is divisible by 2 --> print "Fizz"
    //when the numbe ris divisible by 5 --> print "Buzz"
    //when the number is divisible by 2 & 5 --> "FizzBuzz"
    //for remaining number print the "number"

    public static void main(String[] args) {

        int n=50;
        for(int i=1;i<=n;i++){

            if(i%2==0 && i%5==0){
                System.out.println("FizzBuzz");
            }
            else if(i%2==0){
                System.out.println("Fizz");
            }
            else if(i%5==0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }
}
