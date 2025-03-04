public class Pali{
    public static void main(String args[]){
        String str="Madam";
        String rstr="";
        char ch;
        for(int i=0;i<=str.length();i++){
            ch=str.charAt(i);
            rstr = ch+rstr;
        }
         System.out.println(rstr);
        if(str.toLowerCase().equals(rstr.toLowerCase())){
            System.out.println("is palindrome");
        }
        else{
             System.out.println("not a palindrome");

        }

    }
}