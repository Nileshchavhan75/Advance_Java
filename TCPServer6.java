import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;
public class TCPServer6 {

        public static void main(String[] args) {
        try{
        ServerSocket ss = new ServerSocket(1034);
        System.out.println("Before Accepting massage");
        Socket s = ss.accept();
        System.out.println("After accepting massage");

        InputStream is = s.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String str = br.readLine();
        System.out.println("Masssage from client: "+str);

        br.close();
        s.close();
        ss.close();
    }catch(Exception e){
        System.out.println(e);
    }
}
}

