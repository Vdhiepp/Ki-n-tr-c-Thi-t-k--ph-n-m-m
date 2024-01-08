package template_method.cafein_beverare;

public class MainCaffeineBeverage {
    public static void main(String[] args) {
        CaffeineBeverage tea = new Tea();
        tea.prepareRecipe();
    }
}
