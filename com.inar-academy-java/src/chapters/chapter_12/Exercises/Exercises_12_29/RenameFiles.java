package chapters.chapter_12.Exercises.Exercises_12_29;

import java.io.File;

public class RenameFiles {
    public static void main(String[] args) {
        for (String fileName : args) {
            if (fileName.matches("Exercise\\d+_\\d")) {
                StringBuilder sb = new StringBuilder(fileName);
                sb.insert(sb.indexOf("_") + 1, "0");
                new File(fileName).renameTo(new File(sb.toString()));
            }
        }
    }
}
