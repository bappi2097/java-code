package labtest2;
public class ReservationSystem {
    int firstClass=5,economyClass=5;
    final int totalSeat=10;
    public boolean firstClassAvail(int tNo){
        if(tNo<=firstClass){
            return true;
        }
        else
            return false;
    }
    public void getFirstClass(int tNo){
        firstClass-=tNo;
    }
    public boolean economyClassAvail(int tNo){
        if(tNo<=economyClass)
            return true;
        else
            return false;
    } 
    public void getEconomyClass(int tNo){
        economyClass-=tNo;
    }
    public void Display(){
        System.out.println("No Of First Class Seat : "+firstClass);
        System.out.println("No Of Economy Class Seat : "+economyClass);
    }
  /*  public void bookSeats(int s,String str){
        try{
        if(str.equalsIgnoreCase("First Class")){
            if(firstClass>s){
                firstClass-=s;
            }
            else if(economyClass>s && firstClass<s){
                System.out.println("All seat are booked in First class.");
                System.out.println("Economy class have "+economyClass+" Seats");
            }
            else{
                System.out.println("All seats are booked.Next flight leaves in 3 hours");
            }
        }
        else if(str.equalsIgnoreCase("Economy Class")){
            if(economyClass>s){
                economyClass-=s;
            }
            else if(economyClass==0 && firstClass>0){
                System.out.println("All seat are booked in Economy class.");
                System.out.println("First class have "+firstClass+" Seats");
            }
            else{
                System.out.println("All seats are booked.Next flight leaves in 3 hours");
            }
        }
        }catch(NullPointerException e){
            System.err.println(e);
        }
    }*/
}
