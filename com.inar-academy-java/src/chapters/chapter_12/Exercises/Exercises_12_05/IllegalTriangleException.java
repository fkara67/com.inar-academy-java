package chapters.chapter_12.Exercises.Exercises_12_05;

public class IllegalTriangleException extends Exception {

    public IllegalTriangleException(String message) {
        super(message);
    }
    public IllegalTriangleException() {
        super("Invalid Triangle!");
    }
}
