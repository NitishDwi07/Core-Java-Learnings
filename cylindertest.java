import java.util.*;
class cylinder
{
  public double radius;
  public double height;
  
  public double lidarea()
  {
  return Math.PI*radius*radius;
  }
  public double totalsurfacearea()
  {
  return 2*lidarea()+circumference()*height;
  }
  public double circumference()
  {
  return 2*Math.PI*radius;
  }
  public double volume()
  {
  return lidarea()*height;
  }
}
class cylindertest
{
   public static void main(String args[])
  { 
  Scanner sc=new Scanner(System.in);
  cylinder ct=new cylinder();
  System.out.println("Enter the radius");
  ct.radius=sc.nextDouble();
  System.out.println("Enter the height");
  ct.height=sc.nextDouble();
  System.out.println("Lid Area ="+ct.lidarea());
  System.out.println("Total Surface Area ="+ct.totalsurfacearea());
  System.out.println("Circumference ="+ct.circumference());
  System.out.println("Volume ="+ct.volume());
  sc.close();
  }
}
  