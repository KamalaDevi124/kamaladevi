import java.util.Scanner;
public class Calcu{
    public static void main(String args[]){
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a num");
        a=sc.nextInt();
        System.out.println("enter a num");
        b=sc.nextInt();
        char operator;
        System.out.println("+,-,*,%");
        operator=sc.next().charAt(0);
        switch(operator){
            case'+':
             System.out.println(a+b);
              case'-':
             System.out.println(a-b);
              case'*':
             System.out.println(a*b);
              case'%':
             System.out.println(a%b);
             break;
             default:
                 
             System.out.println("you hava entered incorrect operation");

        }

    }
}



/*import java.util.Scanner;
public class Calcu{
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a num");
        num1 =sc.nextInt();
        System.out.println("enter a num");
        num2 =sc.nextInt();
        char operator;
        System.out.println("+,-,*,%");
        operator=sc.next().charAt(0);
        switch(operator){
            case'+':
             System.out.println(num1+num2);
              case'-':
             System.out.println(num1-num2);
              case'*':
             System.out.println(num1*num2);
              case'%':
             System.out.println(num1%num2);
             break;
             default:
                 
             System.out.println("you hava entered incorrect operation");

        }

    }
}*/