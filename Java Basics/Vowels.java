import java.util.*;
public class Vowels{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a alphabet ");
        char ch=sc.next().toLowerCase().charAt(0);
        switch(ch){
            case 'a':
                case 'e':
                    case'i':
                    
                    case 'o':
                        case'u':
                        System.out.println("vowels");
                        break;
                        default:
                            System.out.println("consonant");
                
        }
    }
}


//withoutt scanner

char ch='a';
if(ch=='a'\\ch=='e'\\ch=='i'\\ch=='o'\\ch=='u'\\ch=='A'\\ch=='E'\\ch=='I'\\ch=='O'\\ch=='U'){
    System.out.println("enter a vowels");
    else{
    System.out.println("enter a consonant");
    

        
    }
}