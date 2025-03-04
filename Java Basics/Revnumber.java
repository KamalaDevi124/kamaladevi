public class Revnumber{
    public static void main(String args[]){
        int num=764;
        int rnum=0;

        while(num!=0){
            int digit=num%10;
             System.out.println(digit);
             rnum=rnum*10+digit;
              System.out.println(rnum);
              num=num/10;
               System.out.println(num);
        }
         System.out.println(rnum);
    }
}