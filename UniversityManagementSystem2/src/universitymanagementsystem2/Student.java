package universitymanagementsystem2;
import java.util.Scanner;
public class Student extends Person{
    private Scanner input=null;
    private Course[] EnrolledCourse=null;
    private int NoOfCourse=0;
    private static int Counter;
    protected Student(int n){
        super();
        input=new Scanner(System.in);
        NoOfCourse=n;
        Counter=0;
        EnrolledCourse=new Course[NoOfCourse];
    }
    protected void input_EnrolledCourse(Course c){
        EnrolledCourse[Counter]=c;
        Counter++;
    }
    protected void print_EnrolledCourse(){
        for (int i = 0; i < NoOfCourse; i++) {
            EnrolledCourse[i].print_All();
        }
    }
}
