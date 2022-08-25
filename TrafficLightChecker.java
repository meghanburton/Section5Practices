import java.util.Scanner;
public class TrafficLightChecker {

    public static void main(String args[]) {
        System.out.println("Enter a color code: ");
        Scanner color = new Scanner(System.in);

        double t = Double.parseDouble(color.next());
        t = t % 5;
        if (t >= 0 && t < 3)
            System.out.println("Next Traffic Light is Green.");
        else if (t >= 3 && t <4 )
            System.out.println("Next Traffic Light is Yellow.");
        else if ( t == 4)
            System.out.println("Next Traffic Light is Red.");
        else
            System.out.println("Invalid Color");

        color.close();
    }

}
