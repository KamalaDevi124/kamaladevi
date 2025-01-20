 class Employee {
    private String EmpName;
        static class EmployeeValidator{
            boolean Validate(Employee e){
                return e.EmpName !=null && !e.EmpName.isEmpty();
            }
        }
        public class Demo11{
            public static void main(String[] args) {
                Employee.EmployeeValidator ref= new Employee.EmployeeValidator();
                boolean b=ref.Validate(new Employee());
                System.out.println(b);
            }
        }

    }
    

