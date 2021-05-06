package abcfactoryv2.pkg0;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter No Of Registered Client : ");
        int NoOfClient=input.nextInt();
        Registerd [] reg ;
        reg=new Registerd[NoOfClient];
        Order [][] ord;
        ord=new Order[NoOfClient][10];
        for(int i=0;i<NoOfClient;i++){
            reg[i]=new Registerd();
            reg[i].input_AllInfo();
            int OrderAmount=0;
            double Bill=0;
            System.out.println("Enter No Of Order (Order<10): ");
            int NoOfOrder = input.nextInt();
            for(int j=0;j<NoOfOrder;j++){
                ord[i][j]=new Order();
                ord[i][j].input_All();
                ord[i][j].check_Confirmation();
                if(ord[i][j].get_Confirmation()){
                    ord[i][j].calculate_Bill();
                    ord[i][j].print_Bill();
                    OrderAmount+=ord[i][j].get_OrderAmount();
                    Bill+=ord[i][j].get_Bill();
                }
            }
            reg[i].set_NoOfOrder(NoOfOrder);
            reg[i].set_TotalBill(Bill);
            reg[i].set_TotalOrderAmount(OrderAmount);
        }
        Supervisor sup = new Supervisor();
        sup.input_AllInfo();
        for(int i=0;i<NoOfClient;i++){
            if(sup.check_Discount(reg[i].get_TotalOrderAmount())){
                reg[i].calculate_TotalBill();
            }
        }
        for(int i=0;i<NoOfClient;i++){
            reg[i].print_AllInfo();
            reg[i].print_TotalOrderAmount();
            reg[i].print_Eligible();
            reg[i].print_TotalBill();
        }
    }
    
}
