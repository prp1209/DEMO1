package exp_package2;

public class Fibonacci_series {
    public static void main(String[] args) {

        // number =15
        // 0+1+1+2+3+4+5+8+13+21+34+55+89+144
        int n=15;
        int first_number=0;
        int second_number=1;

        for(int i=0;i<n;i++){

            System.out.println(first_number + " ");
            int next_number = first_number +second_number;
            first_number=second_number;
            second_number=next_number;
        }
    }

}
