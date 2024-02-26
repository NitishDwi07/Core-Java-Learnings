
import java.net.*;

public class DatagramClient 
{  
    public static void main(String[] args) throws Exception
    {   //data sent from client
        DatagramSocket ds=new DatagramSocket(2001); 
        String msg="Hello World";
        DatagramPacket dp=new DatagramPacket(msg.getBytes(),msg.length(),InetAddress.getByName("localhost"),2000);
        //packet sent to the server
        ds.send(dp);
        //receiving the packet
        byte b[]=new byte[1024];
        dp=new DatagramPacket(b,1024);
        ds.receive(dp);
        
        msg=new String(dp.getData()).trim();
        System.out.println("From Server "+msg);
        
        ds.close();
    }
    
}

class Server 
{  
    public static void main(String[] args) throws Exception
    {
        DatagramSocket ds=new DatagramSocket(2000);
        //Server is receiving the packet..
        byte b[]=new byte[1024];
        DatagramPacket dp=new DatagramPacket(b,1024);
        ds.receive(dp);
        //Server reversing the string received from client
        String msg=new String(dp.getData()).trim();
        System.out.println("From Client "+msg);
        StringBuilder sb=new StringBuilder(msg);
        sb.reverse();
        msg=sb.toString();
        
         dp=new DatagramPacket(msg.getBytes(),msg.length(),InetAddress.getByName("localhost"),2001);
        //message sending back to client.
        ds.send(dp);
          
        ds.close();
    }
    
}