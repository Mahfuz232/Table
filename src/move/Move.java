

package move;

import java.util.Scanner;

public class Move {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Calculating the subtract
        double sum = num1 - num2;

        // Displaying the result
        System.out.println("The subtract  of " + num1 + " and " - num2 + " is: " + sum);

        scanner.close();
    }
}
