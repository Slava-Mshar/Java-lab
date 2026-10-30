
public class Rock extends Music {
    private boolean guitarSolo;

    public Rock(String title, int id, int duration, boolean guitarSolo) {
        super(title, id, duration);
        this.guitarSolo = guitarSolo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Соло: " + guitarSolo;
    }
}