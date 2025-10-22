import java.net.*;
import java.io.*;

public class TCPServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(1034); // Create server socket
            System.out.println("Before Accepting connection");
            
            Socket s = ss.accept(); // Accept client connection
            System.out.println("After Accepting Connection");
            
            InputStream is = s.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            
            String msg = br.readLine();
            System.out.println("Message from client to server: " + msg);
            
            // Close resources
            br.close();
            s.close();
            ss.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
