package activities;
import java.util.Scanner;

public class WhileLoopCounter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int i = 1;
        while ( i <= number) {
            System.out.println(i);
            i++;
        }

        input.close();
    }
}