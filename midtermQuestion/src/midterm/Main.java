package midterm;
public class Main {
    public static void main(String[] args) {
        Student std1 = new Student("ABC","172-35-2097","Dhanmondi");
        Student std2 = std1;
        String name=std2.GetName();
        String Address = std2.GetAddress();
        System.out.println(name);
        System.out.println(Address);
    }
    
}
