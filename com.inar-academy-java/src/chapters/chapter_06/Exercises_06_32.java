package chapters.chapter_06;

public class Exercises_06_32 {
    public static void main(String[] args) {
        int count = 0;
        int win = 0;
        while (count < 10000) {
            win = playCrasp(win);
            count++;
        }
        System.out.println("win is " + win);
    }
    public static int playCrasp(int win2) {
        int dice1 = (int)(Math.random() * 6) + 1;
        int dice2 = (int)(Math.random() * 6) + 1;
        int sum = dice1 + dice2;
        System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + (dice1 + dice2));

        if (sum == 2 || sum == 3 || sum == 12) {
            System.out.println("You lose!");
        }
        else if (sum == 7 || sum == 11) {
            System.out.println("You win!");
            win2++;
        }
        else if (sum == 4 || sum == 5 || sum == 6 || sum == 8 || sum == 9 || sum == 10) {
            System.out.println("The point is " + sum);
            while (sum != 7)  {
                dice1 = (int)(Math.random() * 6) + 1;
                dice2 = (int)(Math.random() * 6) + 1;
                System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + (dice1 + dice2));
                if (dice1 + dice2 == 7) {
                    System.out.println("You lose!");
                    break;
                }
                else if (dice1 + dice2 == sum) {
                    System.out.println("You win!");
                    win2++;
                    break;
                }
            }
        }
        return win2;
    }
}
