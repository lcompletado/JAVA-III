package activities;
import java.util.Scanner;

public class RectangleAreaCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length: ");
        float len = input.nextFloat();

        System.out.print("Enter width: ");
        float wid = input.nextFloat();
        
        float area = (len * wid);
        System.out.println("The area of the triangle is: " + area);
    
        input.close();
    }
}
