package chapters.chapter_09.Exercises.Exercises_09_09;

public class TestRegularPolygon {
    /*  Write a test program that creates three RegularPolygon objects,
       created using the no-arg constructor, using RegularPolygon(6, 4),
       and using RegularPolygon(10, 4, 5.6, 7.8).
       For each object, display its perimeter and area.
     */
    public static void main(String[] args) {
        RegularPolygon p1 = new RegularPolygon();
        RegularPolygon p2 = new RegularPolygon(6, 4);
        RegularPolygon p3 = new RegularPolygon(10, 4, 5.6, 7.8);

        RegularPolygon[] polygons = {p1,p2,p3};

        System.out.print("\t Perimeter\t\tArea");
        System.out.println("\n\t---------------------");

        for (int i = 0; i < polygons.length; i++) {
            System.out.print("p");
            System.out.printf("%d%10.3f%13.3f\n", i + 1,polygons[i].getPerimeter(), polygons[i].getArea());
        }
    }
}
