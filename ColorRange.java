import java.util.Scanner;

public class ColorRange {

    public static void main(String args[]) {
        System.out.println("Enter a color code: ");
        Scanner r = new Scanner(System.in);
        double color = r.nextDouble();
        String Color;
        if (color >= 380 && color < 450){Color = "The color is Violet.";}
        else if (color >= 450 && color < 495){Color = "The color is Blue.";}
        else if (color >= 495 && color < 570){Color = "The color is Green.";}
        else if (color >= 570 && color < 590){Color = "The color is Yellow.";}
        else if (color >= 590 && color < 620){Color = "The color is Orange.";}
        else if (color >= 620 && color < 750){Color = "The color is Red.";}
        else {Color = "The entered wavelength is not a part of the visible spectrum.";}
        System.out.println(Color);
        r.close();

        }
    }
