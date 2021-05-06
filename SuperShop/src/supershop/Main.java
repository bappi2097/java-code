package supershop;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter No Of Customer : ");
        int noOfCustomer=input.nextInt();
        Customer cust[] = new Customer[noOfCustomer];
        for (int i = 0; i < noOfCustomer; i++) {
            cust[i]=new Customer();
            cust[i].input_All();
        }
        Employee empl = new Employee();
        System.out.println("Enter Employee Info : ");
        empl.input_All();
        System.out.print("Enter No Of Product : ");
        int noOfProduct=input.nextInt();
        Product pro[] = new Product[noOfProduct];
        for (int i = 0; i < noOfProduct; i++) {
            pro[i]=new Product();
            pro[i].input_All();
        }
        while(true){
            System.out.print("Enter Customer ID : ");
            input.nextLine();
            String id=input.nextLine();
            int custIndex=0;
            for(int i=0;i<noOfCustomer;i++){
                if(cust[i].get_ID().equalsIgnoreCase(id)){
                    custIndex=i;
                    break;
                }
            }
            while(true){
                System.out.print("Enter Product ID : ");
                String proID=input.nextLine();
                int proIndex=0;
                for(int i=0;i<noOfProduct;i++){
                    if(pro[i].get_ID().equalsIgnoreCase(proID)){
                        proIndex=i;
                    }
                }
                pro[proIndex].input_SaleQuantity();
                if(pro[proIndex].IsProductAvailable()){
                    pro[proIndex].calculate_Quantity();
                    cust[custIndex].calculate_TotalPurchase(pro[proIndex].get_SaleQuantity(),pro[proIndex].get_SalePrice());
                }
                System.out.print("Do You Want To Buy More (true/fale): ");
                if(!input.nextBoolean())break;
                input.nextLine();
            }
            cust[custIndex].Calculate_Discount();
            cust[custIndex].calculate_TotalPoint();
            cust[custIndex].print_All();
            System.out.println("Do you have another Customer (true/false): ");
            if(!input.nextBoolean())break;
        }
    }
}
