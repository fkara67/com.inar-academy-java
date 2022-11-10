package chapters.chapter_10.Exercises.Exercises_10_04;

public class TestMyPoint {
    public static void main(String[] args) {

        MyPoint point1 = new MyPoint();

        MyPoint point2 = new MyPoint(10, 30.5);

        System.out.printf("point1.distance(point2): %.3f", point1.distance(point2));
    }
}
