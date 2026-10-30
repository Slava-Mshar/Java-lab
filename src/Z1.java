
import java.util.ArrayList;
import java.util.List;

public class Z1 {
    public static Course findCourse(List<Course> courses, String name) throws CourseNotFoundException {
        for (Course c : courses) {
            if (c.getName().equals(name)) {
                return c;
            }
        }
        throw new CourseNotFoundException("Курс '" + name + "' не найден");
    }

    public static void main(String[] args) {
        List<Course> courses = new ArrayList<>();

        try {
            courses.add(new Course("Java", "Иванов", 40, 1000, 2));
            courses.add(new Course("Python", "Петров", -10, 1500, 5));
        } catch (InvalidCourseDataException e) {
            System.out.println("Ошибка при создании: " + e.getMessage());
        }

        try {
            Course javaCourse = findCourse(courses, "Java");
            javaCourse.enroll("Алексей");
            javaCourse.enroll("Мария");
            System.out.println("Запись прошла успешно.");

            javaCourse.enroll("Иван");
        } catch (CourseNotFoundException | EnrollmentException e) {
            System.out.println("Ошибка работы с курсом: " + e.getMessage());
        }

        try {
            Course cPlusPlus = findCourse(courses, "C++");
        } catch (CourseNotFoundException e) {
            System.out.println("Ошибка поиска: " + e.getMessage());
        } finally {
            System.out.println("Работа системы завершена.");
        }
    }
}