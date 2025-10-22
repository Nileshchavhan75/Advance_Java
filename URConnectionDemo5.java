import java.net.*;
import java.util.*;
import java.io.*;
public class URConnectionDemo5 {
    public static void main(String[] args) {
        try{
            URL url = new URL("https://www.google.com/index.html");
            URLConnection con = url.openConnection();

            System.out.println("Content type: "+con.getContentType());
            long date = con.getDate();
            System.out.println("Date: "+new Date(date));

            System.out.println("ContentLength: "+con.getContentLength());
            System.out.println("URl: "+con.getURL());
            System.out.println("Download remote Content");

            InputStream is = con.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            FileOutputStream fos = new FileOutputStream("Demo.html");
            PrintWriter pw = new PrintWriter(fos);

            String data;
            while ((data = br.readLine()) != null) {
                pw.println(data);
            }

            System.out.println("Download complete please check it");
            br.close();
            pw.close();
        }catch(Exception e){
            System.out.println("Exception occur: "+e.getMessage());
        }
    }
}
