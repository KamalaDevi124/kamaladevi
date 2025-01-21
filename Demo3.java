package tut0;
 class foo2 {
    void m1(){
        System.err.println("m1 in foo2");
    }

    void m2(){
        System.out.println("m2 in foo");
    
    
}
 }
class Bar extends foo2{
    void m2(){
        System.out.println("m2 in box");
    }
    void m3(){
        System.out.println("m3 in bar");
    }
}
class Demo3{
    public static void main(String[] args) {
        foo2 ref=new Bar();
        Bar  sa = (Bar)ref;
        sa.m1();
        sa.m2();
        sa.m3();

    }
}