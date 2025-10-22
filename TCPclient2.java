import java.net.*;
import java.io.*;
public class TCPclient2 {
    public static void main(String[] args) {
        try{
            Socket s = new Socket("127.0.0.1",1084);

            OutputStream os = s.getOutputStream();
            PrintWriter pw = new PrintWriter(os,true);

            pw.print("Hello server");
            pw.flush();

            pw.close();
            s.close();
        }catch(Exception e){
            System.out.println("Exception: "+e.getMessage());
        }
    }
}
