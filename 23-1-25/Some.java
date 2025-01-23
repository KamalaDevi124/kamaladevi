public class Some{
    public static void main(String args[]){
        List a=new ArrayList();
        a.add(123);
        a.add("sandy");
        a.add(8976.50);
        a.add(null);
        ListIterator list=a.listIterator();
        while(list.hashNext()){
            Object obj=lit.next();
            
            System.out.println(list.next());

        }
        System.out.println("---------");
        while(list.hashPrevious()){
            System.out.println(list.previous());
        }

    }
}