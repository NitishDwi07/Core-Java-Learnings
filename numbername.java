import java.util.*;
class numbername
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	String num=sc.next();
	String s1="";
	for(int i=0;i<=num.length()-1;i++)
	{
	 char ch=num.charAt(i);
	 switch(ch)
	 {
	   case'0': s1=s1+"zero";
                break;
       case'1': s1=s1+"one";
                break;
       case'2': s1=s1+"two";
                break;	
       case'3': s1=s1+"three";
                break;	
       case'4': s1=s1+"four";
                break;	
       case'5': s1=s1+"five";
                break;	
       case'6': s1=s1+"six";
                break;	
       case'7': s1=s1+"seven";
                break;	
       case'8': s1=s1+"eight";
                break;	
       case'9': s1=s1+"nine";
                break;		
       default: System.out.print("Error! Not a number!!");
       break;
       }
     }
     System.out.println(num+"="+s1);
     sc.close();
    }
}	
	
	 
	