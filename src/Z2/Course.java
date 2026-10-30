package Z2;

import java.util.List;

public class Course {
    private int id;
    private String title;
    private String category;
    private int rating;
    private List<Integer> studentRatings;

    public Course(int id, String title, String category, int rating, List<Integer> studentRatings) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.rating = rating;
        this.studentRatings = studentRatings;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public double getAverageRating() {
        if (studentRatings.isEmpty()) return 0;
        double sum = 0;
        for (int r : studentRatings) {
            sum += r;
        }
        return sum / studentRatings.size();
    }
}
