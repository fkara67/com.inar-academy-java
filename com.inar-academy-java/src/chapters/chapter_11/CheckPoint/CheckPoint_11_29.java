package chapters.chapter_11.CheckPoint;

public class CheckPoint_11_29 {
    public static void main(String[] args) {
        //Object circle1 = new Circle1();
        //Object circle2 = new Circle1();
        //System.out.println(circle1.equals(circle2));

        Object circle1 = new Circle2();
        Object circle2 = new Circle2();
        System.out.println(circle1.equals(circle2));
    }
}
class Circle1 {
    double radius;

    public boolean equals(Circle1 circle) {
        return this.radius == circle.radius;
    }
}
class Circle2 {
    double radius;

    public boolean equals(Object circle) {
        return this.radius == ((Circle2)circle).radius;
    }
}
