import java.util.ArrayList;
public class Collection1{
    public static void main(String args[]){
        ArrayList a=new ArrayList();
        a.add(123);
        a.add("sandy");
        a.add(8976.50);

        ArrayList a1=new ArrayList();
        a1.add(123);
        a1.add("sandy");
        a1.add(89.50);
        System.out.println(a);
        System.out.println(a1);
        a.retainAll(a1);  //all the common element present except odd
        System.out.println(a);
        System.out.println(a1);
        a.addAll(a1);


    }
}