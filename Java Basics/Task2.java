import java.util.Scanner;
public class Task2{
    public static void main(String args[]){
       int num;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a number");
       num=sc.nextInt();
       if(num>20){
         System.out.println("enter super");
       }
       else{
         System.out.println("enter bad");
       }
    } 
}