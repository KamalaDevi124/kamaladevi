interface Tolk {
    void SayHello(String name);
}
    class TolkImple implements Tolk{
        public void SayHello(String name){
            System.out.println(name);
        }
    }
    public class Wee{
        static void talkAction(Tolk ref){
            ref.SayHello("ram");
        }
        public static void main(String[] args) {
            Tolk t=new TolkImple() {
                
                Wee.talkAction(t);
            
            
            
            }
    }
    
    }
