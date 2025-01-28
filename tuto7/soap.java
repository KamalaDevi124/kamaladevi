import java.io.FileOutputStream;
import java.io.IOException;

public class soap{
    public static void main (String args[])throws IOException{
        
FileOutputStream f = new FileOutputStream("/home/osizlabs/Desktop/tuto7/so.txt" , true);
String s="sandhiya.";
for (int i=0;i<s.length();i++) {
    f.write(s.charAt(i));
    
}
f.close();
System.out.println("succes");



    }
}