package weeks.week_14;

public class Animal {
    protected double length;
    protected double weight;
    protected boolean canSwim;
    protected boolean canFly;

    public Animal() {
        this(0,0,false,false);
    }
    public Animal(double length, double weight, boolean canSwim, boolean canFly) {
        this.length = length;
        this.weight = weight;
        this.canSwim = canSwim;
        this.canFly = canFly;
    }
    final public void animalMethod() {
        System.out.println("This is the final method from animal class.");
    }
    @Override
    public String toString() {
        return String.format("Weight: %s\nLength: %s\nHasFlyingSkill: %s\nHasSwimmingSkill: %s\n",
                            weight, length, canFly, canSwim);
    }
    public void runs() {
        System.out.println("Animal is running.");
    }
    public void eats() {
        System.out.println("Animal is eating.");
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

    public boolean getCanSwim() {
        return canSwim;
    }

    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }

    public boolean getCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
}
