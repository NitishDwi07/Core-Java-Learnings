import java.util.*;;
public class ThrowThrowsdemo 
{
    public static void main(String[] args) 
    {   try
        {
        ThrowThrowsdemo.meth1();
        }
        catch(Exception e)
        {
            System.out.println("Length or breadth cannot be negative");
        }
        System.out.println("BYE see you soon!!");
    }
    static void meth1()throws Exception
    {    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length");
        double a=sc.nextDouble();
        System.out.println("Enter the breadth");
        double b=sc.nextDouble();
        System.out.println("Area="+meth2(a,b)); 
        sc.close();
    }
    static double meth2(double l,double b)throws Exception
    {   if(l<0||b<0)
        throw new Exception();
        return l*b;
    }
}
