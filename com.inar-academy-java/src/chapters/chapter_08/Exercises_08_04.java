package chapters.chapter_08;

public class Exercises_08_04 {
    /* 1- store the work hours for eight employees in a two-dim array
       2- display employees and their total hours
        in decreasing order of the total hours.
     */
    public static void main(String[] args) {
        int[][] workHours = {
                {2,4,3,4,5,8,8},
                {7,3,4,3,3,4,4},
                {3,3,4,3,3,2,2},
                {9,3,4,7,3,4,1},
                {3,5,4,3,6,3,8},
                {3,4,4,6,3,4,4},
                {3,7,4,8,3,8,4},
                {6,3,5,9,2,7,9} };

        int[] sumsOfHours = new int[workHours.length];

        int[] employees = new int[workHours.length];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = i;
        }
        for (int i = 0; i < workHours.length; i++) {
            for (int j = 0; j < workHours[i].length; j++) {
                sumsOfHours[i] += workHours[i][j];
            }
        }
        displayEmployeesDecreasingOrder(sumsOfHours, employees);

    }
    public static void displayEmployeesDecreasingOrder(int[] sumOfHours, int[] employees) {
        sort(sumOfHours,employees);
        for (int i = 0; i < sumOfHours.length; i++) {
            System.out.println("Eployee " + (employees[i]  + 1) + "'s weekly total work hours is " + sumOfHours[i]);
        }
    }
    public static void sort(int[] sumOfHours, int[] employees) {
        for (int i = 0; i < sumOfHours.length - 1; i++) {
            for (int j = i + 1; j < sumOfHours.length; j++) {
                if (sumOfHours[j] > sumOfHours[i]) {
                    int temp1 = sumOfHours[i];
                    sumOfHours[i] = sumOfHours[j];
                    sumOfHours[j] = temp1;
                    int temp2 = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp2;
                }
            }
        }
    }
}
