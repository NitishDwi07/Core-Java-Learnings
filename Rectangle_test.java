import java.util.*;
class rectangle
{
 public double length;
 public double breadth;
 
 public double area()
 { return length*breadth;
 }
 public double perimeter()
 { return 2*(length+breadth);
 }
 public boolean is_square()
 { return length==breadth;
 }
}
class Rectangle_test extends rectangle
{
 public static void main(String args[])
 {
  rectangle ob1=new rectangle();
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the length");
  ob1.length=sc.nextDouble();
  System.out.println("Enter the breadth");
  ob1.breadth=sc.nextDouble();
  System.out.println("Area of rectangle="+ob1.area());
  System.out.println("Perimeter of rectangle="+ob1.perimeter());
  System.out.println("Is the given rectangle square?"+ob1.is_square());
  sc.close();
   }
}