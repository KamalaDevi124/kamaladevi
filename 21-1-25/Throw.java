public class Throw{
    public static void main(String args[]){
        if(age<18){
            throw new illegalArugumentException("age must be 18 or above.");
        }
    }
    public static void main(String args[]){
        try{
            validateAge(15);

        }catch(illegalArugumentException e){
            System.out.println("error:"+e.getMessage());
        }
    }
}