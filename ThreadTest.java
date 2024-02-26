class MyThread extends Thread
{
    public MyThread(String name)
    {
        super(name);
        setPriority(Thread.MIN_PRIORITY+3);
    }
}
public class ThreadTest
{
    public static void main(String[] args) 
    {
        MyThread t=new MyThread("MyThread 1");
       // System.out.println(t.getId());
        System.out.println(t.getName());
        System.out.println(t.getState());
        System.out.println(t.getPriority());
        t.start();
        System.out.println(t.isAlive());
        System.out.println(t.isDaemon());

        
    }
}
