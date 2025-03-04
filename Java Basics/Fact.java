class Soo{
    public int calculatefactorial(int num){
        int factorial=1;
        for(int i=0;i<=num;i++){
            factorial*=i;
        }
    }
}
public class Fact{
    public static void main(String args[]){
        Soo sc=new Soo();
        int result=sc.num(5);
        System.out.println(result);
    }
}

