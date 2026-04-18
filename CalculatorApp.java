import java.util.Scanner;

public class CalculatorApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double num1 = 0, num2 = 0, result = 0;
        char operator;
        boolean valid = true;

        System.out.println("Choose option:");
        System.out.println("+ Addition");
        System.out.println("- Subtraction");
        System.out.println("* Multiplication");
        System.out.println("/ Division");
        System.out.println("% Modulus");
        System.out.println("s Square root");
        System.out.println("l Natural logarithm");

        System.out.print("Enter operator: ");
        operator = input.next().charAt(0);

        // Single input operations
        if (operator == 's' || operator == 'l') {

            System.out.print("Enter the number: ");
            num1 = input.nextDouble();

            if (operator == 's') {
                if (num1 >= 0) {
                    result = Math.sqrt(num1);
                } else {
                    System.out.println("Error: negative number not allowed for square root");
                    valid = false;
                }
            } else if (operator == 'l') {
                if (num1 > 0) {
                    result = Math.log(num1);
                } else {
                    System.out.println("Error: non-positive number not allowed");
                    valid = false;
                }
            }

        } else {
            // Two input operations
            System.out.print("Enter first number: ");
            num1 = input.nextDouble();

            System.out.print("Enter second number: ");
            num2 = input.nextDouble();

            switch (operator) {

                case '+':
                    result = num1 + num2;
                    break;

                case '-':
                    result = num1 - num2;
                    break;

                case '*':
                    result = num1 * num2;
                    break;

                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Division by zero is not allowed");
                        valid = false;
                    }
                    break;

                case '%':
                    if (num2 != 0) {
                        result = num1 % num2;
                    } else {
                        System.out.println("Modulus by zero is not allowed");
                        valid = false;
                    }
                    break;

                default:
                    System.out.println("Invalid operator");
                    valid = false;
            }
        }

        if (valid) {
            System.out.println("Result: " + result);
        }

        input.close();
    }
}