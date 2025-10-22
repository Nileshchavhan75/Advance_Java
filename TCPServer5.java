import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer5 {
    public static void main(String[] args) {
        try{
            ServerSocket ss = new ServerSocket(1034);
            System.out.println("Before accepting: ");
            Socket s = ss.accept();
            System.out.println("After accepting: ");

            InputStream is = s.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            String msg = br.readLine();
            System.out.println("Massage from the client: "+msg);

            br.close();
            s.close();
            ss.close();
        }catch(Exception e){
            System.out.println("Exception e: "+e.getMessage());
        }
    }
}
