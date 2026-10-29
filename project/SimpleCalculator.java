import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double firstNumber = input.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = input.next().charAt(0);

        System.out.print("Enter the second number: ");
        double secondNumber = input.nextDouble();

        double result = 0;
        boolean validOperation = true;

        switch (operator) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                if (secondNumber == 0) {
                    System.out.println("Error: Cannot divide by zero.");
                    validOperation = false;
                } else {
                    result = firstNumber / secondNumber;
                }
                break;
            default:
                System.out.println("Error: Unsupported operator.");
                validOperation = false;
        }

        if (validOperation) {
            System.out.println("Result: " + result);
        }

        input.close();
    }
}