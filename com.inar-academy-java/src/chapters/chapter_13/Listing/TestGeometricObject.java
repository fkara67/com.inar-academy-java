package chapters.chapter_13.Listing;

public class TestGeometricObject {
    public static void main(String[] args) {

        GeometricObject geoObj1 = new Circle(5);
        GeometricObject geoObj2 = new Rectangle(5, 3);

        System.out.println("The two objects have the same area? " + equalArea(geoObj1, geoObj2));

        // Display circle
        displayGeometricObject(geoObj1);

        // Display rectangle
        displayGeometricObject(geoObj2);
    }

    public static boolean equalArea(GeometricObject object1, GeometricObject object2) {
        return object1.getArea() == object2.getArea();
    }

    public static void displayGeometricObject(GeometricObject object) {
        System.out.println("\nThe area is " + object.getArea());
        System.out.println("The perimeter is " + object.getPerimeter());
    }
}
