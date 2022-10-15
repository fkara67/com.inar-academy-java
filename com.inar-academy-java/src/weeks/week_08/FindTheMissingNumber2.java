package weeks.week_08;

import java.util.Scanner;

public class FindTheMissingNumber2 {
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
        int sum = getSumOfAllTheNumbers(arr);
        int max = min + arr.length;
        int maxSum = max * (max + 1) / 2;
        int minSum = min * (min - 1) / 2;
        int result = maxSum - minSum - sum;
        return result;
    }
    public static int getSumOfAllTheNumbers(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
