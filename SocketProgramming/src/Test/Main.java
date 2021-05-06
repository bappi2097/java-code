package Test;
import java.net.Inet4Address;
import java.net.UnknownHostException;
public class Main {
    public static void main(String[] args) {
        String url = "javacodegeeks.com";
        try{
            Inet4Address address = (Inet4Address)Inet4Address.getByName(url);
            System.out.println("The IP of "+url+" is "+address.getHostAddress());
        }catch(UnknownHostException e){
            e.printStackTrace();
        }
    }
    
}
