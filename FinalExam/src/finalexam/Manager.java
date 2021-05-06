package finalexam;

public class Manager {
  //  final int a;
    final int a=0;
    
    String ID,Name;
    final int Investment=50000;
    int TotalCost,TotalProfit;
    public Manager(String id,String n,int in,int cost,int profit){
        ID=id;
        Name=n;
        TotalCost=cost;
        TotalProfit=profit;
    }
    public void total_Cost_Calculation(int CementPrice,int BrickPrice){
        TotalCost=CementPrice+BrickPrice;
    }
    
}
