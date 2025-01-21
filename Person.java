package tut0;
class Person{

    public Person() {

    }
    

}
class Employee extends Person{
    Employee(){
        System.out.println("no-args employee");
    }

Employee(int i){
    System.out.println("parameter employee");
}
}
class Employeedemo{
    public static void main(String[] args) {
        Employee e = new Employee();
        Employee a=new Employee(12);



    }
}