package exp_package2;

public class Tables {

    public static void main(String[] args) {
        //while loop : Print a multiplication table from 1 to 10,
        // but stop printing entirely when any result is divisible by 7 and greater than 30.
        // Use a labeled break.


        for(int i=1;i<=10;i++){
            for (int j=1;j<=10;j++){
                int result=i*j;
                if(result %7==0 && result>30){
                    break;
                }
                else{
                    System.out.println(i + " * " + j + " = " + result);
                }
            }
        }
    }
}
