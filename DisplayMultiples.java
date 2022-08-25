import java.util.Scanner;

public class DisplayMultiples {

    public static void main(String args[]) {
       Scanner input = new Scanner(System.in);
       int number;

       System.out.println("Choose a number: ");
       number = input.nextInt();

       System.out.println();

       for (int i = 1; i <= 12; i++) {
           int multiply = number * i;
           System.out.println(number + "x" +i+ "=" +multiply);
           input.close();
       }
    }

}
