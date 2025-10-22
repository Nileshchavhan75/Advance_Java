import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.*;
public class TCPclient6 {
    public static void main(String[] args) {
        try{
            Socket s = new Socket("127.0.0.1",1034);

            OutputStream os = s.getOutputStream();
            PrintWriter pw = new PrintWriter(os,true);
            pw.println("Hello server");
            pw.flush();
            pw.close();
            s.close();
        }catch(Exception e){
            System.out.println("error: "+e.getMessage());
        }
    }
}
