package electricitycostmodelingapplication;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter No Of PowerPlant : ");
        int NoOfPowerPlant = input.nextInt();
        PowerPlant []pobj =new PowerPlant[NoOfPowerPlant];
        for(int i=0;i<NoOfPowerPlant;i++){
            pobj[i]=new PowerPlant();
            pobj[i].input_All();
        }
        System.out.println("Enter No Of Consumer : ");
        int NoOfConsumer = input.nextInt();
        Consumer [] cobj=new Consumer[NoOfConsumer];
        for(int i=0;i<NoOfConsumer;i++){
            cobj[i]=new Consumer();
            cobj[i].input_All();
            cobj[i].input_AllInfo();
            for(int j=0;j<NoOfPowerPlant;j++){
                if(pobj[j].get_Location().equalsIgnoreCase(cobj[i].get_Location())){
                    cobj[i].set_PowerPlantName(pobj[j].get_Name());
                    cobj[i].set_SalePrice(pobj[j].get_SalePriceKW());
                    pobj[j].calculate_TotalNoOfConsumer();
                }
            }
            cobj[i].calculate_BillWithTax();
            cobj[i].calculate_BillWithServiceCharge();
            cobj[i].calculate_BillWithDiscount();
            
            for(int j=0;j<NoOfPowerPlant;j++){
                if(pobj[j].get_Name().equalsIgnoreCase(cobj[i].get_PowerPlantName())){
                    pobj[j].calculate_Profit(cobj[i].get_MonthlyUsedKW());
                }
            }
        }
        System.out.println("Enter No Of Employee : ");
        int NoOfEmployee=input.nextInt();
        Employee [] eobj = new Employee[NoOfEmployee];
        for(int i=0;i<NoOfEmployee;i++){
            eobj[i]=new Employee();
            eobj[i].input_All();
            eobj[i].input_PowerPlantName();
            for(int j=0;j<NoOfConsumer;j++){
                if(eobj[i].get_PowerPlantName().equalsIgnoreCase(cobj[j].get_PowerPlantName())){
                    eobj[i].calculate_TotalCollectedBill(cobj[j].get_Bill());
                }
            }
        }
        System.out.println(".......Power Plant.......");
        for(int i=0;i<NoOfPowerPlant;i++)pobj[i].print_All();
        System.out.println(".......Consumer.........");
        for(int i=0;i<NoOfConsumer;i++)cobj[i].Print_AllInfo();
        System.out.println("........Employee........");
        for(int i=0;i<NoOfEmployee;i++)eobj[i].print_AllInfo();
    }
    
}