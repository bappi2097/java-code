package Test;

import java.net.Inet4Address;
//import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String url = "www.google.com";
        try {
            System.out.println("........InetAddress........");
            InetAddress address = (InetAddress)InetAddress.getByName(url);
            System.out.println(address.getHostAddress()+"\n"+address.getCanonicalHostName());
            System.out.println("........Inet4Address........");
            Inet4Address address4 = (Inet4Address) Inet4Address.getByName(url);
            System.out.println(address4.getHostAddress()+"\n"+address4.getCanonicalHostName());
            //there i have an error & i need to find why.
          /*  System.out.println("........Inet6Address........");
            Inet6Address address6 = (Inet6Address) Inet6Address.getByName(url);
            System.out.println(address6.getHostAddress()+"\n"+address6.getCanonicalHostName());
           */ 
        } catch (UnknownHostException | ClassCastException e) {
            System.err.println(e);
        }
    }
}
