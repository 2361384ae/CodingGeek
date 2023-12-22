import java.util.Scanner;
import java.lang.Math;

public class Dev {
    public static void main(String[] args) {
        // Scanner object for getting input from user!
        Scanner in = new Scanner(System.in);

        // Declaring "a, b, c, delta, x1, x2" variables!
        double a, b, c, delta, x1, x2;

        // This loop will work once!
        for (int v = 0; v < 1 ; v++) {
            // Get the "A, B, C" values from the user!
            System.out.println("A: ");
            a = in.nextDouble();
            System.out.println("B: ");
            b = in.nextDouble();
            System.out.println("C: ");
            c = in.nextDouble();
            // To calculate the delta!
            delta = (b * b) - (4 * a * c);
            // Conditions for delta!
            if (delta > 0) {
                // If delta is greater than ZERO
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Delta: " + delta);
                System.out.println("X1: " + x1);
                System.out.println("X2: " + x2);
            }
            else if (delta == 0) {
                // If delta is ZERO!
                x1 = -b / (2 * a);
                System.out.println("Delta: " + delta);
                System.out.println("X1: " + x1);
            }
            else {
                // If delta is NEGATIVE!
                System.out.println("Delta: " + delta);
                System.out.println("No answer due to negative delta!");
            }
        }
        // To resolve "Resourse leak" error!
        try {
            //...
        } finally {
            in.close();
        }
    }
}
