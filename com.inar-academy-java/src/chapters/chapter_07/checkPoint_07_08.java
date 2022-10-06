package chapters.chapter_07;

public class checkPoint_07_08 {
    public static void main(String[] args) {
        double[] arr = new double[10];
        arr[arr.length - 1] = 5.5;
        System.out.println(arr[0] + arr[1]);

        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of all arr elements is " + sum);
        double min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println("The minimum element of arr is " + min);

        int randonIndex = (int)(Math.random() * arr.length);
        System.out.println("The random index is " + randonIndex);
        System.out.println("The element of random index in the arr is " + arr[randonIndex]);

        double[] arr2 = {3.5, 5.5, 4.52, 5.6};

    }


}
