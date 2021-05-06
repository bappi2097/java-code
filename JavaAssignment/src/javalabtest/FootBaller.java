package javalabtest;
public class FootBaller {
    String name;
    int age;
    String Country;
    int noGoals,noOffside,noMatch;
    public void info(String n,int a,String c,int g,int o,int m){
        name=n;
        age=a;
        Country=c;
        noGoals=g;
        noOffside=o;
        noMatch=m;
    }
    public void increaseGoal(int go){
        noGoals=noGoals+go;
    }
    public void increaseOffside(int of){
        noOffside=noOffside+of;
    }
    public void increaseMatch(int mat){
        noMatch=noMatch+mat;
    }
    public void printInfo(){
        System.out.print("\nName : "+name+"\nAge : "+age);
        System.out.print("\nCountry : "+Country+"\nNumber Of Goals : "+noGoals);
        System.out.print("\nNumber Of Offside : "+noOffside+"\nNumber Of Match : "+noMatch);
    }
}
