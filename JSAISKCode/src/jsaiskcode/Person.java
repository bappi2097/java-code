package jsaiskcode;
public abstract class Person {
    private String Name,ID,Address,Phone;
    private String Password;
    private int Age;
    protected void set_Name(String n){
        Name=n;
    }
    protected void set_ID(String id){
        ID=id;
    }
    protected void set_Addres(String a){
        Address= a;
    }
    protected void set_Phone(String p){
        Phone=p;
    }
    protected void set_Age(int ag){
        Age=ag;
    }
    protected String get_Name(){
        return Name;
    }
    protected void set_Password(String n){
        Password=n;
    }
    protected String get_Password(){
        return Password;
    }
    protected String get_Address(){
        return Address;
    }
    protected String get_Phone(){
        return Phone;
    }
    protected String get_ID(){
        return ID;
    }
    protected int get_Age(){
        return Age;
    }
    protected abstract void save_Info();
}
