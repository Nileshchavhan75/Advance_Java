import java.net.*;
import java.util.Scanner;
public class IPAddress4 {
    public static void main(String[] args) {
        try{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Host Name: ");
        String host = sc.next();
        InetAddress ip = InetAddress.getByName(host);
        System.out.println("IP address of: "+host+" is: "+ip.getHostAddress());
        }catch(Exception e){
            System.out.println("error: "+e.getMessage());
        }

    }
}
