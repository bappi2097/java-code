package javalab17_07;
import java.io.*;
import java.util.Scanner;
public class JavaLab17_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input Name: ");
        String name = scan.nextLine();
        System.out.println("Input Age : ");
        int age = scan.nextInt();
        try{
            File f = new File("bappi.txt");
            FileWriter fw = new FileWriter(f,true);
            fw.write(name+"\r"+age+"\r");
            fw.close();
            
        }
        catch(IOException e){
            System.out.println("File Not Found");
        }
        try{
            File f = new File("bappi.txt");
            Scanner input = new Scanner(f);
            String num = "";
            while (input.hasNext()) {
                num+= input.nextLine()+"\n";
                
            }
            System.out.println("\n"+num);
        }
            catch(IOException e){
                    System.out.println("File Not Found");
        }   
    }
}
