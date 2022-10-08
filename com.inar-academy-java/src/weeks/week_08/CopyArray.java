package weeks.week_08;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] a = new int[5];
        fillTheArrWithRandomValues(a);
        System.out.println("Before: " + Arrays.toString(a));
        int length = 8;
        a = extendArray(a,length);
        System.out.println("Later: " + Arrays.toString(a));

    }
    public static void fillTheArrWithRandomValues(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int random = (int)(Math.random()*100);
            arr[i] = random;
        }
    }
    public static int[] extendArray(int[] arr, int length) {
        int[] arr2 = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        arr = arr2;
        return arr;
    }
}
