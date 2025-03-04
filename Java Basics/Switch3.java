import java.util.*;
public class Switch3{
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a daynum");
        int daynum=sc.nextInt();
        switch(daynum){
            case 1:
                System.out.println("monday");
                break;
                 case 2:
                System.out.println("tuesday");

                break;
                 case 3:
                System.out.println("wedday");
                break;
                default:
                     
                System.out.println("monday");
            
        }
    }
}
