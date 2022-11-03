package chapters.chapter_09.Exercises.Exercises_09_09;

public class RegularPolygon {
     /* n defines the number of sides in the polygon
        side stores the length of the side
        x defines the x-coordinate of the polygon’s center
        y defines the y-coordinate of the polygon’s center
      */
    private int n;
    private double side;
    private double x;
    private double y;

     // no-arg constructor that creates a regular polygon with default values.
     public RegularPolygon() {
         this(3, 1, 0 , 0);
     }
     // constructor creates a regular polygon with the specified number of sides
     // and length of side, centered at (0, 0).
     public RegularPolygon(int n, double side) {
         this(n,side, 0 , 0);
     }
     //constructor creates a regular polygon with the specified number of sides,
     //length of side, and x- and y-coordinates.
     public RegularPolygon(int n, double side, double x, double y) {
         this.n = n;
         this.side = side;
         this.x = x;
         this.y = y;
     }
     //The accessor and mutator methods for all data fields.
     public int getN() {
         return this.n;
     }
     public void setN(int n) {
         this.n = n;
     }
     public double getSide() {
         return this.side;
     }
     public void setSide(double side) {
         this.side = side;
     }
     public double getX() {
         return this.x;
     }
     public void setX(double x) {
         this.x = x;
     }
     public double getY() {
         return this.y;
     }
     public void setY(double y) {
         this.y = y;
     }
     public double getPerimeter() {
         return n * side;
     }
     public double getArea() {
         return (n * side * side) / (4 * Math.tan(Math.PI / n));
     }
}
