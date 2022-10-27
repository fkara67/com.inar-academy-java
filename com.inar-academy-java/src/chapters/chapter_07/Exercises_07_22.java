package chapters.chapter_07;
import java.util.Arrays;
public class Exercises_07_22 {
    public static void main(String[] args) {
        int[] chessTable = new int[8];
        int row = 0;
        int count = 0;

        while (row < chessTable.length) {
            count++;
            if (isThereAPlaceToPutQueen(chessTable, row)) {
                putQueen(chessTable, row);
                row++;
            } else {
                row = 0;
            }
        }
        display(chessTable, count);
    }

    public static boolean isThereAPlaceToPutQueen(int[] chessTable, int row) {
        boolean[] checkChessTable = new boolean[8];
        Arrays.fill(checkChessTable, true);

        for (int i = 0; i < row; i++) {
            checkChessTable[chessTable[i]] = false;
            if ((chessTable[i] + row - i) < 8) {
                checkChessTable[row - i + chessTable[i]] = false;
            }
            if ((chessTable[i] - (row - i)) > 0) {
                checkChessTable[chessTable[i] - (row - i)] = false;
            }
        }
        for (int i = 0; i < checkChessTable.length; i++) {
            if (checkChessTable[i]) {
                return true;
            }
        }
        return false;
    }

    public static void putQueen(int[] chessTable, int row) {
        int queensPlace;
        while (true) {
            queensPlace = (int) (Math.random() * 8);
            if (isThisPlaceAvailable(chessTable, queensPlace, row)) {
                break;
            }
        }
        chessTable[row] = queensPlace;
    }

    public static boolean isThisPlaceAvailable(int[] chessTable, int queensPlace, int row) {
        boolean[] isSuitable = new boolean[8];
        Arrays.fill(isSuitable, true);

        for (int i = 0; i < row; i++) {
            isSuitable[chessTable[i]] = false;
            if ((row - i + chessTable[i]) < 8) {
                isSuitable[row - i + chessTable[i]] = false;
            }
            if (chessTable[i] - (row - i) > 0) {
                isSuitable[chessTable[i] - (row - i)] = false;
            }
        }
        return isSuitable[queensPlace];
    }

    public static void display(int[] chessTable, int count) {
        System.out.println("It takes " + count + " times");

        for (int i = 0; i < chessTable.length; i++) {
            System.out.print("|");
            for (int j = 0; j < chessTable[i]; j++) {
                System.out.print(" |");
            }
            System.out.print("Q| ");

            for (int j = chessTable[i] + 1; j < chessTable.length; j++) {
                System.out.print("| ");
            }
            System.out.println();
        }
    }
}

