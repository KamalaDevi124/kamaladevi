package tut1;

public class Demo5 {

    
    public static void main(String[] args) {
        foo ref=new Bar();
        Bar  sa = (Bar)ref;
        sa.m1();
        sa.m2();
        sa.m3();

    }
}