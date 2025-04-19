import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Socket1 {
    public static void main(String[] args) throws Exception {
        
        String ip = "localhost";
        int portNumber = 9999;
        Socket s1 = new Socket(ip,portNumber);     // Assign a port number in the args
        String str = "Parth Salunke";
        OutputStreamWriter o1 = new OutputStreamWriter(s1.getOutputStream());
        PrintWriter p1 = new PrintWriter(o1);
        o1.write(str);
        p1.close();
        o1.close();
        s1.close();
    }
}
