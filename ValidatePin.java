import java.util.Scanner;

public class ValidatePin {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int PIN = 0;
        int check = 0;
        int erro = 1,
                Pin[] = {3, 4, 6, 1};
        while (erro != 0) {
            check = 0;
            while (check <= 3) {
                erro = 0;
                System.out.println("Enter the number" + (check + 1) + " of your pin: ");
                PIN = console.nextInt();
                if (erro != 0) {
                    System.out.println("Enter the PIN again\n");
                }
            }
            System.out.println("The correct PIN has been entered.");
            console.close();
        }
    }
}
