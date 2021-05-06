package urltest;
//In This Class I Have Some Error and Need to fix it.
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class URLConnectionTest {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        try {
            URL u1 = new URL("http://www.facebook.com");
            URLConnection u2 = u1.openConnection();
            InputStream is = u2.getInputStream();
            int i;
            while ((i = is.read()) != -1) {
                System.out.println((char) i);
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
