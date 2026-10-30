
public class Table implements Assemblable, Usable {
    private String name;
    private String material;
    private int legs;

    public Table(String name, String material, int legs) {
        this.name = name;
        this.material = material;
        this.legs = legs;
    }

    public void assemble() {
        System.out.println("Стол '" + name + "' собран.");
    }

    public void disassemble() {
        System.out.println("Стол '" + name + "' разобран.");
    }

    public void use() {
        System.out.println("Используем стол '" + name + "'.");
    }

    public String getPurpose() {
        return "Поверхность для работы или еды";
    }
}