class Prac extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
          System.out.println(i);
          try{
            Thread.sleep(500);
          }catch(Exception e){

          }
        }
    }
}
public class Multi2{
    public static void main(String args[]){
        Thread sc=new Prac();
        Thread sc1=new Prac();
        sc.start();
        sc1.start();

        try{
            Thread.sleep(200);
        }catch(Exception e){

        }
        System.out.println("both thread have finished");


    }
}