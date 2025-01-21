
import java.awt.Rectangle;
import java.util.Scanner;

interface dooo {
    float PI=3.14f;
    void draw();
    abstract class shape{
        float ar;
        abstract void area();
        void show(){
            System.out.println("area="+ar);
        }
    }
    class rectangle extends shape implements dooo{
        void area(){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter len");
            float len=sc.nextFloat();
            System.out.println("enter br");
            float br=sc.nextFloat();
            ar=len*br;
        }
        public void draw(){
            System.out.println("drawing reet");
        }
    } 
    class shapeDemo1{
        public static void main(String[] args) {
            Rectangle g=new rectangle();
            g.area();
            g.show();
            g.draw();
            
        }
    }

    
}
