package accessmodifier1;

public class B extends A {
    public static final int a=3;
    public B(){
        msg();
    }
    protected void msg(){
        System.out.println("Hellow World !");
    }
}
