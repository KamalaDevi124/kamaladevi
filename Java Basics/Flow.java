import java.util.*;
public class Flow{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name");
        String name=sc.nextLine();
        
        System.out.println("enter your rollno");
        String rollno=sc.nextLine();
        
        System.out.println("enter  mark1");
        int mark1=sc.nextInt();
        System.out.println("enter  mark2");
        int mark2=sc.nextInt();
        System.out.println("enter your mark3");
        int mark3=sc.nextInt();


        int totalmarks = mark1+mark2+mark3;
        double percentage=(totalmarks/3.0);


        if(percentage >=40){
            System.out.println("pass");

        
        if(percentage >=90){
            System.out.println("eligible");
        }

        
        else{
            System.out.println("not eligible");
        }
        }
        else{
            System.out.println("fail");
        }
    
        System.out.println(name);
        System.out.println(rollno);
        System.out.println(totalmarks);
        System.out.println(percentage);


    }
}