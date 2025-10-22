package activities;
import java.util.Scanner;

public class NumberPrinter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int number = input.nextInt();

        for(int i = 1; i <= number; i++) {
            System.out.println(i);
        }

        input.close();
    }
}
