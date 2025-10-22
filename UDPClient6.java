import java.net.*;
public class UDPClient6 {
    public static void main(String[] args) {
        try{
            DatagramSocket ds = new DatagramSocket(8000);
            System.out.println("Client sending masssage to the server");
            String s = "Hello server";
            byte arr[] = s.getBytes();
            DatagramPacket dp = new DatagramPacket(arr, arr.length,InetAddress.getLocalHost(),9000);
            ds.send(dp);
            ds.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
