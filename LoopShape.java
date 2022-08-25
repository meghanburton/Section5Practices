import java.util.Scanner;
public class LoopShape {
    static void createRectangle(int width, int height) {
        //Draw a Rectangle
        int rows = 0, columns = 0, i, j;
        Scanner sc = new Scanner(System.in);
        for (i = 1; i <= rows; i++) {
            for (j = 1; j <= columns; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }


    static void createTriangle(int leg) {
        //Draw an Isosceles Right Triangle
        int size = Integer.parseInt(null);
        for (int i = 1; i <= size; i++) {
            System.out.println(" ");
            boolean appearance = false;
            for (int k = i; k > 0; k--)
            System.out.print(appearance);
            System.out.println();



        }
    }
}
