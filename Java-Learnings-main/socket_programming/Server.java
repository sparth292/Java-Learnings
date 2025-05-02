import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws Exception{
        
        ServerSocket serverSocket = new ServerSocket(9000);
        Socket socket = new Socket();
        socket = serverSocket.accept();
        System.out.println("Client is connected: "+socket.getInetAddress()+" ");

        DataInputStream dis = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String message = "";
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        String serverMessage = "";
        
        while(!message.equalsIgnoreCase("quit")) {

            
    
                message = dis.readUTF();
                System.out.print("client: "+message+" \n");
                System.out.print("Enter message: ");
                serverMessage = br.readLine();
                System.out.print("server: "+serverMessage+"\n");
                dos.writeUTF(serverMessage);

                
            }

        
                
                dis.close();
                dos.close();
                socket.close();
                serverSocket.close();
                br.close();
            

            
    }
}
    
    

