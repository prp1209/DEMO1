package exp_package2;

public class Sumofdigits {

    public static void main(String[] args) {
        int number =12345;
        // ex: 1+2+3+4+5

        int sum=0;
        for (;number >0;number=number/10){

            int digit= number%10;
            sum=sum +digit;
        }
        System.out.println(sum);
    }
}
