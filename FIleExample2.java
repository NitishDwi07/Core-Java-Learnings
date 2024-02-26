import java.io.FileInputStream;
public class FIleExample2
{
    public static void main(String args[])
    {    try
        {   //Can use FileReader too in place of FileInputStream....
           FileInputStream fis=new FileInputStream("C:/Users/KIIT0001/Test.txt");
          /* byte b[]=new byte[fis.available()];
           fis.read(b);
           String str=new String(b);
           System.out.println(str); */
           int x;
           do{
                x=fis.read();
                if(x!=-1)
                System.out.print((char)x);

             }while(x!=-1);
           fis.close();
        }
          catch(Exception e)
        {
           System.out.println(e);
        }
    }
}
