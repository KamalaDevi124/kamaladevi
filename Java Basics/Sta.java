class Students{
    String name;
    int age;
    static String teacher;
    void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(teacher);
    }
    static{
        Students.teacher="sandy";
    }
}
public class Sta{
    public static void main (String args[]){
        Students sc=new Students();
        sc.name="surya";
        sc.age=21;
        
    }
}