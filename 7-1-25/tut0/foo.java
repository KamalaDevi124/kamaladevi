package tut0;
class foo {
int i=100;


    
}
class Bar extends foo{
    int i=200;
    void show(){
        System.out.println(i);
        System.err.println(super.i);
    }
}
class demo{
    public static void main(String[] args) {
        Bar b=new Bar();
        b.show();
        
    }
}