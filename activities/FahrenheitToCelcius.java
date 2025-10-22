package activities;
import java.util.Scanner;

public class FahrenheitToCelcius {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        float fahrenheit = input.nextFloat();

        float celcius = (fahrenheit - 32) * 5 / 9;
        System.out.printf("Temperature in Celcius: %.2f °C", celcius);
    
        input.close();
    }
}