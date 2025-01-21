 class methodcall {
    static void m1(){

        System.out.println("m1");
    }
    void m2(){
        System.out.println("m2");
    }
    public static void main(String[] args) {
        methodcall.m1();
        methodcall foo = new methodcall();
        
    }
}
