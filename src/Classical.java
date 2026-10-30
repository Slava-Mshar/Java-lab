
public class Classical extends Music {
    private boolean orchestra;

    public Classical(String title, int id, int duration, boolean orchestra) {
        super(title, id, duration);
        this.orchestra = orchestra;
    }

    @Override
    public String toString() {
        return super.toString() + ", Оркестр: " + orchestra;
    }
}