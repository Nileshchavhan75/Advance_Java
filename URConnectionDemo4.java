import java.net.*;
import java.io.*;
import java.util.Date;
public class URConnectionDemo4 {
    public static void main(String[] args) {
        try{
            URL url = new URL("https://example.com");
            URLConnection conn = url.openConnection();

            System.out.println("Content type: "+conn.getContentType());
            long date = conn.getDate();
            System.out.println("Date: "+new Date(date));

            System.out.println("Content lenght: "+conn.getContentLength());
            System.out.println("Url: "+conn.getURL());
            System.out.println("Downloading remote Content");

            InputStream is = conn.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            FileOutputStream fr = new FileOutputStream("Demo.html");
            PrintWriter pw = new PrintWriter(fr);

            String data;
            while ((data = br.readLine()) != null) {
                pw.println(data);
            }
            System.out.println("Download Completed, check demo.html");
            br.close();
            pw.close();

        }catch(Exception e){
            System.out.println("Exception occur: "+e.getMessage());
        }
    }
}
