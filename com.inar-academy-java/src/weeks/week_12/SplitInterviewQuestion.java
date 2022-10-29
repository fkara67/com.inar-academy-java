package weeks.week_12;

import java.util.Arrays;

public class SplitInterviewQuestion {
    /**
     * Code review - Peer review
     * @paran args
     */

    public static void main(String[] args) {
        String s1 = "Tarik: I am java an instructor java at Inar Academy javajava";
        String[] arr = s1.split("java");
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
        System.out.println(s1.substring(s1.length() - 4));
        System.out.println("the count of java is " +
                ((s1.substring(s1.length() - 4)).equals("java") ? arr.length : arr.length - 1));

    }
}
