public class ThreadDemo2{
    public static void main(String[] args) {
       System.out.println("main started");
       MyRunnable m=new MyRunnable();
       Thread th= new Thread(m);
       th.start();
       System.out.println("main finished"); 
    }
}
class MyRunnable implements  Runnable{
    public void run(){
        for (int i = 0; i < 10; i++) {
            try {Thread.sleep(500);
                
            } catch (InterruptedException e)  {
            }
            System.out.println(i);
            
        }
    }
}