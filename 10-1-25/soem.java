interface Talk {
    void SayHello(String name);

    
}
public class soem{
    public static void main(String[] args) {
        Talk ref=new Talk() {
            public void SayHello(String nm){
                System.out.println("Hello"+nm);
            }
        };
        ref.SayHello("ram");
    }
}
