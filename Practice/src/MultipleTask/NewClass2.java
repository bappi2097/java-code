package MultipleTask;
import InputRequester.InputRequester;
public class NewClass2 {
    public static void main(String[] args) {
        InputRequester in = new InputRequester();
        String[] a = new String[5];
        for (int i =0;i<a.length;i++) {
            a[i]=in.requestString("Enter A String of Index "+i+" : ");
            
        }
    }

}
