package Exception;

public class UnderAgeException extends Exception{
    String e;
    public UnderAgeException(String e){
        this.e=e;
    }
    public String getMsg(){
        return e;
    }
}
