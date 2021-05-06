package midtermque4;
public class Food {
    String foodName;
    private int foodRating;
    private String foodTaste = "Sour";
    public Food(String foodName,int foodRt){
        this.foodName=foodName;
        foodRating=foodRt;
    }
    public void SetFoodTaste(String taste){
        foodTaste=taste;
    }
    public String GetFoodTaste(){
        return foodTaste;
    }
}
