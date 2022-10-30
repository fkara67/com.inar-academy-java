package weeks.week_12;

public class TestCircle1 {
    public static void main(String[] args) {
        Circle1 c1 = new Circle1();
        c1.print();

        Circle1 c2 = new Circle1(5);
        c2.print();

        c2.fillTheCircle();
        c2.setColor("BLUE");
        c2.print();
    }
}
