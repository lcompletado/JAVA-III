package activities;
import java.util.Scanner;

public class LargestNumberFinder {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber  = input.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();

        System.out.print("Enter third number: ");
        int thirdNumber  = input.nextInt();

//      for finding largest number 
        int largest = firstNumber;

        if (secondNumber > largest) {
            largest = secondNumber;
            System.out.println("The largest number is: " + largest);
        }

        if (thirdNumber > largest) {
            largest = thirdNumber;
            System.out.println("The largest number is: " + largest);
        }

        System.out.println();

//      for finding if all numbers are equal
        if (firstNumber == secondNumber && secondNumber == thirdNumber) {
            System.out.println("All numbers are equal");
        } else if (firstNumber == secondNumber) {
            System.out.println("First number and second number are equal.");
        } else if (firstNumber == thirdNumber) {
            System.out.println("First number and third number are equal.");
        } else if (secondNumber == thirdNumber) {
            System.out.println("Second number and third number are equal.");
        }      
    
        input.close();
    }
}