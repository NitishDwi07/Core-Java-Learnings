import java.util.*;
class trycatchdemo
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the numerator");
        int num=sc.nextInt();
        System.out.println("Enter the denominator");
        int den=sc.nextInt();
        sc.close();
      try 
      {
        int c=num/den;
        System.out.println("c="+c);
      }
      catch(ArithmeticException e)
     {
        System.out.println("denominator cannot be zero,try again");
     }
        System.out.println("Bye");
    }
}