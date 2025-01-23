import java.util.ArrayList;
class Employee{
    private int empId;
    private String empName;
    //constructor
    public Employee(int empId,String empName){
        Super();
        this.empId=empId;
        this.empName=empName;
    }
    @override
    public static toString(){
        return empId+" "+empName;
    }
}