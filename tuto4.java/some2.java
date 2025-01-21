
import javax.swing.text.GapContent;

class kjsh{
    final int p;

    public kjsh(int p) {
        this.p = p;
    }
    
}
class some2{
    public static void main(String[] args) {
        kjsh r=new kjsh(100);
        System.err.println(r.p);
        kjsh y=new kjsh(200);
        System.out.println(y.p);
    }
}

