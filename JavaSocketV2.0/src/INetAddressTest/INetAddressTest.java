package INetAddressTest;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class INetAddressTest {

    public static void main(String[] args) throws UnknownHostException {
        Scanner input = new Scanner(System.in);
        try {
            InetAddress ip = InetAddress.getByName("www.google.com");

            System.out.println(ip.getHostName());
            System.out.println(ip.getHostAddress());
        }catch(UnknownHostException e){
            System.err.println(e);
        }
    }
}
