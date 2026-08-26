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




































