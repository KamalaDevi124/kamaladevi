import java.util.*;
public class BasicCalculator{
    public static int add(int num1,int num2){
        return num1+num2;
    }
    public static int sub(int num1,int num2){
        return num1-num2;
    }
    public static int multiply(int num1,int num2){
        return num1*num2;
    }
    public static int divide(int num1,int num2){
        if (num2 == 0) {
            System.out.println("Error! Division by zero is not allowed.");
            return -1; // Return -1 to indicate an error in division
        }
        return num1 / num2;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("1.add");
        System.out.println("1.sub");
        System.out.println("1.multiply");
        System.out.println("1.divide");
        int choice=sc.nextInt();

    }
    System.out.println("enter first num");
    int num1=sc.nextInt();
    System.out.println("enter second num");
    int num2=sc.nextInt();
      
      int result=0;

      switch(choice){
        case 1:
            result =add(num1,num2);
            System.out.println(result);
            break;
            case 2:
                result=sub(num1,num2);
                System.out.println(result);
                break;
                case 3:
                    result=multiply(num1,num2);
                    System.out.println(result);
                    break;
                case 4:
                result = divide(num1, num2);
                if (result != -1) {  // Check if the division was successful
                    System.out.println("Result: " + result);
      }
      default:
        System.out.prinln("invalid");

    }

  
    

    
