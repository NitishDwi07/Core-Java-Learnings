class clsssiccircle
{ 
  public double radius;
  
  public double area()
  {
    return Math.PI*radius*radius;
  }
  public double perimeter()
  {
    return 2*Math.PI*radius;
  }
  public double circumference()
  {
    return perimeter();
  }
 }
  class check
  {
  public static void main(String args[])
  {
    clsssiccircle c1=new clsssiccircle();
	c1.radius=7;
	System.out.println("Area="+c1.area());
	System.out.println("Perimeter="+c1.perimeter());
	System.out.println("Circumference="+c1.circumference());
	clsssiccircle c2=new clsssiccircle();
	c2.radius=9;
	System.out.println("Area="+c2.area());
	System.out.println("Perimeter="+c2.perimeter());
	System.out.println("Circumference="+c2.circumference());
   }
   }
   
  