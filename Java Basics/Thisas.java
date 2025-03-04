public class Thisas{
    private int empId;
    private String empName;

    void set(int empId,String empName){
        this.empId=empId;
        this.empName=empName;
    }

void show(){
    System.out.println(empId " "+empName);
}
}
public static void main (String args[]){
    Scanner sc=new Scanner(System.in);
    Thisas ar[]= new Thisas[3];
    for(int i=0;i<ar.length;i++){
        System.out.println("enter id");
        int  empId=sc.nextInt();
        System.out.println("enter name");
        String empName=sc.nextLine();
        Thisas e=new Thisas();
        e.set(empId,empName);
        ar[i]=e;

    }
    for (Thisas a:ar){
        a.show();
    }

}