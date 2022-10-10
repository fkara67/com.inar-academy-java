package chapters.chapter_07;

public class ProcessingArrays {
    public static void main(String[] args) {
        final int LENGTH_OF_ARRAY = 100;
        double[] myList = new double[LENGTH_OF_ARRAY];
        initializeArrayWithInput(myList);
        initializeArrayWithRandom(myList);
        displayArray(myList);

        double total = findSumOfElementsOfArray(myList);
        System.out.printf("Total is %4.1f", total);

        System.out.println();

        double max = findTheLargestElementOfArray(myList);
        System.out.printf("Max is %4.1f", max);
        int smallestIndexOfMax = findSmallestIndexOfLargestElement(myList);
        System.out.println("\nSmallest index of max is " + smallestIndexOfMax);
        randomShuffleArray(myList);
        displayArray(myList);
        shiftElementsOfArrayLeft(myList);
        System.out.println("----------------------------------------------------------------------");
        displayArray(myList);

    }

    public static double findTheLargestElementOfArray(double[] arr) {
        /*5. Finding the largest element: Use a variable named max to store the largest element.
        Initially max is arr[0]. To find the largest element in the array arr, compare
        each element with max, and update max if the element is greater than max.
        */
        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        return max;
    }

    public static double findSumOfElementsOfArray(double[] arr) {
        /*4. Summing all elements: Use a variable named total to store the sum. Initially total
        is 0. Add each element in the array to total using a loop like this:
         */
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];

        }
        return total;
    }

    public static void displayArray(double[] arr) {
        /* 3. Displaying arrays: To print an array, you have to print each element in the array using a
           loop like the following:
         */
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%6.1f ",arr[i]);
            if ((i + 1) % 10 == 0)
                System.out.println();
        }
    }

    public static void initializeArrayWithRandom(double[] arr) {
        /* 2. Initializing arrays with random values: The following loop initializes the array arr
           with random values between 0.0 and 100.0, but less than 100.0.
         */
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random() * 100;
        }
    }

    public static void initializeArrayWithInput(double[] arr) {
        /* 1. Initializing arrays with input values: The following loop initializes the array arr
        with user input values.
         */
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter " + arr.length + " values: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextDouble();
        }

    }
    public static int findSmallestIndexOfLargestElement(double[] arr) {
        // 6.Finding the smallest index of the largest element:
        double max = arr[0];
        int indexOfMax = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                indexOfMax = i;
            }

        }
        return indexOfMax;
    }
    public static void randomShuffleArray(double[] arr) {
        /*  7. Random shuffling: In many applications, you need to randomly reorder the elements
            in an array. This is called shuffling. To accomplish this, for each element myList[i],
            randomly generate an index j and swap myList[i] with myList[j], as follows:
        */
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = (int)(Math.random() * arr.length);

            double temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
    }
    public static void shiftElementsOfArrayLeft(double[] arr) {
        /*  8. Shifting elements: Sometimes you need to shift the elements left or right. Here is an
            example of shifting the elements one position to the left and filling the last element with
            the first element:
         */
        double temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;

    }

}
