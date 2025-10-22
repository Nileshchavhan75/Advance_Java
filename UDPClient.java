import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class  UDPClient{
    public static void main(String[] args) {
        try{
            DatagramSocket ds = new DatagramSocket(8000);
            System.out.println("client is sending message to server");
            String s = "Hello Server";
            byte b[] = s.getBytes();
            DatagramPacket dp = new DatagramPacket(b,b.length,InetAddress.getLocalHost(), 9000);
            ds.send(dp);
            ds.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
