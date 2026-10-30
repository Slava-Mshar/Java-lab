package Z2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main2 {
    public static void printCourses(List<Course> courses, int rating) {
        for (Course c : courses) {
            if (c.getRating() == rating) {
                System.out.println(c.getTitle() + " (Рейтинг: " + c.getRating() + ")");
            }
        }
    }

    public static void main(String[] args) {
        List<Course> courses = new ArrayList<>();

        courses.add(new Course(1, "Java", "IT", 3, Arrays.asList(2, 3, 2)));
        courses.add(new Course(2, "Spring", "IT", 5, Arrays.asList(5, 4, 5)));
        courses.add(new Course(3, "Math", "Science", 3, Arrays.asList(4, 5, 4)));
        courses.add(new Course(4, "History", "Humanities", 2, Arrays.asList(2, 2, 1)));
        courses.add(new Course(5, "SQL", "IT", 5, Arrays.asList(5, 5, 4)));

        courses.removeIf(c -> c.getAverageRating() < 3);

        for (Course c : courses) {
            if (c.getAverageRating() >= 4 && c.getRating()!=5) {
                c.setRating(c.getRating() + 1);
            }
        }

        System.out.println("Курсы с рейтингом 5 ");
        printCourses(courses, 6);

        courses.sort(Comparator.comparingDouble(Course::getAverageRating).reversed());

        System.out.println("Сортировка ");
        for (Course c : courses) {
            System.out.println("ID " + c.getId() + "  " + c.getTitle() + "  Средний балл " + c.getAverageRating());
        }
    }
}