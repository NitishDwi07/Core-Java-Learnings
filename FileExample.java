import java.io.*;

public class FileExample 
{
    public static void main(String args[])throws Exception
    {    try
        {
        FileOutputStream fos=new FileOutputStream("C:/Users/KIIT0001/Test.txt");
        String str="Learn Java Programming";
        byte b[]=str.getBytes();
        fos.write(b);
        //for(byte x:b)
        //fos.write(x);
        fos.close();
        }
        catch(FileNotFoundException e)
        {
           System.out.println(e);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
