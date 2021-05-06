package filelab;
import java.util.*;
import java.io.*;
public class FileLab {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstNumber, secondNumber;
        double a = 0, b = 0;
        try {
            File f = new File("File.txt");
            try (FileWriter fw = new FileWriter(f,true)) {
                firstNumber = input.nextLine();
                secondNumber = input.nextLine();
                fw.write(firstNumber + "\n" + secondNumber+"\n");
            }
        } catch (IOException e) {
            System.err.println(e);
        }
        try {
            File f = new File("File.txt");
            Scanner fs = new Scanner(f);
            while (fs.hasNext()) {
                a = Double.parseDouble(fs.nextLine());
                b = Double.parseDouble(fs.nextLine());
                if (a > b) {
                    System.out.println("Max is " + a);
                    System.out.println("Min Is " + b);
                } else if (b > a) {
                    System.out.println("Max is " + b);
                    System.out.println("Min is " + a);
                } else {
                    System.out.println("A and B is Equale");
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println(e);
        }
    }
}