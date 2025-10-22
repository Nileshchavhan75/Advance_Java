import java.net.*;

public class InetAddressDemo {
    public static void main(String[] args) {
        try {
            InetAddress localhost = InetAddress.getLocalHost(); // Fixed syntax error
            System.out.println("Local Host: " + localhost);
            System.out.println("Host Name: " + localhost.getHostName()); // Fixed method call
            System.out.println("Host Address: " + localhost.getHostAddress());
            System.out.println("Description: " + localhost.toString());
            System.out.println("Is it a Multicast Address: " + localhost.isMulticastAddress());

        } catch (UnknownHostException e) { // Specific Exception Handling
            System.out.println("Unknown Host Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
  