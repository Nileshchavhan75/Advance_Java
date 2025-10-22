import java.io.*;
import java.net.*;
public class TCPclient3 {
    public static void main(String[] args) {
        try{
        Socket s = new Socket("127.0.0.1",1084);

        OutputStream os = s.getOutputStream();
        PrintWriter pw = new PrintWriter(os, true);

        pw.println("Hello Server");
        pw.flush();
        s.close();
        pw.close();
        }catch(Exception e){
            System.out.println("Exception occur: "+e.getMessage());
        }
    }
}
