public class Exception{
    public static void main(String args[]){
        try{
            int result=10/0;
        }
        catch(ArithmeticException e){
            System.out.println("cannot divide by zero:"+e.getMessage());
        }
        finally{
            System.out.println("Execution completed.")
        }
    
        
        }
    }
