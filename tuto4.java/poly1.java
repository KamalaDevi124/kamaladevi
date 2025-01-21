class soo{
    void m1(){
        System.err.println("soo m1");
    }
}
class zoo extends soo{
    void m1(){
        System.err.println("bar m1");
    }
}
class poly1{
    public static void main(String[] args) {
        soo d=new zoo();
        d.m1();
    }
}