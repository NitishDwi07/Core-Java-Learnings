class ThreadTest2
{
    public static void main(String[] args) throws Exception
    {
      MyThread t= new MyThread("MridulThread");
             t.start();
             t.interrupt();
    }
}
 class MyThread extends Thread
{
    public MyThread(String name)
    {
        super(name);
    }
    public void run()
    {
        int count =1;
        while(true)
        {
            System.out.println(count++);
            try
            {
            Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}
 