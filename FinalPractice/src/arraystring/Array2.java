package arraystring;

public class Array2 {
    public static void main(String[] args){
        String a = "DIU SOFTF";
        int b=a.lastIndexOf("IU");
        System.out.println(b+"\n");
        boolean c = a.contains("D");
        System.out.println(c+"\n");
        System.out.println(a.indexOf("FT")+"\n");
        String s1="My Name Is Khan",s2="my Name Is Khan";
        c=s1.equalsIgnoreCase(s2);
        System.out.println(c+"\n");
        System.out.println(s1.toUpperCase());
        System.out.println(s2.compareTo(s1));
    }
}
