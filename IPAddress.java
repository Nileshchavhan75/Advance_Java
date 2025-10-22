import java.net.*;
import java.util.Scanner;
public class IPAddress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the host name: ");
        String host = sc.next();
        try{
            InetAddress ip = InetAddress.getByName(host);
            System.out.println("IP address of: "+ host +" is: "+ip.getHostAddress());
        
        }catch(Exception e){
            System.out.println(e);
            sc.close();
        }
    }
}
