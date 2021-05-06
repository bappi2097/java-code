package javafinallabtest;
public class Customer {
    String ID,Name;
    double totalBill=0.0;
    double totalCost=0.0,seminarCost=0.0,workShopCost=0.0;
    public Customer(String id,String n,double totalbill){
        ID=id;
        Name=n;
        totalBill=totalbill;
    }
    public void totalCost_Seminar(int p){
        if(p>=10 && p<=100){
            seminarCost=p*200;
            totalCost+=seminarCost;
        }
        else if(p>100)
            System.out.println("Participants must be below than 100");
        else
            System.out.println("Wrong Choice");
    }
    public void totalCost_Workshop(int p,int d){
        if(p==20 && d<6){
            workShopCost=d*300;
            totalCost+=workShopCost;
        }
        else
            System.out.println("Wrong Choice");
    }
    public void Display(){
        System.out.println("ID : "+ID);
        System.out.println("Name : "+Name);
        System.out.println("Total Bill : "+totalBill);
        System.out.println("Seminar Cost : "+seminarCost);
        System.out.println("Workshop Cost : "+workShopCost);
        System.out.println("Total Cost : "+totalCost);
    }
}