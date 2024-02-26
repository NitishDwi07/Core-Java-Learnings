import java.util.*;
class Mobike
{
      int bno;
	 long phno;
	  String name;
	 int days;
	 int charge;
	 Mobike()
	 {
		 bno=0;
		 phno=0;
		 name="";
		 days=0;
		 charge=0;
	 }
	 
	 void input()
	 {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the bike number");
	   bno=sc.nextInt();
	   System.out.println("Enter phone number of customer");
	   phno=sc.nextInt();
	   System.out.println("Enter name of the customer");
	   name=sc.next();
	   System.out.println("Enter the number of days the bike is taken");
	   days=sc.nextInt();
	   sc.close();
	   
	 }
	 void compute()
	 {
		 int d=days;
	       if(d>10)
	       { 
	        int t=d-10;
			charge=charge+t*200;
			d=d-t;
			}
			if(d>5&&d<=10)
			{
			    int k=d-5;
				charge=charge+k*400;
				d=d-k;
			}
			if(d<=5)
			{
			   charge=charge+d*500;
			}
		}
		void display()
		{
		    System.out.println("Bike no.\tPhone no.\tName\tNumber of days\tcharge");
			System.out.println(bno+"\t\t"+phno+"\t\t"+name+"\t"+days+"\t"+charge);
		}
		public static void main(String args[])
		{
			Mobike pqr=new Mobike();
			pqr.input();
			pqr.compute();
			pqr.display();
		}
		
			
	   
	 }
