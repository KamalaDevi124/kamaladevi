import java.util.*;
public class Eve{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();

        if(num%2==0){
            System.out.println("even");

        }
        else{
            System.out.println("odd");
        }

    }
}


//(n/2*2==n)