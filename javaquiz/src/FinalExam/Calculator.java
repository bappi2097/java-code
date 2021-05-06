package FinalExam;
public class Calculator {
    public double div(double a,int b){
        try{
        return (double) (a/b);
        }catch(ArithmeticException e){
            System.err.println(e);
            return 0;
        }
    }
}
