package chapters.chapter_11.Listing;

public class PolymorphismDemo {
    public static void main(String[] args) {

        // Display circle and rectangle properties

        display(new CircleFromSimpleGeometricObject(1, "red", false));
        display(new RectangleFromSimpleGeometricObject(1,1, "black", true));
    }
    public static void display(SimpleGeometricObject object) {
        System.out.println("Created on " + object.getDateCreated() + ". Color is " + object.getColor());
    }
}
