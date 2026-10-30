
public class Soup extends Food {
    public Soup(String name, int calories, double weight) {
        super(name, calories, weight);
    }

    @Override
    public String getTaste() {
        return "Вкусный суп";
    }

    public void cooking() {
        System.out.println("Готовлю такой суп");
    }

    public void cooking(String met) {
        System.out.println("Готовлю борщ" + met);
    }
}