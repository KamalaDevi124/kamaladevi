/*public class Fibo{
    public static void main (String args[]){
        int n=10;
        int FirstNum=0;
        int SecondNum=1;
        
        for(int i=1;i<=n;i++){
            System.out.print(FirstNum);
            int nextTerm = FirstNum+SecondNum;
            FirstNum=SecondNum;
            SecondNum=nextTerm;
        }


    }
}*/
import java.util.*;
public class Fibo{
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a num");
        int n=sc.nextInt();
        int firstnum=0;
        int secondnum=1;
        for(int i=0;i<=n;i++){
            System.out.println(firstnum);
            int nextterm=firstnum+secondnum;
            firstnum=secondnum;
            secondnum=nextterm;

        }

    }
}

