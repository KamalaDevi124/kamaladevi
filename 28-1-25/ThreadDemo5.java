public class ThreadDemo5 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+"statred");
        PrintMessage pm=new PrintMessage();
        MyRunnable3 m= new  MyRunnable3();
        Thread th1=new Thread(m);
        Thread th2=new Thread(m);
        th1.start();
        th2.start();
        System.out.println(Thread.currentThread().getName()+"finished");
    }
    class MyRunnable3 implements  Runnable{
        printMessage p;
        MyRunnable3(printMessage p){
            this.p=p;
        }
        public void run(){
            System.out.println(Thread.currentThread().getName()+"statred");
            p.printMessage();
            System.out.println(Thread.currentThread().getName()+"finished");
        }
    }
    class printMessage{
        void PrintMessage(){}
    }

            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                }
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
        
    


    

