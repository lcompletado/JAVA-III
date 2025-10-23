package activities;
import java.util.Scanner;

public class SumCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int i   = 1;
        int sum = 0;

       System.out.print("The sum from 1 to " + number + " is: ");

       while (i <= number) {
        sum += i;
        System.out.print(i);

        if (i < number) {
                System.out.print(" + ");
            }
            i++;
        }

        System.out.println(" = " + sum);

        input.close();
    }
}
