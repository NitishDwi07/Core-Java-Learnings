class multithread_using_Thread extends Thread
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
        multithread_using_Thread t=new multithread_using_Thread();
         t.start();
         int i=1;
        while(true)
        {
            System.out.println(i+"World");
            i++;
        }
        
    }
}