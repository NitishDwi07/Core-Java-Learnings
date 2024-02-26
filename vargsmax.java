
import java.util.*;
class vargsmax
{
  static int max(int ...A)
  {
    if (A.length==0)
	 return Integer.MAX_VALUE;
	else
	{ int a=A[0];
	 for(int i=0;i<A.length;i++)
	    {
		  if(A[i]>a)
		  a=A[i];
		}
		  return a;
	}
   }
   public static void main(String args[])
   { 
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter how many numbers you want to input");
	int n=sc.nextInt();
	 int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{ System.out.print("Enter the number:");
	  arr[i]=sc.nextInt();
	}
	 System.out.println(max(arr));
	 sc.close();
	}
	}
	
	 