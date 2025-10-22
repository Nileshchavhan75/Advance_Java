
import java.net.*;
public class URLDemo {
    public static void main(String[] args) {
        try{
            URL url = new URL("http://www.google.com:80/index.html");
            System.out.println("protocol:"+url.getProtocol());
            System.out.println("Hostname: "+url.getHost());
            System.out.println("port: "+url.getPort());
            System.out.println("File: "+url.getFile());
            System.out.println("External Form: "+ url.toExternalForm());
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
