package exp_package2;

public class Calculator {
    public static void main(String[] args) {
        //Switch : Create a calculator program that asks the user to enter two numbers and an operator (+, -, *, /).
        // Use a switch statement to perform the operation and print the result.
        // Handle division by zero with an appropriate message.

        int num1=10;
        int num2=5;
        char operator='-';

        switch (operator) {
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
                break;
            case '*':
                System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
                break;
            case '/':
                if(num2==0){
                    System.out.println("Division by zero is not allowed.");
                } else {
                    System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
                }
                break;
            default:
                System.out.println("Invalid operator.");
        }
    }
}
