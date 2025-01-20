class Employee{
    private String empName;
    boolean Validate(){
        class EmployeeValidator{
            boolean Validate(){
                return empName !=null && !empName.isEmpty();
            }
        }
        EmployeeValidator ev=new EmployeeValidator();
        return ev.Validate();
    }

    
}
public class Demo{
    public static void main(String[] args) {
        Employee ref = new Employee();
        boolean b= ref.Validate();
        System.out.println(b);
        
    }
    
}
