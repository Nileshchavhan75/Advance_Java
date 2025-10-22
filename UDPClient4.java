import java.util.*;
import java.net.*;
public class UDPClient4 {
    public static void main(String[] args) {
        try{
            DatagramSocket ds = new DatagramSocket(8000);
            System.out.println("clinet sending massage to the server ");
            String s = "hello server";
            byte a[] = s.getBytes();
            DatagramPacket dp = new DatagramPacket(a, a.length, InetAddress.getLocalHost(),9000);
            ds.send(dp);
            ds.close();
        }catch(Exception e){
            System.out.println("Exception occured: "+e.getMessage());
        }
    }
}
