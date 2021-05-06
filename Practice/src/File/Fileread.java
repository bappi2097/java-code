package File;
import java.util.*;
import java.io.*;
public class Fileread {
    public Fileread(){
        try{
            File f = new File("bappi.txt");
            Scanner sc = new Scanner(f);
            while(sc.hasNext())System.out.println(sc.nextLine());
        }catch(FileNotFoundException e){
            System.err.println(e);
        }
    }
}
