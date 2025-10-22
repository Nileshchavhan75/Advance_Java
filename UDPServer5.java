import java.net.*;
public class UDPServer5 {
    public static void main(String[] args) {
        try{
            DatagramSocket ds = new DatagramSocket(9000);
            byte arr[] = new byte[100];
            DatagramPacket dp = new DatagramPacket(arr, 100);
            System.out.println("Before receive");
            ds.receive(dp);
            byte a[] = dp.getData();
            String s = new String(a);
            System.out.println("Massage from client: "+s);
            ds.close();
        }catch(Exception e){
            System.out.println("Error: "+e);
        }
    }
}
