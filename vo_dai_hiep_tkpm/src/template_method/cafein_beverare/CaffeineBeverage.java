package template_method.cafein_beverare;

public abstract class CaffeineBeverage {
    public abstract void brew();
    public abstract void addCondiment();
    public void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiment();
    }
    public void boilWater(){
        System.out.println("Đun sôi nước ở 100 độ C");
    }
    public void pourInCup(){
        System.out.println("Rót thức uống ra cốc");
    }
}
