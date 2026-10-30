public class Z1 {
    public static void main(String[] args) {
        Soup s1 = new Soup("Борщ", 300, 42, "Свекла, мясо, капуста");
        Soup s2 = new Soup("Куриный", 250, 42, "Курица, лапша");

        Pasta p1 = new Pasta("Карбонара", 200, 10, "Спагетти");
        Pasta p2 = new Pasta("Болоньезе", 250, 10, "Ракушки");
        Pasta p3 = new Pasta("Сырная", 150, 10, "Рожки");

        Meal[] menu = {s1, s2, p1, p2, p3};

        for (int i = 0; i < menu.length; i++) {
            menu[i].displayInfo();
            menu[i].cook();
            System.out.println("Калорийность: " + menu[i].getCaloriesPer100g() + " ккал/100г\n");
        }
    }
}
