import java.util.ArrayList;
public class Collection{
    public static void main(String args[]){
        ArrayList a=new ArrayList();
        a.add(123);
        a.add("sandy");
        a.add(7.55);
        System.out.println(a);
        //remove
        a.remove ("sandy");
        System.out.println(a);
    }
}