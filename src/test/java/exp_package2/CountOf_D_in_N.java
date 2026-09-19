package exp_package2;

public class CountOf_D_in_N {

    public static void main(String[] args) {

        int N=156789955;
        int D=9;

        int count=0;

        while(N>0)
        {
            if(N%10 == D){
                count ++;
            }
            N=N/10;
        }
        System.out.println("Count of D in N is: " + count);
    }
}

