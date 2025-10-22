import java.net.InetAddress;
import java.util.*;
public class InetAddressDemo4 {
    public static void main(String[] args) {
        try{
            InetAddress localhost = InetAddress.getLocalHost();
            System.out.println("LocalHost: "+localhost);
            System.out.println("Host Name: "+ localhost.getHostName());
            System.out.println("Host Address: "+localhost.getHostAddress());
            System.out.println("Description: "+localhost.toString());
            System.out.println("Multicast: "+localhost.isMulticastAddress());
        }catch(Exception e){
            System.out.println("Exception occur: "+e.getMessage());
        }
    }
}
