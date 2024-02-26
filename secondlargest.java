import java.util.*;
class secondlargest
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number size of array:");
	int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<=a.length-1;i++)
	  {
		System.out.print("enter the number");
	    a[i]=sc.nextInt();
	  } 
	  int max=a[0];
	  for(int j=0;j<=a.length-1;j++)
	  {
	       if(max<a[j])
		     max=a[j];
      }
	  int max2=a[0];
      for(int k=0;k<=a.length-1;k++)
	  {
		 if(max>a[k]&&a[k]>max2)
			  max2=a[k];
	  }
	  System.out.println("LARGEST ELEMENT OF ARRAY="+max);
	  System.out.println(" SECOND LARGEST ELEMENT OF ARRAY="+max2);
	  sc.close();
	  }
	  }
			  
		  
	