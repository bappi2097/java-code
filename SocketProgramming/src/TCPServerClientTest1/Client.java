package TCPServerClientTest1;
import java.io.*;
import java.net.*;
public class Client {
    public static void main(String[] args)throws Exception {
        Socket s = new Socket("localhost", 9999);
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
        String sentence = input.readLine();
        dos.writeUTF(sentence);
        System.out.println(dis.readUTF());
        s.close();
    }
}
