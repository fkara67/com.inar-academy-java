package weeks.week_14;

public class Animal {
    private double length;
    private double weight;
    private boolean hasSwimmingSkills;
    private boolean hasFlyingSkills;

    public Animal() {
        this(0,0,false,false);
    }
    public Animal(double length, double weight, boolean canSwim, boolean canFly) {
        this.length = length;
        this.weight = weight;
        this.hasSwimmingSkills = canSwim;
        this.hasFlyingSkills = canFly;
    }
    public void eats() {

    }
    public void sleeps() {

    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isHasSwimmingSkills() {
        return hasFlyingSkills;
    }

    public void setHasSwimmingSkills(boolean hasSwimmingSkills) {
        this.hasSwimmingSkills = hasSwimmingSkills;
    }

    public boolean isHasFlyingSkills() {
        return hasFlyingSkills;
    }

    public void setHasFlyingSkills(boolean hasFlyingSkills) {
        this.hasFlyingSkills = hasFlyingSkills;
    }
}
