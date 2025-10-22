import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
    public static void main(String[] args) {
        try{
            DatagramSocket ds = new DatagramSocket(9000);
            byte arr[] = new byte[100];
            DatagramPacket dp = new DatagramPacket(arr, 100);
            System.out.println("Before receive");
            ds.receive(dp);
            System.out.println("After receiving server got message");
            byte a[] = dp.getData();
            String s = new String(a);
            System.out.println("Message from client "+s);
            ds.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
