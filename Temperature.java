import java.util.Scanner;
public class Temperature {
    public static void main(String args) {
        double fahrenheit, celsius;
        Scanner r = new Scanner(System.in);
        System.out.println("Please enter the temperature in Fahrenheit: ");
        fahrenheit = r.nextDouble();
        celsius = (fahrenheit-32)*5/9;
        System.out.println("The temperature in Celsius is " + celsius);
    }
}