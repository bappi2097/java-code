package exceptionhandle;
public class SalesMan {
    String ID,Name;
    double Salary,MonthlySalary;
    public SalesMan(String id , String n , double s){
        ID = id;
        Name = n;
        Salary = s;
    }
    public double Monthlysalary(){
        MonthlySalary = 30 * Salary;
        return MonthlySalary;
    }
    public void Bonus(double p){
        if(p/30 > 100){
            MonthlySalary+=500;
        }
    }
    public void PrintInfo(){
        System.out.print("ID : "+ID+"\nName : "+Name);
        System.out.print("\nSalary : "+MonthlySalary);
    }
}
