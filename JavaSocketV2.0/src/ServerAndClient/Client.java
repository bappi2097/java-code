package ServerAndClient;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        Socket s1 = new Socket("127.0.0.1", 1254);

        DataInputStream dis = new DataInputStream(s1.getInputStream());
        DataOutputStream dos = new DataOutputStream(s1.getOutputStream());
        for (int i = 0; i < 3; i++) {

            String str = dis.readUTF();
            System.out.println(str);

            System.out.print("Enter your comment :");
            dos.writeUTF(input.nextLine());
            dos.flush();

        }

        dis.close();
        dos.close();
        s1.close();
    }
}
