package ServerPackage;

import java.net.*;
import java.io.*;

public class ServerMain {

    public static void main(String[] args) throws Exception {
        ServerHome sobj = new ServerHome();
        sobj.setVisible(true);
        ServerSocket ss;
        Socket s;
        DataOutputStream dos;
        try {
            ss = new ServerSocket(9999);
            s = ss.accept();
            DataInputStream dis = new DataInputStream(s.getInputStream());
            dos = new DataOutputStream(s.getOutputStream());
            try {
                while (sobj.close) {
                    dos.writeUTF(sobj.input);
                    dos.flush();
                    sobj.Load(dis.readUTF());
                }
                dis.close();
                dos.close();
            } catch (IOException ex) {
                dis.close();
                dos.close();
            }
        } catch (IOException e) {

        }
    }
}
