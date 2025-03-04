import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        // Create a scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Get two numbers from the user
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
         // Prompt user for operation choice
        System.out.println("Choose an operation:");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Division");
        System.out.println("4 - Modulo");
        int choice = scanner.nextInt();

       
        
        // Perform the chosen operation
        switch (choice) {
            case 1:
                // Addition
                System.out.println("Result: " + (num1 + num2));
                break;
            case 2:
                // Subtraction
                System.out.println("Result: " + (num1 - num2));
                break;
            case 3:
                // Division
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case 4:
                // Modulo
                System.out.println("Result: " + (num1 % num2));
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}