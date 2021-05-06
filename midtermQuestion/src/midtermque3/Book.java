package midtermque3;
public class Book {
    String bookName,bookAuthor;
    int bookID;
    public Book(int ID,String Name,String Author){
        this.bookID=ID;
        this.bookName=Name;
        this.bookAuthor=Author;
    }
    public int printBookType(int ID){
        if(ID>=0 && ID<=100){
            System.out.println("Type : Thriller");
            return 1;
        }
        else if(ID>=101 && ID<=200){
            System.out.println("Type : Action");
            return 2;
        }
        else{
            System.out.println("Type : Literature");
            return 3;
        }
    }
    public int Calculate(int ID , int NoOfBook){
        int no = printBookType(ID);
        if(no==1){
            return 200*NoOfBook;
        }
        else if(no==2){
            return 300*NoOfBook;
        }
        else{
            return 450*NoOfBook;
        }
    }
}
