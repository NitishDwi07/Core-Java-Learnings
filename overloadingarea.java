import java.util.*;
class overloadingarea
{
   public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   double a= sc.nextDouble();
   System.out.println("Area="+ area(a));
   sc.close();
 }
      /*static double area(double l,double b)
       {
       return (l*b);
	   }*/
	  static  double area(double a)
	   {
	   return (a*a);
	   }
	  /* static double area(double c,double d,double e)
	   {
	     return ((c+d)*e);
	   }*/
      static double area(int r)
	   {
		 return Math.PI*r*r;
	   }
	   
}