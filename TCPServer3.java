import java.io.*;
import java.net.*;
public class TCPServer3 {
    public static void main(String[] args) {
        try{
            ServerSocket ss = new ServerSocket(1084);
            System.out.println("Before accepting connection");

            Socket s = ss.accept();
            System.out.println("After accepting connection");

            InputStream is = s.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            String msg = br.readLine();
            System.out.println("Masseage from the client: "+msg);

            ss.close();
            s.close();
            is.close();

        }catch(Exception e){
            System.out.println("Exception occur: "+e.getMessage());
        }
    }
}
