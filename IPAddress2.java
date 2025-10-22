import java.net.*;
import java.util.Scanner;
public class IPAddress2 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Host Name: ");
            String host = sc.next();
            InetAddress ip = InetAddress.getByName(host);
            System.out.println("Ip Address of: "+host +" is: "+ ip.getHostAddress());
            sc.close();

        }catch(Exception e){
            System.out.println("Exception: "+e.getMessage());
        }
    }
}
