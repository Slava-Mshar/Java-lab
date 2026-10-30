
public class Food {
    private String name;
    private int calories;
    private double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Food(String name, int calories, double weight) {
        this.name = name;
        this.calories = calories;
        this.weight = weight;
    }

    public void cook() {
        System.out.println("Готовлю еду");
    }

    public void cook(int minutes) {
        System.out.println("Готовлю " + minutes + " минут");
    }

    public void cook(String method) {
        System.out.println("Готовлю методом " + method);
    }

    public String getTaste() {
        return "Нейтральный вкус";
    }
}