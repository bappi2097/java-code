package Exception;

public class CheckAge extends Exception {
    public void Age(int age)throws Exception{
        if(age<18){
            throw new Exception("Your Age Is Under 18!!");
        }
    }
}
