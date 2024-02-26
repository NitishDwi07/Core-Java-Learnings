import java.io.ByteArrayInputStream;
public class ByteDemoFile
{
    public static void main(String[] args) throws Exception
    {
        byte b[]={'a','b','c','d','e','f','g','h','i','j'};
        ByteArrayInputStream bis=new ByteArrayInputStream(b);
        /*int x;
        while((x=bis.read())!=-1)
        {
            System.out.print((char)x);
        }*/
        String str=new String(bis.readAllBytes());
        System.out.println(bis.markSupported());
        System.out.println(str);
        bis.close();
    }
}
