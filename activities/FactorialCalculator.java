package activities;
import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int factorial = 1;

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.print("The factorial of " + number + " is: ");

        for (int i = 1; i <= number; i++) {
            factorial *= i;
            System.out.print(i);

        if (i < number) {
            System.out.print(" x ");
        }
    }


        System.out.print(" = " + factorial);
        input.close();
    }
}