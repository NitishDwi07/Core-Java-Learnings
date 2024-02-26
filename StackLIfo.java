
 class stackoverflow extends Exception
{
    public String toString()
    {
        return "Stack is overflow";
    }
}
class stackunderflow extends Exception
{
    public String toString()
    {
        return "Stack is underflow";
    }
}
 class Stack
{
  int size;
  int s[];
   int top=-1;
 public Stack(int sz)
  { 
    size=sz;
    s=new int[size];
  }
 
  public void push(int x)throws stackoverflow
  {
    if(top==size-1)
    throw new stackoverflow();
    top++;
    s[top]=x;
  }
  public int pop()throws stackunderflow
  {  int temp;
    if(top==-1)
    throw new stackunderflow();
     temp=s[top];
     top--;
     return temp;
  }
}
 public class StackLIfo 
{  
    public static void main(String args[])
    {
       Stack st=new Stack(5);
       try
       {
       st.push(10);
       st.push(20);
       st.push(30);
       st.push(40);
       st.push(50);
       System.out.println(st.pop());
       System.out.println(st.pop());
       }
       catch(stackunderflow s)
       {
        System.out.println(s);
       }
       catch(stackoverflow e)
       {
        System.out.println(e);
       }
    }

}