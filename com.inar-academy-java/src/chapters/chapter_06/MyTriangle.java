package chapters.chapter_06;

public class MyTriangle {
    public static boolean isValid(double side1, double side2, double side3) {
        if ((side1 < side2 + side3 && side1 > Math.abs(side2 - side3)) &&
                (side2 < side1 + side3 && side2 > Math.abs(side1 - side3)) &&
                (side3 < side2 + side1 && side3 > Math.abs(side2 - side1))) {
            return true;
        }
        else
        return false;
    }
    public static double area(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }
}
