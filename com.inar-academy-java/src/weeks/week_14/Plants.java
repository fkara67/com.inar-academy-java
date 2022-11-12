package weeks.week_14;

public class Plants {
    protected String name;
    protected boolean hasLeaves;
    protected boolean eatable;
    protected String color;

    public Plants() {
        this("",true,false,"green");
    }

    public Plants(String name, boolean hasLeaves, boolean eatable, String color) {
        this.name = name;
        this.hasLeaves = hasLeaves;
        this.eatable = eatable;
        this.color = color;
    }
    public final void hasBeenCut() {
        System.out.println("This plant has been cut.");
    }
    public void hasBeenSow() {
        System.out.println("This plant has been sow.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasLeaves() {
        return hasLeaves;
    }

    public void setHasLeaves(boolean hasLeaves) {
        this.hasLeaves = hasLeaves;
    }

    public boolean isEatable() {
        return eatable;
    }

    public void setEatable(boolean eatable) {
        this.eatable = eatable;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
