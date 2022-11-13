package weeks.week_14;

public class Fruit extends Plants {
    private boolean hasSeed;
    private boolean juicy;

    public Fruit() {
        this(false, false);
        super.eatable = true;
    }

    public Fruit(boolean hasSeed, boolean juicy) {
        this("",false,true,"",false,false);
    }

    public Fruit(String name, boolean hasLeaves, boolean eatable, String color, boolean hasSeed, boolean juicy) {
        super(name, hasLeaves, eatable, color);
        this.hasSeed = hasSeed;
        this.juicy = juicy;
    }
    @Override
    public void hasBeenSow() {
        System.out.println("This fruit has been sow.");
    }
    @Override
    public String toString() {
        return "This fruit is " + (isJuicy() ? "" : "not ") + "juicy";
    }

    public boolean isHasSeed() {
        return hasSeed;
    }

    public void setHasSeed(boolean hasSeed) {
        this.hasSeed = hasSeed;
    }

    public boolean isJuicy() {
        return juicy;
    }

    public void setJuicy(boolean juicy) {
        this.juicy = juicy;
    }
}
