package chapters.chapter_07;

public class Listing_07_02 {
    public static void main(String[] args) {
        int[] deck = new int[52];
        String[] suits = {"Spade", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8",
                "9", "10", "Jack", "Queen", "King"};

        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
        for (int i = 0; i < deck.length; i++) {
            int randomIndex = (int)(Math.random() * deck.length);
            int temp = deck[i];
            deck[i]= deck[randomIndex];
            deck[randomIndex] = temp;
        }
        for (int i = 0; i < 4; i++) {
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            System.out.println("The card number " + deck[i] + ": " + rank + " of " + suit);
        }

    }
}
