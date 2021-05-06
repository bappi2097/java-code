package FinalExam;
public class Calculator1 {
    public double div(double a,int b) {
        if(b==0){
            throw new ArithmeticException("Wrong Input.B is ");
        }
        else{
            return (double) a/b;
        }
    }
}
