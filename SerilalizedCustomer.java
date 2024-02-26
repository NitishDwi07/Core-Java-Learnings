import java.io.*;

class Customer implements Serializable
{
    String custID;
    String name;
    String phno;
    static int count=1;
    Customer()
    {

    }
    Customer(String n,String p)
    {
        custID="C"+count;
        count++;
        name=n;
        phno=p;   

     }
     public String toString()
     {
       return "Customer ID:"+custID+"\nName:"+name+"\nPhone Number"+phno;
     }
}
class SerilalizedCustomer
{   /*     public static void main(String []args)throws Exception
    { 
      Customer list[]={new Customer("Mridul", "8529716440"),new Customer("Nitish","9140398326"),new Customer("Avinash","7275058510")};
      FileOutputStream fos =new FileOutputStream("C:/Users/KIIT0001/Customer.txt");
      ObjectOutputStream oos=new ObjectOutputStream(fos);

      oos.writeInt(list.length);
      for(Customer c:list)
      oos.writeObject(c);
      oos.close();
      fos.close();
    }*/ 
    public static void main(String []args)throws Exception
    { 
      java.util.Scanner sc=new java.util.Scanner(System.in);
      FileInputStream fis =new FileInputStream("C:/Users/KIIT0001/Customer.txt");
      ObjectInputStream ois=new ObjectInputStream(fis);

      int length=ois.readInt();
      Customer list[]=new Customer[length];
      for(int i=0;i<length;i++)
      {
        list[i]=(Customer)ois.readObject();
      }
      System.out.println("Enter the name of Customer");
      String name=sc.nextLine();
      for(int i=0;i<length;i++)
      {
        if(name.equalsIgnoreCase(list[i].name))
        System.out.println(list[i]);
      }
      ois.close();
      fis.close();
      sc.close();
    }
}
