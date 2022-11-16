package chapters.chapter_11.Listing;

public class SimpleGeometricObject {
    private String color;
    private boolean filled;
    private java.util.Date dateCreated;

    public SimpleGeometricObject() {
        this("white", false);
    }
    public SimpleGeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }
    public String toString() {
        return "created on " + dateCreated + "\nColor: " + color + " and isFilled: " + filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }
}
