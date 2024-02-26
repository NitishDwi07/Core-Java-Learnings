import java.util.*;
class matrixmultiplication
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number size of jasquare matrix:");
	int n=sc.nextInt();
	System.out.println("Enter both the Matrix:");
	int a[][]=new int[n][n];
	int b[][]=new int[n][n];
	System.out.print("Enter the elements of first matrix");
	for(int i=0;i<=a.length-1;i++)
	{
	  for(int j=0;j<a[0].length;j++)
	  {
		a[i][j]=sc.nextInt();
	   }
	}
	System.out.print("Enter the elements of second matrix");
	for(int k=0;k<=b.length-1;k++)
	{
	  for(int l=0;l<b[0].length;l++)
	  {
		b[k][l]=sc.nextInt();
	  }
	}
	System.out.println("Matrix1:");
	for(int q=0;q<=a.length-1;q++)
	{
	  for(int w=0;w<a[0].length;w++)
	  { 
       System.out.print(a[q][w]);
	  }
	  System.out.println();
	}
	System.out.println("Matrix2:");
	 for(int z=0;z<=b.length-1;z++)
	{
	  for(int x=0;x<b[0].length;x++)
	  { 
        System.out.print(b[z][x]);
	  }
	  System.out.println();
	} 
	int c[][]= new int[n][n];
	for(int g=0;g<n;g++)
	  {  
	    for(int h=0;h<n;h++)
		{c[g][h]=0;
		 for(int y=0;y<n;y++)
		  {
		    c[g][h]=c[g][h]+a[g][y]*b[y][h];
		   }
		}
	   }
	System.out.println("Multiplied Matrix:");
	 for(int v=0;v<n;v++)
	   {
	     for(int m=0;m<n;m++)
		 { 
		   System.out.print(c[v][m]+" ");
		 }
		  System.out.println();
	   } 
	   sc.close();
	}
}		  
	
	