package weeks.week_14;

public class TestAnimalAndLion {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Lion lion = new Lion();
        lion.eats();

        /** 4 access modifiers
         *  - private -> only visible to the same class
         *  -         ->(default)(package private) is only visible to the same package
         *  -protected-> visible to packege + to child classes
         *  - public ->  visible to everyone
         */

        lion.animalMethod();
        System.out.println(lion);

        Lion lion2 = new Lion(8);
        System.out.println("-----------");
        System.out.println(lion2);

    }
}
