class Human{
    private int age;
    private String name;

    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age=a;
    }
    
    public String  getName(){
        return name;
        
    }
    public void setAge(String n){
        name=n;
    }


public class Encap{
    public static void main (String args[]){
        Human obj=new Human();
        obj.setAge(a:40);
        obj.setName(n:"sandy");
        System.out.println(obj.getName()+":"+obj.getAge());
    }
}