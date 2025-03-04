/*import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Find the largest number using if-else
        int largest;

        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }

        // Output the largest number
        System.out.println("The largest number is: " + largest);

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}*/

syso("enter a first num");
int num1=sc.nextInt();
syso("enter a second num");
int num2=sc.nextInt();
syso("enter a third num");
int num3=sc.nextInt();

int largest;
if(num1>=num2&&num1>=num3){
    largest=num1;
}
else if(num2>=num1 &&num2>=num3){
    largest=num2;
}
else{
    largest=num3;
}


