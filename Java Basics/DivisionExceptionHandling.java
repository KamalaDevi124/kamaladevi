import java.util.Scanner;

public class DivisionExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Taking user input for numerator and denominator
            System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();

            // Performing division
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handling division by zero
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            // Closing the scanner resource
            scanner.close();
            System.out.println("Execution completed.");
        }
    }
}