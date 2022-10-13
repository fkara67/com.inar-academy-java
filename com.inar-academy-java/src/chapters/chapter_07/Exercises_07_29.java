package chapters.chapter_07;

public class Exercises_07_29 {
    /* 1- create a deck (int array size 52)
       2- initialize the deck
       3- shuffle deck
       4- pick 4 cards from deck
       5- compute sum of 4 cards
       6- find out how many picks are needed until we see
          sum of 24.
       7- display four cards
       8- display number of picks until we see the sum of 24
     */
    public static void main(String[] args) {
        int[] deck = new int[52];
        initialize(deck);
        shuffle(deck);

        int[] picks = new int[4];

        int numberOfPicks = keepNumberOfPicks(deck,picks);
        display(picks);
        System.out.println("Number of picks: " + numberOfPicks);
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
    public static int keepNumberOfPicks(int[] arr, int[] picks) {
        int numberOfPicks = 0;

        while (!isSum24(picks)) {
            numberOfPicks++;
            for (int i = 0; i < picks.length; i++) {
                picks[i] = (int)(Math.random() * arr.length);
            }
        }
        return numberOfPicks;
    }
    public static boolean isSum24(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] % 13 + 1;
        }
        if (sum != 24) {
            return false;
        }
        else return true;

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
