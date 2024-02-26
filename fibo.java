import java.util.*;
class fibo
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of terms:");
	int n=sc.nextInt();
	int a=0;
	int b=1;
	System.out.print("FIBONACCI SERIES="+a+","+b+",");
	for(int i=1;i<n-1;i++)
	  {
	  int c=a+b;
	  System.out.print(c+",");
	  a=b;
	  b=c;
	  }
	  sc.close();
   }
 }