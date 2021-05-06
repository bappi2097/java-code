package midtermque4;
public class Main {
    public static void main(String[] args) {
        Food f1=new Food("Burger",10);
        Food f2=new Food("Pizza",8);
        Food f3;
        f3=f2;
        f3.SetFoodTaste("spicy");
        System.out.println(f1.GetFoodTaste());
        System.out.println(f2.GetFoodTaste());
    }
}
