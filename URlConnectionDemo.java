import java.io.*;
import java.net.*;
import java.util.Date;

public class URConnectionDemo {  // Keeping your class name the same
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.google.com/index.html");
            URLConnection con = url.openConnection();

            System.out.println("Content Type: " + con.getContentType());

            long date = con.getDate();
            if (date == 0) {
                System.out.println("Date: Unknown");
            } else {
                System.out.println("Date: " + new Date(date));
            }

            System.out.println("Content Length: " + con.getContentLength());
            System.out.println("URL: " + con.getURL());
            System.out.println("Downloading remote content...\n");

            // Read web content
            InputStream is = con.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            // ✅ Save file in the current directory (fixes access issue)
            FileOutputStream fos = new FileOutputStream("demo.html");
            PrintWriter pw = new PrintWriter(fos);

            String data;
            while ((data = br.readLine()) != null) {
                pw.println(data);
            }

            // Close resources
            br.close();
            pw.close();

            System.out.println("Download completed. Check demo.html"); // ✅ Fixed output message

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
