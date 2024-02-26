import java.util.*;
class cylinder2
{
  private double radius;
  private double height;
  double getRadius()
   {
   return radius;
   }
  double getHeight()
   {
     return height;
   }
    void setRadius(double r)
   {
     if(r>0)
	 radius=r;
	 else
	 radius=0;
	}
	void setHeight(double h)
	{
	  if(h>0)
	  height=h;
	  else
	  height=0;
	}
    void volume()
	{
	  System.out.println("volume="+ Math.PI*getRadius()*getRadius()*getHeight());
	}
	public static void main(String args[])
	{ Scanner sc=new Scanner(System.in);
	  cylinder2 ob= new cylinder2();
	 System.out.println("Enter the radius:");
	 double rad=sc.nextDouble();
	 System.out.println("Enter the height:");
	 double hei=sc.nextDouble();
	  ob.setRadius(rad);
	  ob.setHeight(hei);
	  ob.volume();
	  sc.close();
	}
}	  
	  
	  
	
  