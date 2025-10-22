import java.net.*;
public class InetAddressDemo3 {
    public static void main(String[] args) {
        try{
            InetAddress localhost = InetAddress.getLocalHost();
            System.out.println("Local host: "+localhost);
            System.out.println("Host name: "+localhost.getHostName());
            System.out.println("Host address: "+localhost.getHostAddress());
            System.out.println("Description: "+localhost.toString());
            System.out.println("Multicasting: "+localhost.isMulticastAddress());
        }catch(Exception e){
            System.out.println("Exception occur: "+e);
        }
    }
}
