package finalexamque02;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        try{
            File f = new File("Age.txt");
            Scanner fs = new Scanner(f);
            while(fs.hasNext()){
                if(Integer.parseInt(fs.nextLine())>18){
                    eligible();
                }
                else{
                    store();
                }
            }
        }catch(FileNotFoundException e){
            System.err.println(e);
        }
    }
    public static void eligible(){
        try{
            File f = new File("Eligible.txt");
            FileWriter fw = new FileWriter(f);
            fw.write("This Constant Is Eligible");
            fw.close();
        }catch(IOException e){
            System.err.println(e);
        }
    }
    public static void store(){
        Scanner input = new Scanner(System.in);
        try{
            File f = new File("Eligible.txt");
            FileWriter fw = new FileWriter(f,true);
            String a = input.nextLine();
            fw.write("\n"+a+"\n");
            fw.close();
        }catch(IOException e){
            System.err.println(e);
        }
    }
}
