import java.util.Scanner;

abstract class shape {
    float ar;
    abstract void area();
    void show(){
        System.out.println("area="+ar);
    }
    
}
class rectangle extends shape{
    void area(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length");
        Float length=sc.nextFloat();
        System.out.println("enter breath");
        Float breath=sc.nextFloat();
        ar=length*breath;
    }
}
class shapeDemo{
    public static void main(String[] args) {
        rectangle u=new rectangle();
        u.area();
        u.show();
    }
}