import java.util.Random;
import java.util.Scanner;
public class ComputeMethods {
    public static int main (String[] args) {
        Scanner in = new Scanner(System.in);
        int die1 = (int) (8*Math.random()+1);
        int die2 = (int) (6*Math.random()+1);
        int sum = die1+die2;

        System.out.println("Die 1 is " + die1);
        System.out.println("Die 2 is " + die2);
        System.out.println("The sum of the die values is " + sum);
        return sum;
    }
}

