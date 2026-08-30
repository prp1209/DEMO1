package exp_package2;

public class Primenumber_specific {

    //Write a program using for loop - Check the specific number is prime or not (use 2 factor logic)

    //2 factor is a number which is divisible by 1 and itself only.
    public static void main(String[] args) {


    int n=29;
    int count=0;

    for(int i=1;i<=n;i++){
        if (n%i==0){
            count++;
        }
    }

        if(count!=2)
        {
            System.out.println(n + " is not a prime number");
        }
        else{
            System.out.println(n + " is a prime number");
        }
    }
}

