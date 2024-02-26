 class stringsyntax
 {
   public static void main(String args[])
   {
     String str = new String("Java");
	 char c[]={'A','B','C','D'};
	 String str1= new String(c);
	 byte b[]={65,66,67,68};
	 String str2= new String(b);
	 System.out.println(str1==str2);
	 System.out.println(str);
	 System.out.println(str1);
	 System.out.println(str2);
   }
 
 }
 