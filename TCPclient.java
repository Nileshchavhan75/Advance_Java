import java.net.*;
import java.io.*;

public class TCPclient {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("127.0.0.1", 1034); // Connect to server
            
            OutputStream os = s.getOutputStream();
            PrintWriter pw = new PrintWriter(os, true);
            
            pw.println("Hello Server"); // Send message
            pw.flush(); 
            // Close resources
            pw.close();
            s.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

