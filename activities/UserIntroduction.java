package activities;
import java.util.Scanner;

public class UserIntroduction {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = input.nextLine().trim();

        System.out.print("How old are you? ");
        int age = input.nextInt();
        input.nextLine();

        System.out.print("What is your favorite hobby? ");
        String hobby = input.nextLine().trim();

        System.out.println("Nice to meet you, " + name + "!");
        System.out.println("You are " + age + " years old and love " + hobby + "!");

        input.close();
    }
}
