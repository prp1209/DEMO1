package exp_package2;

import org.w3c.dom.ls.LSOutput;

public class Amstrong {

    public static void main(String[] args) {
        // ... (lines 10–26 not visible in the screenshot — likely variable
        // declarations for original_number, result, count, and input reading)

        int original_number=371;
        int count=0;
        int result=0;

        int n1 = original_number;
        while (n1 > 0) {
            int eachdigit = n1 % 10; // get the divider   // output 3

            result = result + (eachdigit*eachdigit*eachdigit);
            n1 = n1 / 10; //to update the value of n1
        }
        if (original_number == result)
        {
            System.out.println("the given number is Armstrong" + ":" + result);
        }
        else {
            System.out.println("The given number is not amstrong");
        }

    }
}







































    //ex : 153= 1*1*1 + 5*5*5 + 3*3*3 =153


//    public static void main(String[] args) {
//        // get a number for variable .
//
//        int original_number=199;
//        int n=original_number;
//
//        int count=0;
//        int result=0;
//
//        while(n>0){
//            n=n/10;
//            count++;
//        }
//
//        // get the First number present in original_number and multiply that exact which is coming on the count .
//        // ex: first number : 1 and then multiply 3 times as per the result which is present on the count variable .
//        // ex: 1*1*1
//
//        int n1=original_number;
//        while (n1>0){
//            int eachdigit= n1 %10; // get the divider  // output 3
//            System.out.println(eachdigit);
//            result += (int) Math.pow(eachdigit,count);
//            n1=n1/10;//to update the value of n1
//        }
//        if(original_number==result)
//        {
//            System.out.println("the given number is Amstrong" + ":" + result);
//        }
//        else {
//            System.out.println("The given number is not amstrong");
//        }
//
//   }
//}
