public class Demo2 {
    public static void main(String[] args) {
      /*   int a=10;
        System.out.println(a);
        Integer b = 5;
        System.out.println(b.toString());
        a=b;

        System.out.println(a);*/
        int i=10;
        Integer r=new Integer(i);
        i=r.intValue(i);
        System.out.println(i);
        Integer r1=Integer.valueOf(i);
        System.out.println(r1);
    }
}
