class ThreadTest3 
{
    public static void main(String[] args)throws Exception
    {
         MyThread t=new MyThread();
         t.start();
         Thread.sleep(1000);
        /* Thread mainThread=Thread.currentThread();
         mainThread.join();  */
         int count=1;
       while(true)
       {
        System.out.println(count++ +"MainThread");
        Thread.yield();
        Thread.sleep(1000);
       }
    }
}
class MyThread extends Thread
{
    public void run()
    { 
       int count=1;
       while(true)
       {
        System.out.println(count++ +"MyThread");
        
       }
    }
}