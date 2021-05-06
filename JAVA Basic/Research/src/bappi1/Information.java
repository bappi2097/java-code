package bappi1;
public class Information {
    private String Name , ID;
    static int  count = 1;
    private double Grade ;
    public Information(String n , String id){
        Name = n;
        ID = id;
        count++;
    }
    public void Grade(double f , double s , double t){
        Grade+=Cal(f);
        Grade+=Cal(s);
        Grade+=Cal(t);
        Grade/=3;
    }
    private double Cal(double c){
        double cal=0;
        if(c>79 ){
            cal = 4.00;
        }
        else if(c>69 && c < 80){
            cal = 3.50;
        }
        else if(c>59 && c<70){
            cal = 3.00;
        }
        else{
            cal = 0.00;
        }
        return cal;
    }
    void PrintInfo(){
        System.out.println("Name : "+Name+"\nID : "+ID);
        System.out.print("\nGrade :"+Grade+"\nCount : "+count+"\n");
    }
}
