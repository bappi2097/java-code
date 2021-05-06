package ServerAndClient;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Server {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        ServerSocket ss = new ServerSocket(1254);
        Socket s = ss.accept();
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        DataInputStream dis = new DataInputStream(s.getInputStream());
        for (int i = 0; i < 3; i++) {

            System.out.print("Enter your comment :");
            dos.writeUTF(input.nextLine());

            dos.flush();

            String str = dis.readUTF();
            System.out.println(str);

        }
        dos.close();
        dis.close();
        s.close();
    }
}
