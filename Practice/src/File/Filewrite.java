package File;

import java.io.*;

public class Filewrite {

    public Filewrite(String id, String Name) {
        try {
            File f = new File("bappi.txt");
            try (FileWriter fw = new FileWriter(f,true)) {
                fw.write(id+"\n"+Name+"\n");
            }
        }catch(IOException e){
            System.err.println(e);
        }
    }
}
