import java.net.*;
public class URLDemo3 {
    public static void main(String[] args) {
        try{
            URL url = new URL("http://www.google.com:80/index.html");
            System.out.println("protocol: "+url.getProtocol());
            System.out.println("Host: "+url.getHost());
            System.out.println("Post: "+url.getPort());
            System.out.println("File: "+url.getFile());
            System.out.println("ExternalForm: "+url.toExternalForm());
        }catch(Exception e){
            System.out.println("Exception occur: "+e);
        }
    }
}
