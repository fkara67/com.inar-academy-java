package weeks.week_15;

public class Number {
    private double value;

    public Number(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
    public String toString() {
        return value + "";
    }
}
