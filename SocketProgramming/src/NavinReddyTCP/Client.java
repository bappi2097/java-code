package NavinReddyTCP;

import java.net.Socket;
import java.io.*;

public class Client {

    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost",9999);
        String str = "Navin Reddy";
        OutputStreamWriter os = new OutputStreamWriter(s.getOutputStream());
        PrintWriter out = new PrintWriter(os);
        out.println(str);
        os.flush();
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String nickName=br.readLine();
        System.out.println("C : Data from Server : "+nickName);
    }
}
