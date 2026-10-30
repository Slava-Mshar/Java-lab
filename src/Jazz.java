
public class Jazz extends Music {
    private boolean improvisation;

    public Jazz(String title, int id, int duration, boolean improvisation) {
        super(title, id, duration);
        this.improvisation = improvisation;
    }

    @Override
    public String toString() {
        return super.toString() + ", Импровизация: " + improvisation;
    }
}