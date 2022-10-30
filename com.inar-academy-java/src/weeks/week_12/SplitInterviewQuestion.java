package weeks.week_12;

public class SplitInterviewQuestion {
    /**
     * Code review - Peer review
     * @paran args
     */

    public static void main(String[] args) {
        findJavaInCV();
        deneme();

    }
    public static void deneme() {
        String s1 = " Tarik: I am java an instructor java at Inar Academy java";
        String[] arr = s1.split(" ");
        display(arr);
        System.out.println(arr.length);
    }
    public static void findJavaInCV() {
        String cv = "Fatih\n I have been studying at Inar Academy for about 3 months." +
                "I am learning Java for my career. I am good at Java";
        String[] arr = cv.trim().split("Java");
        display(arr);
        int count = arr.length;
        System.out.println(count);
    }
    public static void display(String[] arr) {
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
