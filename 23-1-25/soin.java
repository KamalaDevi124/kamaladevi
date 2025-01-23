public clas soin{
    public static void main(String args[]){
        List a=new ArrayList();
        a.add(123);
        a.add("sandy");
        a.add(8976.50);

        ListIterator lit=a.ListIterator();
        while(lit.hashNext()){
            object obj=lit.next();
            System.out.println(obj);
            lit.remove();
            lit.add("777");
            lit.add("777")
        }
    }
}