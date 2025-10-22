import java.util.Scanner;
import java.net.*;
class IPAddress3{
    public static void main(String[] args) {
        try{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Host Name: ");
        String host = sc.next();
        InetAddress ip = InetAddress.getByName(host);
        System.out.println("Ip address of "+host+" is: "+ip.getHostAddress());
    }catch(Exception e){
        System.out.println("Exception occur: "+e.getMessage());
    }
    }
}