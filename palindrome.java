import java.util.*;
class palindrome
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int num=sc.nextInt();
	int temp=num;
	int rev=0;
	while(temp!=0)
	{int d=temp%10;
	 rev=rev*10+d;
	 temp=temp/10;
	}
	 if(rev==num)
	 System.out.println("palindrome number");
	 else
	 System.out.println("Not a palindrome number");
	 sc.close();
	 }
}