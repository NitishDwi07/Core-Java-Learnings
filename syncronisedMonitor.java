  class demoString
{
   synchronized public void display(String str)
   {
     for(int i=0;i<=str.length()-1;i++)
     {
        System.out.print(str.charAt(i));
     }
      System.out.println(" ");
   }
}
class Thread1 extends Thread
{
    demoString dat;
    Thread1( demoString d)
    {
        dat=d;
    }
    public void run()
    {
        dat.display("Hello World");
       
    }
}
class Thread2 extends Thread
{
    demoString dat;
    Thread2( demoString d)
    {
        dat=d;
    }
    public void run()
    {
        dat.display("Welcome");
       
    }
}
class syncronisedMonitor
{
    public static void main(String args[])
    {
        demoString d2=new demoString();
        Thread1 t=new Thread1(d2);
        Thread2 t1=new Thread2(d2);
        t.start();
        t1.start();

    }
}