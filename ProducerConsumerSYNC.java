class MyData
{
    int value=0;
    boolean flag=true;
    synchronized void set(int v)
    {
        while(flag!=true)
        {   try
            {
            wait();
            }
            catch(Exception e)
            {}

        }
        value=v;
        flag=false;
        notify();
    }
    synchronized int get()
    {
        int x=0;
        while(flag!=false)
        {
            try
            {
            wait();
            }
            catch(Exception e)
            {}
        }
        x=value;
        flag=true;
        notify();
        return x;
    }
}
class consumer extends Thread
{
    MyData dat;
    consumer(MyData d)
    {
        dat=d;
    }
    public void run()
    {
        while(true)
        {
            System.out.print("consumer"+dat.get());
        }
    }
}
class producer extends Thread
{
    MyData dat;
    producer(MyData d)
    {
        dat=d;
    }
    public void run()
    {   int i=1;
        while(true)
        {
            dat.set(i);
            System.out.println("producer"+i);
            i++;
        }
    }
}
 public class ProducerConsumerSYNC
 {  public static void main(String[] args) 
    {
      MyData d1=new MyData();
      producer p=new producer(d1);
      consumer c=new consumer(d1);
      p.start();
      c.start();
    }
 }