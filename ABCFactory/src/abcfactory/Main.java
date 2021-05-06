package abcfactory;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter No Of Registered Client : ");
        int NoOfRegClient=input.nextInt();
        RegisteredClient [] reg=new RegisteredClient[NoOfRegClient];
        Order [][] orderR = new Order[NoOfRegClient][10];
        for(int i=0;i<NoOfRegClient;i++){
            reg[i]=new RegisteredClient();
            reg[i].input_All();
            System.out.println("Enter No Of Order You Want To Make (Order<10): ");
            int NoOfOrder=input.nextInt();
            for(int j=0;j<NoOfOrder;j++){
                orderR[i][j]=new Order();
                orderR[i][j].input_OrderID();
                orderR[i][j].input_Amount();
                orderR[i][j].set_ClientID(reg[i].get_ID());
                if(orderR[i][j].cheack_Amount())orderR[i][j].calculate_Bill();
                else continue;
                reg[i].set_OrderAmout(orderR[i][j].get_amount());
                reg[i].set_Bill(orderR[i][j].get_Bill());
            }
        }
        Supervisor obj = new Supervisor(NoOfRegClient);
        
        System.out.println(".......For 10% Discount.......");
        for(int i=0;i<NoOfRegClient;i++){
            if(obj.check_OrderOfRegisteredClient(reg[i].get_OrderAmount())){
                System.out.println("ID : "+reg[i].get_ID()+"  Eligible.");
                reg[i].calculate_Bill();
            }
            else{
                System.out.println("ID : "+reg[i].get_ID()+"  Not-Eligible.");
            }
        }
        System.out.println("Enter no Of Non-Registered Client");
        int NoOfNonReg=input.nextInt();
        Person [] Non_reg=new Person[NoOfNonReg];
        Order [][] orderN = new Order[NoOfNonReg][10];
        for(int i=0;i<NoOfNonReg;i++){
            Non_reg[i]=new Person();
            Non_reg[i].input_ID();
            Non_reg[i].input_Name();
            System.out.println("Enter No Of Order : ");
            int NoOfOrder = input.nextInt();
            Non_reg[i].set_NoOfOrder(NoOfOrder);
            for(int j=0;j<NoOfOrder;j++){
                orderN[i][j]=new Order();
                orderN[i][j].input_OrderID();
                orderN[i][j].input_Amount();
                orderN[i][j].set_ClientID(Non_reg[i].get_ID());
                if(orderN[i][j].cheack_Amount())orderN[i][j].calculate_Bill();
                
            }
        }
        for(int i=0;i<NoOfRegClient;i++){
            reg[i].print_All();
        }
        for(int i=0;i<NoOfNonReg;i++){
            double totalBill=0;
            for(int j=0;j<Non_reg[i].get_NoOfOrder();j++){
                totalBill+=orderN[i][j].get_Bill();
            }
            Non_reg[i].print_ID();
            Non_reg[i].print_Name();
            System.out.println("Total Bill : "+totalBill);
        }
    }
    
}
