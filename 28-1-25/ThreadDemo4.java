public class ThreadDemo4 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+"statred");
        MyRunnable2 m= new  MyRunnable2();
        Thread th1=new Thread(m);
        Thread th2=new Thread(m);
        th1.start();
        th2.start();
        System.out.println(Thread.currentThread().getName()+"finished");
    }
    class MyRunnable2 implements  Runnable{
        public void run(){
            System.out.println(Thread.currentThread().getName()+"statred");
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
            System.out.println(Thread.currentThread().getName()+"finished");

        }
    }
}
