package employee;
public class Employee {
    String employeeID,employeeName,designation;
    double monthlySalary;
    double yearlySalary;
    double bonus;
    public Employee(String ID,String name,String d){
        employeeID=ID;
        employeeName=name;
        designation=d;
    }
    public void Salary(String d){
        if(d.equals("Project Manager")){
            bonus=50000*.12;
            monthlySalary=50000+bonus;
        }
        else if(d.equals("Developer")){
            bonus=30000*.10;
            monthlySalary=30000+bonus;
        }
        yearlySalary=monthlySalary*12;
    }
    public void display(){
        System.out.print("\nEmployee ID : "+employeeID+"\nEmployee Name : "+employeeName);
        System.out.print("\nDesignation : "+designation+"\nMonthly Salary : "+monthlySalary);
        System.out.print("\nYearly Salary : "+yearlySalary+"\nBonus : "+bonus);
        System.out.println("");
    }
}
