import java.io.*;
public class CopyingFile 
{
    public static void main(String args[])throws Exception
    {  //SourceSample is all caps letter whereas modified and copied file of SourceSample1 is in all small letters...
       FileInputStream fis=new FileInputStream("C:/Users/KIIT0001/SourceSample.txt");
       FileOutputStream fos=new FileOutputStream("C:/Users/KIIT0001/SourceaSample1.txt");
       int b;
       while((b=fis.read())!=-1)
       {
        if(b>=65 && b<=120)
        fos.write(b+32);
        else
        fos.write(b);
       }
       fis.close();
       fos.close();
    }
}
