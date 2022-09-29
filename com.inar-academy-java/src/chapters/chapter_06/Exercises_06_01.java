package chapters.chapter_06;

public class Exercises_06_01 {
    public static void main(String[] args) {

        final int PENTAGONALS_PER_LINE = 10;
        int pentagonalCount = 0;
        for (int i = 1; i <= 100; i++) {
            pentagonalCount++;
            System.out.printf("%-6d ",getPentagonalNumber(i));
            if (pentagonalCount % PENTAGONALS_PER_LINE == 0)
                System.out.println();
        }

    }
    public static int getPentagonalNumber(int n) {
        int pentagonalNumber = n * (3 * n - 1) / 2;
        return pentagonalNumber;


    }
}
