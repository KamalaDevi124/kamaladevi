class hii extends Thread{
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("hii");
            try{Thread.sleep(500);
            }catch(Exception e){

            }
        }
    }
}

class hello extends Thread{
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("hello");
            try{Thread.sleep(500);
            }catch(Exception e){

            }
        }
    }
}
public class MultithreadDemo{
    public static void main (String args[]){
        hii sc=new hii();
        hello sc1=new hello();
        sc.start();
        try{
            Thread.sleep(200);
        }catch(Exception e){

        }
        sc1.start();

    }
}
