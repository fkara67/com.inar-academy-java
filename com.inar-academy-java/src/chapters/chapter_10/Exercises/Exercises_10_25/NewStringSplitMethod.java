package chapters.chapter_10.Exercises.Exercises_10_25;

import java.util.Arrays;

public class NewStringSplitMethod {
    public static void main(String[] args) {
        String s = "Ali@!ata@!bak";

        String[] sp = split(s, "@!");
        int[][] lengthAndRegexIndexes = getNumberOfRegexAndOthers(s,"@!");
        for (int i = 0; i < lengthAndRegexIndexes.length; i++) {
            System.out.print(Arrays.toString(lengthAndRegexIndexes[i]));
            System.out.println();
        }
        System.out.println(Arrays.deepToString(getNumberOfRegexAndOthers(s, "@!")));

        System.out.print(Arrays.toString(sp));

    }
    public static String[] split(String s, String regex) {
        int[][] lengthAndRegexIndexes = getNumberOfRegexAndOthers(s,regex);
        int size = lengthAndRegexIndexes[0][0];
        String[] sp = new String[size];

        for (int i = 0, j = 0; i < sp.length; i++) {
            if (lengthAndRegexIndexes[1][0] != 0) {
                sp[i] = s.substring(i, lengthAndRegexIndexes[1][i]);
                i++;
            }
            sp[i] = s.substring(lengthAndRegexIndexes[1][j], lengthAndRegexIndexes[1][j] + regex.length());
            j++;
        }
        return sp;
    }
    public static int[][] getNumberOfRegexAndOthers(String s, String regex) {
        int regexCount = 0;
        int[][] lengthAndRegexIndexes = new int[2][s.length()];
        for (int i = 0, j = 0; i < s.length() - regex.length(); i++) {
            if (s.startsWith(regex, i)) {
                regexCount++;
                lengthAndRegexIndexes[1][j] = i;
                j++;
            }
        }
        int tipPointCount = 0;
        for (int i = 0; i < s.length(); i += regex.length()) {
            if (s.startsWith(regex, i)) {
                tipPointCount++;
            }
            else break;
        }
        for (int i = s.length() - regex.length(); i > 0 ; i -= regex.length()) {
            if (s.startsWith(regex, i)) {
                tipPointCount++;
            }
            else break;
        }
        lengthAndRegexIndexes[0][0] = 2 * regexCount - tipPointCount + 1;
        return lengthAndRegexIndexes;
    }
    public static boolean isRegex(String sub, String regex) {
        for (int i = 0; i < regex.length(); i++) {
            if (sub.charAt(i) != regex.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
