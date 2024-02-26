import java.util.*;
class abstractlearn
{  public static void main(String[] args)
     { Scanner sc =new Scanner(System.in);
      rectangle rc= new rectangle();
      System.out.println("Enter the length and breadth");
      rc.l=sc.nextInt();
      rc.b=sc.nextInt();
      System.err.println(rc.perimeter() );
      System.out.println(rc.area());
      circle c=new circle();
      c.r=5;
      System.err.println(c.perimeter());
      System.err.println(c.area());
       sc.close();
     }
}
abstract class  shape
{
    abstract double perimeter();
    abstract double  area();
}
class rectangle extends shape
{   double l;
    double b;
    double perimeter()
   { return 2*(l+b);
   }
    double area()
    {
        return l*b;
    }
}
class circle extends shape
{   double r;
    double perimeter()
   { 
    return (2*Math.PI*r);
   }
    double area()
    {
        return Math.PI*r*r;
    }
}
