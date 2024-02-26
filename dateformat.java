import java.util.*;
class dateformat
 {
   public static void main(String args[])
   {
     Scanner sc= new Scanner(System.in);
	 System.out.println("Enter the date to check fomat:");
	 String s1=sc.next();
	 System.out.println(s1.matches("[0-3][1-9]/[0-1][1-9]/[0-9]{4}"));
   sc.close();
	 }
  
  }