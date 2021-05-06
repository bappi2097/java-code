package TCPServerClientTest1;
import java.io.*;
import java.net.*;
public class Server {
    public static void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(9999);
        Socket s = ss.accept();
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos= new DataOutputStream(s.getOutputStream());
        String sentence = dis.readUTF();
        dos.writeUTF(sentence.toUpperCase());
        s.close();
        ss.close();
    }
}
