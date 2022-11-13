package weeks.week_14;

public class Lion extends Animal {
    private int tailSize;

    public Lion() {
        super();
        super.canSwim = true;
        this.tailSize = 5;
    }
    public Lion(int tailSize) {
        super(75, 100, true, false);
        this.tailSize = tailSize;
    }
    @Override
    public String toString() {
        return "Lion{ tailSize = " + tailSize + " }";
    }
    @Override
    public void eats() {
        System.out.println("Lion is eating.");
    }
    /*
    Final methods cannot be overriden
    @Overriden
    public void animalMethods() {
    }
     */
    public int getTailSize() {
        return tailSize;
    }
    public void setTailSize(int tailSize) {
        this.tailSize = tailSize;
    }

}
