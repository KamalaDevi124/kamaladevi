package tut0;
 class Foo1 {
    void show(){
        System.out.println("foo");
    }
    
}
class Bar extends Foo1{
    void show(){
        super.show();
        System.out.println("bar");
    }
}
class demo{
    public static void main(String[] args) {
        Foo1 f = new Bar();
        f.show();
        
    }
}
