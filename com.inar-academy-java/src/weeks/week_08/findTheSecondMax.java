package weeks.week_08;

public class findTheSecondMax {
    public static void main(String[] args) {
        int[] arr = new int[10];
        fillTheArrWithRandomValues(arr);
        displayArray(arr);
        System.out.print(getTheSecondMaxElement(arr));
    }
    public static void fillTheArrWithRandomValues(int[] arr) {
        for (int a: arr) {
            a = (int)(Math.random() * 100);
        }
    }
    public static void displayArray(int[] arr) {
        for (int a: arr) {
            System.out.print(a + " ");
        }
    }
    public static int getTheMaxElement(int[] arr) {
        int max = arr[0];
        for (int a:arr) {
            if (max < a) {
                max = a;
            }
        }
        return max;
    }
    public static int getTheSecondMaxElement(int[] arr) {
        int max = getTheMaxElement(arr);
        int secondMax = -1;
        for (int a: arr) {
            if (secondMax < a && a != max) {
                secondMax = a;
            }
        }
        return secondMax;

    }

}

