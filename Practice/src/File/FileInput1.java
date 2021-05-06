package File;

import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileInput1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            File f = new File("Rakib.txt");
            FileWriter fw = new FileWriter(f);
            fw.write(10+"#"+20+"#"+25);
            fw.close();
        }catch(IOException e){
            System.err.println(e);
        }
        try{
            File f = new File("Rakib.txt");
            FileWriter fw = new FileWriter(f,true);
            Scanner fs = new Scanner(f);
            String[] parts=fs.nextLine().split("#");
            int a=0;
            for(int i=0;i<parts.length;i++)a+=Integer.parseInt(parts[i]);
            fw.write("\nSum Is :"+a);
            fw.write("\nAvg Is : "+a/3);
            fw.close();
            fs.close();
            System.out.println(a);
        }catch( FileNotFoundException e){
            System.err.println(e);
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
