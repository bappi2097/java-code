package ClientPackage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientMain {

    public static void main(String[] args) throws Exception {
        ClientHome cobj = new ClientHome();
        cobj.setVisible(true);
        Socket s;
        DataOutputStream dos;
        try {
            s = new Socket("127.0.0.1", 9999);
            DataInputStream dis = new DataInputStream(s.getInputStream());
            dos = new DataOutputStream(s.getOutputStream());
            try {
                while (cobj.close) {
                    dos.writeUTF(cobj.input);
                    dos.flush();
                    cobj.Load(dis.readUTF());
                }
                dis.close();
                dos.close();
            } catch (IOException ex) {
                dis.close();
                dos.close();
            }
        } catch (IOException e) {
            System.exit(0);
        }
    }

}
