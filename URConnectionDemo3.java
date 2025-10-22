import java.io.*;
import java.net.*;
import java.util.Date;;
public class URConnectionDemo3 {
    public static void main(String[] args) {
        try{
            URL url = new URL("http://www.google.com/index.html");
            URLConnection con = url.openConnection();

            System.out.println("Content type: "+con.getContentType());

            long date = con.getDate();
            System.out.println("Date: "+new Date(date));

            System.out.println("Length: "+con.getContentLength());
            System.out.println("Url: "+con.getURL());
            System.out.println("downloading remote content");


            InputStream is = con.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            FileOutputStream fos = new FileOutputStream("demo.html");
            PrintWriter pw = new PrintWriter(fos);

            String data;
            while ((data = br.readLine()) != null) {
                pw.println(data);
            }
            System.out.println("Download completed, check demo.html");
            br.close();
            pw.close();
        }catch(Exception e){
            System.out.println("Exception: "+e.getMessage());
        }
    }
    
}
