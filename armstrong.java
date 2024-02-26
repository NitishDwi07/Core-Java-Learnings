import java.util.*;
class armstrong
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int num=sc.nextInt();
	int temp=num;
	int c=0;
	while(temp!=0)
	{
	 c++;
	 temp=temp/10;
	}
	int temp2=num;
	int sum=0;
	while(temp2!=0)
	{ int a=temp2%10;
	 sum=sum+(int)Math.pow(a,c);
	 temp2=temp2/10;
	}
	 if(sum==num)
	 {
	  System.out.println("armstrong number="+num);
	 }
	 else
	 {
	  System.out.println("Not an Armstrong number.");
	 }
	 sc.close();
	 }
	 
	 }