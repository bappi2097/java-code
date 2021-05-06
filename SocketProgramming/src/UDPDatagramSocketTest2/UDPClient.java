package UDPDatagramSocketTest2;
import java.net.*;
import java.io.*;
public class UDPClient {

    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        byte [] sendData=new byte[1024];
        byte [] receiveData=new byte[1024];
        String sentence = input.readLine();
        sendData=sentence.getBytes();
        DatagramSocket clientSocket = new DatagramSocket();
        InetAddress IPAddress=InetAddress.getByName("localhost");
        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 9999);
        clientSocket.send(sendPacket);
        DatagramPacket receivePacket = new DatagramPacket(receiveData,receiveData.length);
        clientSocket.receive(receivePacket);
        String modifiedSentence = new String(receivePacket.getData());
        System.out.println(modifiedSentence);
        clientSocket.close();
    }
}
