
public class InvalidCourseDataException extends Exception {
    public InvalidCourseDataException(String mes,Exception e){
       super(mes,e);
    }
    public InvalidCourseDataException(String message) {
        super(message);
    }
}