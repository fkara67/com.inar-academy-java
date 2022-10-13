package chapters.chapter_07;

public class Exercises_07_24 {
    /* 1- create a deck (int array size 52)
       2- initialize the deck
       3- shuffle deck
       4- pick 4 cards from deck
       5- find out how many picks are needed before you see
          one of each suit.
       6- display pick of one of each suit
       7- display number picks until you see one of each suit.
     */

    public static void main(String[] args) {
        int[] deck = new int[52];
        initialize(deck);
        shuffle(deck);

        int[] picks = new int[4];
        int numberOfPicks = keepCountOfPicks(deck, picks);
        display(picks);
        System.out.println("The number of picks until we see one of each suit: " + numberOfPicks);
    }
    public static void initialize(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
    }
    public static void shuffle(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = (int)(Math.random() * arr.length);

            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
    }
    public static int keepCountOfPicks(int[] arr, int[] picks) {
        int countOfPicks = 0;

        while (!hasOneEachSuit(picks)) {
            countOfPicks++;
            for (int i = 0; i < picks.length; i++) {
                picks[i] = (int)(Math.random() * arr.length);
            }
        }
        return countOfPicks;
    }
    public static boolean hasOneEachSuit(int[] picks) {
        for (int i = 0; i < picks.length - 1; i++) {
            for (int j = i + 1; j < picks.length; j++) {

                int suit1 = picks[i] / 13;
                int suit2 = picks[j] / 13;

                if (suit1 == suit2) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void display(int[] picks) {
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        for (int pick : picks) {
            int suitIndex = pick / 13;
            int rankIndex = pick % 13;
            System.out.println(ranks[rankIndex] + " of " + suits[suitIndex]);
        }
    }
}
