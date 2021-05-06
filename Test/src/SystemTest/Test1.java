package SystemTest;

import java.io.*;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Test1 {

    public static void main(String[] args) throws Exception{
        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
        byte[] sendData = new byte[1204];
        byte[] receiveData = new byte[1204];
        DatagramSocket clientSocket = new DatagramSocket();
        InetAddress IPAddress = InetAddress.getByName("blue.cs.yorku.ca");
        String sentence = inFromUser.readLine();
        sendData = sentence.getBytes();

    }
}
