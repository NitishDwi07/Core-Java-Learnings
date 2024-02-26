import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;
public class TwoinoneFile 
{
    public static void main(String[] args)throws Exception
    {  
       FileInputStream fis=new FileInputStream("C:/Users/KIIT0001/SourceSample.txt");
       FileInputStream fis1=new FileInputStream("C:/Users/KIIT0001/SourceaSample1.txt");

       FileOutputStream fos=new FileOutputStream("C:/Users/KIIT0001/Destination.txt");

       SequenceInputStream sis=new SequenceInputStream(fis,fis1);

       int b;
       while((b=sis.read())!=-1)
       {
        fos.write(b);
       }
       sis.close();
       fis.close();
       fis1.close();
       fos.close();
    }
}
