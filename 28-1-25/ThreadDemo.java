public class ThreadDemo{
    public static void main(String[] args) {
       System.out.println("main started");
       MyThread th= new MyThread();
       th.start();
       System.out.println("main finished"); 
    }
}
class MyThread extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            
        }
    }
}