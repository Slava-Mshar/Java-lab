public class Soup extends Meal{
    private String ingredients;

    public Soup(String name, double weight, int cookingTime, String ingredients) {
        super(name, weight, cookingTime);
        this.ingredients = ingredients;
    }

    @Override
    public void cook() {
        System.out.println("Готовка:  варится 42 минуты");
    }

    @Override
    public int getCaloriesPer100g() {
        return 50;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Ингредиенты  " + ingredients);
    }
}
