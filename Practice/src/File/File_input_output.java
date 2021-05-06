package File;
import java.util.*;
import java.io.*;
public class File_input_output {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        try{
            File f = new File("bappi.txt");
            try (FileWriter fw = new FileWriter(f)) {
                System.out.println("Enter Name : ");
                String name = input.nextLine();
                System.out.println("Enter ID : ");
                String id = input.nextLine();
                System.out.println("Enter Algo Mark : ");
                String algo =input.nextLine();
                System.out.println("Enter Java Mark : ");
                String java = input.nextLine();
                System.out.println("Enter DB mark : ");
                String db = input.nextLine();
                fw.write(name+"\n"+id+"\n"+algo+"#"+java+"#"+db);
            }
        }catch(IOException e){
            System.err.println(e);
        }
        try{
            File f = new File("bappi.txt");
            FileWriter fw = new FileWriter(f,true);
            Scanner fs = new Scanner(f);
            System.out.println(fs.nextLine());
            System.out.println(fs.nextLine());
            String str = fs.nextLine();
            double sum=0,avg;
            String []parts = str.split("#");
            for (int i = 0; i < parts.length; i++) {
                sum+=Double.parseDouble(parts[i]);
            }
            avg=sum/parts.length;
            System.out.println(avg);
            fw.write(Double.toString(avg));
        }catch(IOException e){
            System.err.println(e);
        }
    }
}
