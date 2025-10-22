import java.io.*;
import java.net.*;
import java.util.*;

public class TcpChatClient{
    public static void main(String[] args){
        String serverAddr = "localhost";
        int port = 5050;

        try(Socket socket = new Socket(serverAddr, port);
             PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             Scanner in = new Scanner(System.in)){

            System.out.println("Connected to Server.");
            String clientMessage, serverResponse;

            while(true){
                System.out.print("You: ");
                clientMessage = in.nextLine();   
                output.println(clientMessage);

                if(clientMessage.equalsIgnoreCase("exit")){
                    System.out.println("Closing connection...");
                    break;
                }

                serverResponse = input.readLine();
                if(serverResponse == null || serverResponse.equalsIgnoreCase("exit")){
                    System.out.println("Server disconnected.");
                    break;
                }
                System.out.println("Server: " + serverResponse);
            }

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
