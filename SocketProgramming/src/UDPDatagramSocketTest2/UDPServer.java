package UDPDatagramSocketTest2;
import java.net.*;
class UDPServer {

    public static void main(String argv[]) throws Exception {
        DatagramSocket serverSocket = new DatagramSocket(9999);
        byte [] receiveData = new byte[1024];
        byte [] sendData = new byte[1024];
        while(true){
            DatagramPacket receivePacket = new DatagramPacket(receiveData,receiveData.length);
            serverSocket.receive(receivePacket);
            InetAddress IPAddress = receivePacket.getAddress();
            int port = receivePacket.getPort();
            String sentence = new String(receivePacket.getData());
            String UpperCase = sentence.toUpperCase();
            sendData=UpperCase.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, port);
            serverSocket.send(sendPacket);
        }
        
    }
}
