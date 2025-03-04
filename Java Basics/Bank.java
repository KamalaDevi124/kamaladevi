//create a bankaccount class with deposit and withdraw method.
public class Bank{
   
   private long balance;


   //consttructor
   public Bank(long initialBalance){
       balance = initialBalance;
   }
   public void deposit(long amount){
   balance += amount;
   }
   public void withdraw(long amount){
    if(amount <= balance){
        balance-=amount;
    }else{
        System.out.println("insufficient balance");
    }

   }
   public long getBalance(){
    return balance;
   }

    public static void main(String args[]){
        BankAccount obj=new BankAccount(1000);
        obj.deposit(500);
        obj .withdraw(200);
        System.out.println(obj.getBalance());

    }
   }



