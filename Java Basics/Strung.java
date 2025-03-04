public class Strung{
    public static void main(String args[]){
        //string created
        String sc="hello";
        System.out.println(sc);
        //string immutable
       // String sc="hello";
       System.out.println(sc.length());
       //indexOf
       System.out.println(sc.indexOf("h"));
       //charAt(index)
       System.out.println(sc.charAt(4));
       System.out.println(sc.toUpperCase());
       //concadinate
       System.out.println(sc.concat(" world"));
       //compareTo
       String s1="hello";
       String s2="hello";
       System.out.println(s1.compareTo(s2));
       //trim space varakudathu na trim method
       String s3="  hello  ";
       s3=s3.trim();
       System.out.println(s3.length());
       //repalce 
       String s4="hello world";
       s4=s4.repalce("e","o");
       System.out.println(s4);
       //substring method//index num 0 la erunthu tha san vara venum na 3 vara kudukanum appatha 2 vara varum
      
       System.out.println(s4.subString(0,3));
       //equals and ignore also
       String s6="abc";
       String s7="ABC";
       System.out.println(s6.equals(s7));
       System.out.println(s6.equalsIgnoreCase(s7));
       //split
       String str="sandy is a fullstack developer";
       String ss[]=str.split("-");
       for(String em:ss){
        System.out.println(em);


        //string buffer
        StringBuffer sb=new StringBuffer("surya");
        sb.append("software");
        System.out.println(sb);

        //length methid also in string buffer
        
        System.out.println(sb.length());


       }
       
        
       
    }
}