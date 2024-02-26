public class storeinterface 
{
  public static void main(String args[])
  {
    store s=new store();
    customer c=new customer("mridul");
    customer c1=new customer("nitish");
    s.register(c1);
    s.register(c);
    s.invitesale();
  }
}
class store 
{
    Member me[]=new Member[10];
    int count=0;
    void register(Member m)
    {
         me[count++]=m;
    }
    void invitesale()
    {
        for(int i=0;i<count;i++)
        {
            me[i].callback();
        }
    }
}
interface Member
{
    public void callback();
}
class customer implements Member
{
    String n;
    customer(String name)
    {
        n=name;
    }
    public void callback()
    {
        System.out.println("Ok i will visit your store "+n);
    }
}
