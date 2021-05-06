package universitymanagementsystem2;
import java.util.Scanner;
public class Course {
    private Scanner input = null;
    private String CourseCode;
    private String CourseTitle;
    private int CourseCredit;
    private int EnrolledStudent=0;
    protected Course(){
        input=new Scanner(System.in);
    }
    protected void input_All(){
        System.out.println("Enter Course Code : ");
        CourseCode=input.nextLine();
        System.out.println("Enter Course TItle : ");
        CourseTitle=input.nextLine();
        System.out.println("Enter Course Credit : ");
        CourseCredit=input.nextInt();
        EnrolledStudent++;
    }
    protected String get_CourseCode(){
        return CourseCode;
    }
    protected String get_CourseTitle(){
        return CourseTitle;
    }
    protected int get_CourseCredit(){
        return CourseCredit;
    }
    protected int get_EnrolledStudent(){
        return EnrolledStudent;
    }
    protected void print_All(){
        System.out.println("Course Code : "+get_CourseCode());
        System.out.println("Course Title : "+get_CourseTitle());
        System.out.println("Course Credit : "+get_CourseCredit());
        System.out.println("No Of Enrolled Student : "+get_EnrolledStudent());
    }
}
