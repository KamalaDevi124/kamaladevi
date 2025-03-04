public class Factorialfun{
    public static int calculateFactorial(int num){
        int Factorial=1;

        for(int i=0;i<=num;i++){
            factorial *=i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        // Example: Calculate factorial of 5
        int number = 5;

        // Call the factorial function
        int result = calculateFactorial(num);

        // Print the result
        System.out.println("The factorial of " + num + " is " + result);
    }
}
