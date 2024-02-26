import java.util.*;
class ap
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of terms:");
	int n=sc.nextInt();
	System.out.println("Enter the first term:");
	int a=sc.nextInt();
	System.out.println("Enter the common difference:");
	int d=sc.nextInt();
	sc.close();
	System.out.print("AP="+a+",");
	for(int i=0;i<n;i++)
	{a=a+d;
	 System.out.print(a+",");
	 System.out.print(a+",");
	 }
	 }
	 }
	  