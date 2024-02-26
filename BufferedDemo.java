import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedDemo 
{
    public static void main(String[] args)throws Exception
    {
        FileInputStream fis=new FileInputStream("C:/Users/KIIT0001/SourceSample.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);

        /*int x;
        while((x=bis.read())!=-1)
        {
            System.out.print((char)x);
        }*/
        System.out.println(fis.markSupported());//Result is false
        System.out.println(bis.markSupported());//Result is true
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.mark(10);
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.reset();
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.close();


    }
}
