import java.util.*;
class gmail
 {
   public static void main(String args[])
   {
     Scanner sc= new Scanner(System.in);
	 System.out.println("Enter the email to check for gmail:");
	 String s1=sc.next();
	 System.out.println(s1.matches("\\w*@gmail.*"));
	 int a=s1.indexOf('@');
	 String s2= s1.substring(0,a);
	 String s3= s1.substring(a,s1.length());
	 System.out.println("Username:"+s2);
	 System.out.println("Domain:"+s3);
	 sc.close();
	 }
	 }