package InputRequester;

import java.util.Scanner;

public class InputRequester {

    Scanner input = new Scanner(System.in);

    public int requestInt(String a) {
        System.out.print(a);
        return input.nextInt();
    }

    public double requestDouble(String a) {
        System.out.print(a);
        return input.nextDouble();
    }

    public float requestFloat(String a) {
        System.out.print(a);
        return input.nextFloat();
    }

    public boolean requestBoolean(String a) {
        System.out.print(a);
        return input.nextBoolean();
    }

    public char requestChar(String a) {
        System.out.print(a);
        return (input.nextLine().charAt(0));
    }

    public long requestLong(String a) {
        System.out.print(a);
        return input.nextLong();
    }

    public String requestString(String a) {
        System.out.print(a);
        return input.nextLine();
    }
    public int requestInt( ) {
        return input.nextInt();
    }

    public double requestDouble() {
        return input.nextDouble();
    }

    public float requestFloat() {
        return input.nextFloat();
    }

    public boolean requestBoolean() {
        return input.nextBoolean();
    }

    public char requestChar() {
        return (input.nextLine().charAt(0));
    }

    public long requestLong() {
        return input.nextLong();
    }

    public String requestString() {
        return input.nextLine();
    }
}
