package activities;
import java.util.Scanner;

public class LargestNumberFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();

        System.out.print("Enter third number: ");
        int thirdNumber = input.nextInt();

        if (firstNumber == secondNumber && secondNumber == thirdNumber) {
            System.out.println("All numbers are equal.");
        } else {
            int largest = firstNumber;

            if (secondNumber > largest) largest = secondNumber;
            if (thirdNumber > largest) largest = thirdNumber;

            System.out.println("The largest number is: " + largest);
        }

        input.close();
    }
}
