class User{
    String name;
    int age;

    void display(){
        System.out.println(name,age);
    }



}
class Book{
    
    int height;
    void took(){
        System.out.println(height);
    }

}
public class Box{
    public static void main(String args[]){
        User sc=new User();
        sc.name="surya";
        sc.age=21;
        sc.display();
    
    Book s2=new Book();
    
    s2.height= 7;
    s2.took();
}
}

