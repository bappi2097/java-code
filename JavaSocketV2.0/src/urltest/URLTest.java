package urltest;

import java.net.*;
import java.util.Scanner;

public class URLTest {

    public static void main(String[] args) throws MalformedURLException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter URL : ");
        try {
            URL url = new URL("https://www.google.com");
            System.out.println(url.getProtocol());
            System.out.println(url.getHost());
            System.out.println(url.getUserInfo());
            System.out.println(url.getPort());
            System.out.println(url.getFile());
            System.out.println(url.getPath());
        }catch(MalformedURLException e){
            System.err.println(e);
        }
    }
}
