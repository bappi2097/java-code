package javalab4;
public class JavaLab4 {
    public static void main(String[] args) {
        try{
            int a[]=new int[3];
            a[4]=30/2;
            System.out.println("First print statement in try");
        }
        catch(ArithmeticException e){
            System.out.println(""+e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(""+e);
        }
        catch(Exception e){
            System.out.println(""+e.toString());
        }
        System.out.println("Out of try-catch block..");
    }
    
}
