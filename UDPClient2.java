import java.net.*;
public class UDPClient2 {
    public static void main(String[] args) {
        try{
            DatagramSocket ds = new DatagramSocket(8000);
            System.out.println("Massage send for the client: ");
            String s = "Hello Server";
            byte[] br = s.getBytes();
            DatagramPacket dp = new DatagramPacket(br, br.length,InetAddress.getLocalHost(),9000);
            ds.send(dp);
            ds.close();
        }catch(Exception e){
            System.out.println("Exception occur: "+e.getMessage());
        }
    }
}
