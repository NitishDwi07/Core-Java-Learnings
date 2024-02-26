public class multithread_using_runnable implements Runnable
{
    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(i+"Hello");
            i++;
        }
    }
    public static void main(String[] args)
    { 
        multithread_using_runnable my=new multithread_using_runnable();
        Thread t=new Thread(my);
         t.start();
         int i=1;
        while(true)
        {
            System.out.println(i+"Hello");
            i++;
        }
        
    }
}
