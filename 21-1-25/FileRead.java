import java.io.BufferedReader;
import java.io.FileRead;
import java.io.IOException;
public class FileRead{
    public static void main(String args[]){
        try(BufferedReader reader=new BufferedReader(new FileRead("file.txt"))){
            System.out.println(reader.readLine());

        }catch(IOException e){
            System.out.println("File not found or unable to read file:"+e.getMessage());
        }
    }
}