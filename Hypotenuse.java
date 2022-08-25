import java.util.Scanner;
import java.lang.Math;
public class Hypotenuse {
    public static void main(String args){
        int leg1, leg2;
        Scanner h = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        leg1 = h.nextInt();
        leg2 = h.nextInt();
        int step1;
        step1 = ((leg1 * leg1) + (leg2 * leg2));
        int hypotenuse = (int) Math.sqrt(step1);
        System.out.println("The hypotenuse is: " + hypotenuse);
    }

}
// find the hypotenuse of a triangle
// create an input for width
// use the formula for finding the hypotenuse by replacing our width input and height input with w and h