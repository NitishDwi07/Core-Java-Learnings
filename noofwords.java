import java.util.*;
class noofwords
 {
   public static void main(String args[])
   {
     Scanner sc= new Scanner(System.in);
	 System.out.println("Enter the distored sentence:");
	 String s1=sc.nextLine();
	 s1=s1.replaceAll("\\s+"," ").trim();
	 String words[]=s1.split("\\s");
	 System.out.println("No of words="+words.length);
	 sc.close();
	 }
}	 