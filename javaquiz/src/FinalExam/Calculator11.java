package FinalExam;
public class Calculator11 {
    public double div(double a,int b) throws ArithmeticException{
        try{
        return (a/b);
        }catch(ArithmeticException e){
            System.out.println(e);
            throw new ArithmeticException("What the hell");
            
        }
    }
}
