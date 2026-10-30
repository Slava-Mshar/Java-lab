
public class Pizza extends Food {
    public Pizza(String name, int calories, double weight) {
        super(name, calories, weight);
    }

    @Override
    public String getTaste() {
        return "Вкусная пицца";
    }
}