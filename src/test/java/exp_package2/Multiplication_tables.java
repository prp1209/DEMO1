package exp_package2;

public class Multiplication_tables {

    //for loop : Print a multiplication table from 1 to 10,
    // but stop printing entirely when any result is divisible by 7 and greater than 30.
    // Use a labeled break.

    public static void main(String[] args) {

        outerLoop:
        for (int i=1;i<=10;i++){
            for(int j=1;j<=10;j++){
                int result=i*j;
                if(result %7==0 && result>30){
                 break outerLoop;
                }
                System.out.println(i + " * " + j + " = " + result);
            }

        }
    }
}

