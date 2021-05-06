package midtermque3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Book ID : ");
        int bookID = input.nextInt();
        System.out.println("Enter Book Name : ");
        String bookName= input.nextLine();
        bookName= input.nextLine();
        System.out.println("Enter Book Author : ");
        String bookAuthor = input.nextLine();
        Book obj = new Book(bookID, bookName, bookAuthor);
        int a=obj.printBookType(bookID);
        System.out.println("Enter No Of Books : ");
        int NoOfBook = input.nextInt();
        int price = obj.Calculate(bookID, NoOfBook);
        System.out.print("\nBook ID :"+bookID+"\nBook Name : "+bookName);
        System.out.print("\nBook Author : "+bookAuthor+"\nBook Type : "+obj.printBookType(bookID));
        System.out.print("\nNo Of Book : "+NoOfBook+"\nBook Price : "+price);
        System.out.println("");
    }
    
}
