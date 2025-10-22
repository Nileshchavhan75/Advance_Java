import java.net.*;
public class URLDemo5 {
    public static void main(String[] args) {
        try{
        URL url = new URL("https://www.google.com:80/index.html");
        System.out.println("Protocol: "+url.getProtocol());
        System.out.println("Host: "+url.getHost());
        System.out.println("port: "+url.getPort());
        System.out.println("File: "+url.getFile());
        System.out.println("External form: "+url.toExternalForm());
    }catch(Exception e){
        System.out.println("error: "+e.getMessage());
    }
}
}