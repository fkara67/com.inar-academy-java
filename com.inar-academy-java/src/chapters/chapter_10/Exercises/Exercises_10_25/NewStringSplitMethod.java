package chapters.chapter_10.Exercises.Exercises_10_25;

import java.util.ArrayList;
import java.util.Arrays;

public class NewStringSplitMethod {
    public static void main(String[] args) {
        String s = "Ali@!ata@!bak";
        String[] sp = split(s, "@!");
        System.out.println(Arrays.toString(sp));
    }
    public static String[] split(String s, String regex) {
        ArrayList<String> a = new ArrayList<>();

        for (int i = 0; i < s.length() - 1; i++) {
            String control = s.substring(i, i + 1);
            if (!control.equals(regex.substring(0,1))) {
                a.add(control);
            }
            else {
                a.add(regex);
                i++;
            }
        }
        String[] result = new String[a.size()];

        a.toArray(result);
        return result;
    }
}
