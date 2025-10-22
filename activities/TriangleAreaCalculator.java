package activities;
import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base: ");
        float base = input.nextFloat();

        System.out.print("Enter the height: ");
        float height = input.nextFloat();

        float area = (1f/2) * base * height;
        System.out.println("The area of the triangle: " + area);
    
        input.close();
    }
}