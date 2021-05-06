package employee;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Employee Name : ");
        String name = input.nextLine();
        System.out.print("Enter Employee ID : ");
        String ID = input.nextLine();
        System.out.print("Enter Employee Designation : ");
        String d = input.nextLine();
        Employee obj = new Employee(ID, name, d);
        obj.Salary(d);
        obj.display();
    }
}
