import java.util.*;
import java.net.*;
public class UDPServer4 {
    public static void main(String[] args) {
        try{
            DatagramSocket ds = new DatagramSocket(9000);
            byte arr[] = new byte[100];
            DatagramPacket dp = new DatagramPacket(arr, 100);
            ds.receive(dp);
            System.out.println("After receiving server got massage");
            byte a [] = dp.getData();
            String s = new String(a);
            System.out.println("Masssage from the client: "+s);
            ds.close();

        }catch(Exception e){
            System.out.println("Exception: "+e.getMessage());
        }
    }
}
