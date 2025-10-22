import java.io.*;
import java.net.*;
import java.util.*;

public class TcpChatServer{
    public static void main(String[] args){
        int port = 5050;
        try(ServerSocket serverSocket = new ServerSocket(port);
             Socket socket = serverSocket.accept();
             BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
             Scanner in = new Scanner(System.in)){

            System.out.println("Client is Online");
            String clientMessage = "", serverMessage;

            while(true){
                clientMessage = input.readLine();
                if(clientMessage == null || clientMessage.equalsIgnoreCase("exit")) {
                    System.out.println("Client disconnected.");
                    break;
                }
                System.out.println("Client: " + clientMessage);

                System.out.print("You: ");
                serverMessage = in.nextLine();
                output.println(serverMessage); 

                if(serverMessage.equalsIgnoreCase("exit")){
                    System.out.println("Closing connection...");
                    break;
                }
            }

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
