import java.util.*;
import java.net.*;
public class UDPClient3 {
    public static void main(String[] args) {
        try{
        DatagramSocket ds = new DatagramSocket(8000);
        System.out.println("sending massage to the server");
        String s = "Hello Server";
        byte b[] = s.getBytes();
        DatagramPacket dp = new DatagramPacket(b,b.length,InetAddress.getLocalHost(),9000);
        ds.send(dp);
        ds.close();
    }catch(Exception e){
        System.out.println("Exception occur: "+e);
    }
}
}
