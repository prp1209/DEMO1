package exp_package2;

import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {

        //Write a program using conditional operator to check the max of 3 numbers

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1=sc.nextInt();
        System.out.println("Enter second number: ");
        int num2=sc.nextInt();
        System.out.println("Enter third number: ");
        int num3=sc.nextInt();

        int max = (num1 > num2) ? num1 : ((num2 > num3) ? num2 : num3);
        System.out.println("the max number is : " + max);



    }
}
