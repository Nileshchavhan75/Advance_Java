import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;

public class TCPServer2 {
    public static void main(String[] args) {
        try{
            ServerSocket ss = new ServerSocket(1034);
            System.out.println("Before accepting connection");

            Socket s = ss.accept();
            System.out.println("After accepting connection");

            InputStream is = s.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            String msa = br.readLine();
            System.out.println("Massaged from the client: "+msa);

            ss.close();
            br.close();
            s.close();

        }catch(Exception e){
            System.out.println("Exception occur: "+e.getMessage());
        }
    }
}
