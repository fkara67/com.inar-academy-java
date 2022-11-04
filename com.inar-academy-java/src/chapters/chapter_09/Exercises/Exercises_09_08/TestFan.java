package chapters.chapter_09.Exercises.Exercises_09_08;
 /* Write a test program that creates two Fan objects. Assign maximum speed,
    radius 10, color yellow, and turn it on to the first object. Assign medium speed,
    radius 5, color blue, and turn it off to the second object. Display the objects
    by invoking their toString method.
 */
public class TestFan {
     public static void main(String[] args) {
         Fan f1 = new Fan();
         f1.setSpeed(Fan.FAST);
         f1.setRadius(10);
         f1.setColor("yellow");
         f1.turnOn();

         Fan f2 = new Fan();
         f2.setSpeed(Fan.MEDIUM);
         f2.setRadius(5);
         f2.setColor("blue");
         f2.turnOff();

         System.out.println("f1: \n" + f1.toString());
         System.out.println("------------------");
         System.out.println("f2: \n" + f2.toString());
     }
}
