package arraystring;

public class String2 {
    public static void main(String[] args) {
        String s1="sakib";
        String s2="SAKIB";
        String s3="sakib";
        boolean f = s1.equals(s2);
        System.out.println(f);
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.compareTo(s3));

        System.out.println(s2.toLowerCase());
        System.out.println(s1.toUpperCase());
    }
}
