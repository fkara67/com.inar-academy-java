package weeks.week_07;

import java.util.Scanner;

public class FindTheMissingNumber1 {
    /**
     * Size verilen sayi degerlerinde eksik olan bir sayiyi bulunuz.
     * 4
     * 86 84 82 83  -> 85
     *
     * 97 96 94 93 -> 95
     *
     * 1 5 7 6 8 2 9 4 -> 3
     * 1 2 3 4
     *  - En kucuk Sayi
     *  - Tek tek arttirarak array de var mi diye baktim olmayani buldum
     *
     * 1 2 3 4-> Fark etmez ister 0 ister 5
     * 5 * 6 / 2 = 15  -  10 = 5
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Please enter the size of the array you want to work with.");
        Scanner input = new Scanner(System.in);
        int arrSize = input.nextInt();
        int[] arr = new int[arrSize];
        getNumbersFromUsers(arr);
        int min = getMinNumber(arr);
        int result = findTheMissingNumber(arr, min);

        System.out.println("The missing number is --> " + result);

    }
    public static void getNumbersFromUsers(int[] arr) {
        System.out.printf("Please enter %d integers: \n", arr.length);
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
    }
    public static int getMinNumber(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            min = min < num ? min : num;
        }
        return min;
    }
    public static int findTheMissingNumber(int[] arr, int min) {
        int num = min;
        while (num <= min + arr.length) {
            boolean isFound = false;
            for (int i = 0; i < arr.length; i++) {
                if (num == arr[i]) {
                    isFound = true;
                    break;
                }
            }
            if (isFound)
                num++;
            else
                return num;
        }
        return num;
    }
}
