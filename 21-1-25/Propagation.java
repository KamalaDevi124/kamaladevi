public class Propagation{
    public static void main(String args[]){
        try{
            methodA();

        }catch (Exception e){
            System.out.println("exception caught in main:"+e.getMessage());
        }
    }
    public static void methodA() throws Exception{
        methodB();
    }
    public static void methodB throws Exception{
        throw new Exception("Exception in methodB");
    }
}