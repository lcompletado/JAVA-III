package activities;
import java.util.Scanner;

public class PositiveNumberChecker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter a number: ");
            number = input.nextInt();

            if (number < 0) {
                System.out.println("Invalid. Please enter a positive number.");
            }

        } while (number < 0);
            
        System.out.println("Thank you! You entered: " + number);

        input.close();
    }
    
}
