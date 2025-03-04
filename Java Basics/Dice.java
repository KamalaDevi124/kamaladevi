import java.util.*;
public class Dice{
    
    
        Scanner sc=new Scanner (System.in);
        
        Random rc=new Random();
        System.out.println("welcome game");

        char choice;
        do{
            System.out.println("r and q");
            choice = sc.next().charAt(0);
            if(choice=='R'|| choice=='r'){
                int rolled=  rc.nextInt(6)+1;
                System.out.println(rolled);
            }
            else if(choice=='D'|| choice=='d'){
                System.out.println("thanks for playing");
                break;

            }
            else{
                 System.out.println("invalid");

            }

            }while(true);
            
            

        }
        

        


    
