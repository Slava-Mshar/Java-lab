
public class Music {
    private String title;
    private int id;
    private int duration;

    public Music(String title, int id, int duration) {
        this.title = title;
        this.id = id;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Длительность: " + duration;
    }
}