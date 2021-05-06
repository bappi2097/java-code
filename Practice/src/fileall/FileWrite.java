package fileall;

import java.util.*;
import java.io.*;

public class FileWrite {

    static Scanner input = new Scanner(System.in);
    String Name, ID;
    double Balance, TotalDeposite = 0, TotalWithdrow = 0;

    public FileWrite(String name, String id, double balance) {
        Name = name;
        ID = id;
        Balance = balance;
    }

    public void Save() {
        try {
            File f = new File("FileWrite.txt");
            try (FileWriter fw = new FileWriter(f)) {
                fw.write("Name : " + Name + "\nID : " + ID + "\nBalance : " + Balance);
                fw.write("\nTotal Deposite : " + TotalDeposite);
                fw.write("\nTotal Withdrow : " + TotalWithdrow + "\n");
                fw.close();
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    public void Deposite(double deposite) {
        Balance += deposite;
        TotalDeposite += deposite;
    }

    public void CheckWithdrow() {
        boolean c = true;
        while (c) {
            System.out.println("Enter Withdrow Amount : ");
            double withdrow = input.nextDouble();
            if (Balance < withdrow) {
                System.out.println("Insuffecient Balance.");
                System.out.println("Do You Want To Withdrow Again (Y/N): ");
                input.nextLine();
                String t = input.nextLine();
                if (t.equalsIgnoreCase("N")) {
                    c = false;
                }
            } else {
                c=false;
                Withdrow(withdrow);
            }
        }
    }

    public void Withdrow(double withdrow) {
        Balance -= withdrow;
        TotalWithdrow -= withdrow;
    }

    public void Display() {
        try {
            File f = new File("FileWrite.txt");
            try (Scanner fs = new Scanner(f)) {
                while (fs.hasNext()) {
                    System.out.println(fs.nextLine());
                }
                fs.close();
            }
        } catch (FileNotFoundException e) {
            System.err.println(e);
        }
    }
}
