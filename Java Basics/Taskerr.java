public class Taskerr{
    String passorfail(int score){
        if(score<35){

        
        return "fail";
        }
        else{
            return "pass";

            
        }

    }
    

    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int totalmark=sc.nextInt();

        Taskerr obj1=new  Taskerr();
        String result=obj1.passorfail(totalmark);
        System.out.println(result);

    }
}