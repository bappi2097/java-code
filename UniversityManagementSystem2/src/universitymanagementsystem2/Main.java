package universitymanagementsystem2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter No Of Course : ");
        int NoOfCourse = input.nextInt();
        System.out.println("Enter No Of Student : ");
        int NoOfStudent = input.nextInt();
        System.out.println("Enter No Of Teacher : ");
        int NoOfTeacher = input.nextInt();
        Course [] course = new Course[NoOfCourse];
        for(int i=0;i<NoOfCourse;i++){
            course[i]=new Course();
            course[i].input_All();
        }
        Teacher [] teacher = new Teacher[NoOfTeacher];
        for(int i=0;i<NoOfTeacher;i++){
            teacher[i]=new Teacher();
            teacher[i].input_AllInfo();
            teacher[i].input_EmployeeAll();
        }
        for(int i=0;i<NoOfCourse;i++){
            course[i]=new Course();
            course[i].input_All();
        }
    }
}
