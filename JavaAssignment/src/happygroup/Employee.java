package happygroup;
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
    public void MonthlySalary(String d){
        if(d.equals("Manager")){
            monthlySalary=20000;
        }
        else if(d.equals("Staff")){
            monthlySalary=10000;
        }
    }
    public void yearlySalary(){
        yearlySalary=monthlySalary*12;
    }
    public void calculateBonus(String d){
        if(d.equals("Manager")){
            bonus=20000*0.20;
        }
        else if(d.equals("Staff")){
            bonus=10000*0.05;
        }
    }
    public void display(){
        System.out.print("\nEmployee ID : "+employeeID+"\nEmployee Name : "+employeeName);
        System.out.print("\nDesignation : "+designation+"\nMonthly Salary : "+monthlySalary);
        System.out.print("\nYearly Salary : "+yearlySalary+"\nBonus : "+bonus);
        System.out.println("");
    }
}
