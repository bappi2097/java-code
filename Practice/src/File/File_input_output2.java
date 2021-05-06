package File;
import java.util.*;
import java.io.*;
public class File_input_output2 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(System.in);
        try{
            File f = new File("fuad.txt");
            try (FileWriter fw = new FileWriter(f,true)) {
                System.out.println("Enter Name : ");
                String name = input.nextLine();
                fw.write(name);
                System.out.println("Enter ID : ");
                String id ="\n";
                id+=input.nextLine();
                fw.write(id);
                System.out.println("Enter algo : ");
                String algo = input.nextLine();
                fw.write(algo);
                System.out.println("Enter Java : ");
                String java = input.nextLine();
                fw.write(java);
                System.out.println("Enter DB : ");
                String db = input.nextLine();
                fw.write(db);
            }
        }catch(IOException e){
            System.err.println(e);
        }
        try{
            File f = new File("fuad.txt");
            Scanner sc = new Scanner(f);
            while(sc.hasNext())System.out.println(sc.nextLine());
        }catch(FileNotFoundException e){
            System.err.println(e);
        }
    }
}
