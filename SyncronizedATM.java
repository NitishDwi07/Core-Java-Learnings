public class SyncronizedATM
{
  public static void main(String args[])
  {   
      ATM atm=new ATM();
      Customer c1=new Customer("Mridul",atm,2000);
      Customer c2=new Customer("Nitish",atm,1000);
      c1.start();
      c2.start();
  }
}
 class ATM
{
    synchronized public void checkbalance(String name)
    {
        System.out.print(name+" Checking");
       try
       {
        Thread.sleep(1000);
       }
       catch(Exception e)
       {}
       System.out.println(" Balance");        
    }
   synchronized public void withdraw(String name,int amount)
    {
        System.out.print(name+" Withdrawing Amount =");
        try
        {
        Thread.sleep(1000);
        }
        catch(Exception e)
        {}
        System.out.println(amount);
    }
}
class Customer extends Thread
{
    String name;
    int amount;
    ATM atm;
    Customer(String n,ATM a,int amt)
    {
       name=n;
       atm=a;
       amount=amt;
    }
       public void useATM()
       {
        atm.checkbalance(name);
        atm.withdraw(name, amount);
       }
       public void run()
       {
        useATM();
       }
}

