import java.util.*;
class overloadvalidate
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the name");
   String s2=sc.nextLine();
   validate(s2);
   System.out.println("Enter the age");
    int a=sc.nextInt();
	System.out.println(validate(a));
  sc.close();
   
  }
   static void validate(String s1)
    {
    System.out.println(s1.matches("[A-Za-z\\s]+"));
	}
	static boolean validate(int age)
    {
     if (age>3&&age<12)
	  return true;
	 else
	  return false;
	}
	}