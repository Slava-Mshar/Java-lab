
public class Chair implements Assemblable, Usable {
    private String name;
    private String material;
    private boolean backrest;

    public Chair(String name, String material, boolean backrest) {
        this.name = name;
        this.material = material;
        this.backrest = backrest;
    }

    public void assemble() {
        System.out.println("Стул '" + name + "' собран.");
    }

    public void disassemble() {
        System.out.println("Стул '" + name + "' разобран.");
    }

    public void use() {
        System.out.println("Сидим на стуле '" + name + "'.");
    }

    public String getPurpose() {
        return "Место для сидения";
    }
}