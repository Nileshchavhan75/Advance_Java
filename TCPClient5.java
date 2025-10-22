import java.net.*;
import java.io.*;
public class TCPClient5 {
    public static void main(String[] args) {
        try{
            Socket s = new Socket("127.0.0.1",1034);

            OutputStream os = s.getOutputStream();
            PrintWriter pw = new PrintWriter(os,true);

            pw.print("Hello server");
            pw.flush();
            pw.close();
            s.close();
        }catch(Exception e){
            System.out.println("Exception occur: "+e.getMessage());
        }
    }
}
