package activities;
import java.util.Scanner;

public class GradingSystem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your score from 0 - 100: ");
        int score = input.nextInt();

        char grade;

        if (score >= 90 && score <= 100) {
            grade = 'A';
        } else if (score >= 80){
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Your grade is " + grade);
        input.close();
    }
}

