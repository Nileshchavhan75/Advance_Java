import java.io.*;
import java.net.*;
import java.util.Date;
public class URConnectionDemo2 {
    public static void main(String[] args) {
        try{
            URL url = new URL("https://www.google.com/index.html");
            URLConnection con = url.openConnection();

            System.out.println("Content Type: "+con.getContentType());

            long date = con.getDate();
            if(date == 0){
                System.out.println("Date Unknonw");
            }else{
                System.out.println("Date: "+new Date(date));
            }
            System.out.println("Content Lenght: "+con.getContentLength());
            System.out.println("URL: "+con.getURL());
            System.out.println("Downloading Remote Content...\n");

            InputStream is = con.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);


            FileOutputStream fr = new FileOutputStream("Demo.html");
            PrintWriter pw = new PrintWriter(fr);

            String data;
            while ((data = br.readLine())!= null) {
                pw.println(data);
            }
            br.close();
            pw.close();
            
            System.out.println("Downloaded completed, check demo.html");
        }catch(Exception e){
            System.out.println("Exception: "+e.getMessage());
        }
    }
}
