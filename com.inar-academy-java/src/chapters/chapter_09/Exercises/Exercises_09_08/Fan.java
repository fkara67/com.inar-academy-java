package chapters.chapter_09.Exercises.Exercises_09_08;
/* (The Fan class) Design a class named Fan to represent a fan. The class contains:
 ■ Three constants named SLOW, MEDIUM, and FAST with the values 1, 2, and 3 to
   denote the fan speed.
 ■ A private int data field named speed that specifies the speed of the fan (the
   default is SLOW).
 ■ A private boolean data field named on that specifies whether the fan is on (the
   default is false).
 ■ A private double data field named radius that specifies the radius of the fan
   (the default is 5).
 ■ A string data field named color that specifies the color of the fan (the default
   is blue).
 ■ The accessor and mutator methods for all four data fields.
 ■ A no-arg constructor that creates a default fan.
 ■ A method named toString() that returns a string description for the fan. If
   the fan is on, the method returns the fan speed, color, and radius in one combined string.
   If the fan is not on, the method returns the fan color and radius
   along with the string “fan is off” in one combined string.
  */
public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public  static final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    public String color;

    public Fan() {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        if (speed <= FAST && speed >= SLOW) {
            this.speed = speed;
        }
    }
    public boolean isOn() {
        return on;
    }
    public void turnOn() {
        on = true;
    }
    public void turnOff() {
        on = false;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        //returns the fan speed, color, and radius in one combined string.
        if (isOn()) {
           return "Fan Speed: " + getSpeed() + "\nFun Color: " + getColor() + "\nFan Radius: " + getRadius();
        }
        //returns the fan color and radius
        //along with the string “fan is off” in one combined string.
        else {
            return  "Fan is off" + "\nFun Color: " + getColor() + "\nFan Radius: " + getRadius();
        }
    }
}
