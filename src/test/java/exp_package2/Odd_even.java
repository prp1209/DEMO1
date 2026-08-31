package exp_package2;

import java.util.Scanner;

public class Odd_even {
    //Java program to Find Odd or Even number

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();

        if(num%2==0){
            System.out.println("this number is even" + " " + num);
        } else {
            System.out.println("this number is odd" + " " + num);
        }
    }
}
