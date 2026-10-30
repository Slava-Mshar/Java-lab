
import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private String teacher;
    private int duration;
    private double price;
    private int maxStudents;
    private List<String> enrolledStudents;

    public Course(String name, String teacher, int duration, double price, int maxStudents) throws InvalidCourseDataException {
        if (duration <= 0 || price < 0) {
            throw new InvalidCourseDataException("Неверные данные для курса: " + name);
        }
        this.name = name;
        this.teacher = teacher;
        this.duration = duration;
        this.price = price;
        this.maxStudents = maxStudents;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enroll(String student) throws EnrollmentException {
        if (enrolledStudents.size() >= maxStudents) {
            throw new EnrollmentException("На курсе '" + name + "' нет мест для: " + student);
        }
        if (enrolledStudents.contains(student)) {
            throw new EnrollmentException("Студент " + student + " уже записан на '" + name + "'");
        }
        enrolledStudents.add(student);
    }

    public void cancelEnrollment(String student) throws EnrollmentException {
        if (!enrolledStudents.contains(student)) {
            throw new EnrollmentException("Студент " + student + " не найден на курсе '" + name + "'");
        }
        enrolledStudents.remove(student);
    }
}