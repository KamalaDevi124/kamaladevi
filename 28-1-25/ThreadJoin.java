



public class ThreadJoin {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getId()+"started");
        MyRunnable1 m=new  MyRunnable1();
        Thread th=new Thread(m);
         th.start();
        try {
            th.join();
        } catch ( InterruptedException e) {
        }
        System.out.println(Thread.currentThread().getId()+"finished");
    }
    
}
class MyRunnable1 implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getId()+"started");
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(200);
                
            } catch ( InterruptedException e) {
            }
            System.out.println(i);
            
        }
        System.out.println(Thread.currentThread().getId()+"finished");

    }
}