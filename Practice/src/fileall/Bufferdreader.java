package fileall;

import java.io.*;
import java.util.*;

public class Bufferdreader {

   // List<String> lines = new ArrayList<String>();

    public void replace() {
        try {
            File f = new File("Bappi123.txt");
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);
            fw.write("My name is Khan");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String line = null;

            while ((line = br.readLine()) != null) {
                line.replaceAll("My name is Khan1", "My name is Khan"); //I also tried , line=line.replaceAll("javascript", "perl script"); 
                bw.write(line);
            }
            fw.close();
            fr.close();
            br.close();
            bw.close();

        } catch (IOException ioe) {
            System.err.println(ioe);
        }

    }

    public static void main(String[] args) {
        Bufferdreader r = new Bufferdreader();
        r.replace();
    }
}
