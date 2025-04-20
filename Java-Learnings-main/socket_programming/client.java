import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

class Client  {

    public static void main(String[] args) throws Exception{
     
          Socket socket = new Socket("localhost", 9000);
          System.out.println("Connected to the server");
          DataInputStream dis = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
          DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

          String message = "";
         

            while(!message.equalsIgnoreCase("quit")) { 
                System.out.print("Enter message: ");
                message = br.readLine();
                dos.writeUTF(message);
                System.out.println("server: "+dis.readUTF());
            }
 
            
                dis.close();
                dos.close();
                socket.close();
                br.close();
            }
            
          
    }   
   

   