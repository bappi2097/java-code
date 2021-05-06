package research;
import java.util.Scanner;
public class Test01 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        long sum=0;
        System.out.print("Enter The String(Number) : ");
        String strNum = input.nextLine();
        for (int i = 0; i < strNum.length(); i++) {
            switch(strNum.charAt(i)){
                case '0':
                    sum = (sum*10)+0;
                    break;
                case '1':
                    sum = (sum*10)+1;
                    break;
                case '2':
                    sum = (sum*10)+2;
                    break;
                case '3':
                    sum = (sum*10)+3;
                    break;
                case '4':
                    sum = (sum*10)+4;
                    break;
                case '5':
                    sum = (sum*10)+5;
                    break;
                case '6':
                    sum = (sum*10)+6;
                    break;
                case '7':
                    sum = (sum*10)+7;
                    break;
                case '8':
                    sum = (sum*10)+8;
                    break;
                case '9':
                    sum = (sum*10)+9;
                    break;
                default :
                    break;
            }
        }
        System.out.print("The Number Is : "+sum+"\n");
    }    
}
