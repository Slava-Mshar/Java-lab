
public class Z1 {
    public static void main(String[] args) {
        Table t1 = new Table("Кухонный", "Дерево", 4);
        Table t2 = new Table("Журнальный", "Стекло", 4);
        Table t3 = new Table("Компьютерный", "Металл", 2);

        Chair c1 = new Chair("Офисный", "Пластик", true);
        Chair c2 = new Chair("Табурет", "Дерево", false);

        Usable[] furniture = {t1, t2, t3, c1, c2};

        for (int i = 0; i < furniture.length; i++) {
            Assemblable item = (Assemblable) furniture[i];

            item.assemble();
            furniture[i].use();
            System.out.println("Назначение: " + furniture[i].getPurpose() + "\n");
        }
    }
}