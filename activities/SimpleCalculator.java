package activities;
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();

        int sum         = (firstNumber + secondNumber);
        int difference  = (firstNumber - secondNumber);
        int product     = (firstNumber * secondNumber);

        System.out.println();
        System.out.println("Results:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        
        if (secondNumber != 0) {
        float quotient  = (firstNumber / secondNumber);
        int remainder   = (firstNumber % secondNumber);

        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        } else {
            System.out.println("Quotient: Cannot divide by zero");
            System.out.println("Remainder: Cannot divide by zero");
        } 

        input.close();
    }
}
