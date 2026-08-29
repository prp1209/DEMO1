package exp_package2;

public class Prmie_number_1to100 {

    public static void main(String[] args) {

        for(int j=2; j<=100; j++){
            boolean isprime=true;
            for(int i=2; i<j;i++){
                if(j%i==0){
                    isprime=false;
                    break;
                }
            }
            if(isprime){
                System.out.println(j + " is a prime number");
            }
        }

        }

}
