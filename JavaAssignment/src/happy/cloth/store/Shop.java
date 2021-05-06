package happy.cloth.store;
public class Shop {
    double noTshirt,noJacket,discount,profit,tax,total;
    public void calculation(double t,double j){
        noTshirt=t;
        noJacket=j;
        total=noTshirt*500+noJacket*800;
        
        if(total>3000){
            discount=total*0.05;
            total-=discount;
            profit=noTshirt*100+noJacket*200;
            profit-=profit*.05;
        }
        else{           
            profit=noTshirt*100+noJacket*200;
        }
        tax=total*.04;
    }
    public void printInfo(){
        System.out.println("\nShop Name : Happy Coloth Store \nLocation : Dhanmondi");
        System.out.print("Registration No : SHOP321 \nPay : "+(total+tax)+"\nProfit : "+profit);
        System.out.print("\nDiscount : "+discount+"\nWithout Tax : "+total);
    }
}
