package javalab2;
public class studentinfo {
    String Id;
    String Name;
    String Department;
    float Cgpa = 0;
    double payment = 0.0;
    public void info(String i,String n,String d,float c , double p){
        Id = i;
        Name = n;
        Department = d;
        Cgpa = c;
        payment = p;
    }
    public void paymentSubmit(double d){
        payment += d;
    }
    public void cgpa(float f , float s , float t){
        Cgpa = (f+s+t)/3;
    }
    public void showInfo(){
        System.out.print("\nID: "+Id+"\nName: "+Name+"\nDepartment: "+Department);
        System.out.print("\nCgpa: "+Cgpa+"\nPayment: "+payment);
    }
            
    
}
