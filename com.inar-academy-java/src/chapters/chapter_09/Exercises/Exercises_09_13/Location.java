package chapters.chapter_09.Exercises.Exercises_09_13;

public class Location {
    public int row;
    public int column;
    public double maxValue;


    public Location() {
    }
    public static Location locateLargest(double[][] a) {
        double maxValue = Double.MIN_VALUE;
        int MaxRow = -1;
        int MaxCol = -1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (maxValue < a[i][j]) {
                    maxValue = a[i][j];
                    MaxRow = i;
                    MaxCol = j;
                }
            }
        }
        Location max = new Location();
        max.row = MaxRow;
        max.column = MaxCol;
        max.maxValue = maxValue;

        return max;
    }



}
