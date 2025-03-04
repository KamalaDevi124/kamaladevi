class Student{
   private String name;
    private int age;

    private int rollno;
    private String course;

    /*public Student(String name,int age,int rollno,String course){
        this.name=name;
        this.age=age;
        this.rollno=rollno;
        this.course=course;
    }*/
   
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age=a;
    }

    public int  getRollno(){
        return rollno;
    }
    public void setRollno(int b){
        rollno=b;
    }

    public String getCourse(){
        return course;
    }
    public void setCourse(String m){
        course=m;
    }

//public void display(){
   // System.out.println(name);
   // System.out.println(age);
    
    //System.out.println(rollno);
    
   // System.out.println(course);
}

    

    public class Stud{
        public static void main (String args[]){
            Student sc= new Student();
            sc.setName("sandy");
            sc.setAge(21);
            sc.setRollno(234);
            sc.setCourse("computer science");
            System.out.println(sc.getName()+":"+sc.getAge()+":"+sc.getRollno()+":"+sc.getCourse());
    
        }
    }


