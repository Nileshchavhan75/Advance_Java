import java.net.*;
public class InetAddressDemo5 {
    public static void main(String[] args) {
        try{
        InetAddress locolhost = InetAddress.getLocalHost();
        System.out.println("Local host: "+locolhost);
        System.out.println("Host name: "+locolhost.getHostName());
        System.out.println("Host Addres: "+locolhost.getHostAddress());
        System.out.println("Discription: "+locolhost.toString());
        System.out.println(("multicast: "+locolhost.isMulticastAddress()));
    }catch(Exception e){
        System.out.println("Exception: "+e.getMessage());
    }
}
}
