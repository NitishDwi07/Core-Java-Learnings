import java.util.*;
class rotatingarray 
{
	public static void main(String args[])
  {
     Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number size of array:");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<=a.length-1;i++)
		  {
			System.out.print("enter the number");
		    a[i]=sc.nextInt();
		  }
		  int temp=a[0];
		  for(int j=1;j<=a.length-1;j++)
		  {
		  {  
			  a[j-1]=a[j];
			}
			  a[n-1]=temp;
			  for(int x:a)
			  {
			  System.out.print(x);
			  }
			
		}
		sc.close();
	}		  		  
		  
}