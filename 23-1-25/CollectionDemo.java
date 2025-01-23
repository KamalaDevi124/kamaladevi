public class CollectionDemo{
    public static void main(String args[]){
        HashSet<Employee>a=new HashSet<Employee>();
        a.add(new Employee(31,"sandy"));
        a.add(new Employee(13,"surya"));
        a.add(new Employee(41,"sai"));
        a.add(new Employee(23,"sai2"));

        for(Employee e:a){
            System.out.println(e);
            
        }

    }
}