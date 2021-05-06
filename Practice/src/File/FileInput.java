package File;
import java.util.*;
import java.io.*;
public class FileInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            File f = new File("FileInput.txt");
            try (FileWriter fw = new FileWriter(f)) {
                for (int i = 0; i <= 100; i++) {
                    fw.write(String.valueOf(i) + "\n");
                }
            }
        } catch (IOException e) {
            System.err.println(e);
        }
        try {
            File f = new File("FileInput.txt");
            Scanner fs;
            try (FileWriter fw = new FileWriter(f, true)) {
                fs = new Scanner(f);
                int a = 0;
                while (fs.hasNext()) {
                    a += Integer.parseInt(fs.nextLine());
                }   fw.write("#\nSum Of Number : " + String.valueOf(a));
            }
            fs.close();
        } catch (IOException | NumberFormatException e) {
            System.err.println(e);
        }
        try {
            File f = new File("FileInput.txt");
            try (Scanner fs = new Scanner(f)) {
                String b;
                while (fs.hasNext()) {
                    b = fs.nextLine();
                    if (b.equals("#")) {
                        System.out.println(fs.nextLine());
                    }
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.err.println(e);
        }
    }
}
