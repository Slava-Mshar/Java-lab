
public class Z1 {
    public static void main(String[] args) {
        Food pizza = new Pizza("Маргарита", 800, 500);
        Food soup = new Soup("Борщ", 300, 400);

        pizza.cook();
        pizza.cook(15);
        pizza.cook("Запекание");


        System.out.println(pizza.getName() + "  " + pizza.getTaste());
        System.out.println(soup.getName() + "  " + soup.getTaste());
    }
}