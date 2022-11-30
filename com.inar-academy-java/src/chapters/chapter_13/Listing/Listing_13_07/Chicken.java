package chapters.chapter_13.Listing.Listing_13_07;

public class Chicken extends Animal implements Edible {

    @Override
    public String sound() {
        return "Chicken: cock-a-doodle-doo";
    }

    @Override
    public String howToEat() {
        return "Chicken: Fry it";
    }
}
