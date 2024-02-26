import java.util.*;
class array
{
     public static void main(String args[])
	 {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the size of row ARRAY");
		 int n=sc.nextInt();
		 System.out.println("Enter the size of column ARRAY");
		 int m=sc.nextInt();
		 int a[][]=new int[n][m];
		 for(int k=0;k<=n-1;k++)
		 {
			 for(int l=0;l<=m-1;l++)
			 { 
		       System.out.println("Enter the value:");
			   a[k][l]=sc.nextInt();
			 }
			 
		 }
		 
		 
	     for(int i=0;i<=a.length-1;i++)
		 { 
		 int max=a[0][i];
		    for(int j=0;j<=a[0].length-1;j++)
			{ 
			    if(a[j][i]>max)
				{
				     max=a[j][i];
				}
				
	        }
		    System.out.println("the largest element of column:"+(i+1)+"="+max);
		}
		sc.close();
	}
}