
import java.io.FileReader;
import java.io.IOException;

public class FileDemo5 {
    public static void main(String[] args)throws IOException {
        FileReader f=new FileReader("/home/osizlabs/Desktop/tuto7/so.txt");
        int ch=-1;
        while ((ch=f.read())!=-1) {
            System.err.print((char)ch);



            
        }
        f.close();
        System.out.println("succes");
    }

    
}
