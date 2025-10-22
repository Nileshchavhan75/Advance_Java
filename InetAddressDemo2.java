import java.net.*;
public class InetAddressDemo2 {
    public static void main(String[] args) {
        try{
            InetAddress locolhost = InetAddress.getLocalHost();
            System.out.println("Local host: "+locolhost);
            System.out.println("Host Name: "+locolhost.getHostName());
            System.out.println("Host Address"+locolhost.getHostAddress());
            System.out.println("Description: "+locolhost.toString());
            System.out.println("it is a multicast adresss: "+locolhost.isMulticastAddress());
            
        }catch(UnknownHostException e){
            System.out.println("Unknow host Exception"+e.getMessage());
        }catch(Exception e){
            System.out.println("Exception: "+e.getMessage());
        }
    }
}
