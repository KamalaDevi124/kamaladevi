
import java.io.IOException;

public class Some1 {
    public static void main(String[] args) {
        
        try{

        
        m1();
        }catch(IOException e){
            System.err.println("exception handled");
        }
        System.out.println("remaining pro");

    }

    
    static void m1()throws IOException{
        m2();

    }
    static void m2()throws IOException{

    
    System.out.println("enter any cha");
    int j=System.in.read();
    System.out.println((char)j);
    }
    
}
