package arraystring;

public class String1 {
    public static void main(String[] args) {
        String ss = "DIU SOFTF";
        int a=ss.lastIndexOf("F");
        System.out.println(a);
        boolean f= ss.contains("D");
        System.out.println(f);
        String n=ss.substring(0,1);
        System.out.println(n);
    }
}
