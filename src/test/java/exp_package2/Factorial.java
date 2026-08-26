package exp_package2;

public class Factorial {

    //ex: 5! = 5 × 4 × 3 × 2 × 1 = 120

    public static void main(String[] args) {


        int original_number = 5;
        int fact = 1;

        for (int i=1; i<=original_number;i++){
            fact=fact *i;
        }
        System.out.println(fact);

    }


}
