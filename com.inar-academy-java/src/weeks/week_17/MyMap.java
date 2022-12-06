package weeks.week_17;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MyMap {
    public static void main(String[] args) {
        Map<Integer,Integer> m = new HashMap<>();
        m.put(10, 25);
        m.put(1,40);
        m.put(2, 50);
        m.put(1, 60);
        m.put(3, 60);

        String resume = "tarik yaklasik 5 yildir Amazonda calisiyorum Java ile su projeyi yaptim" +
                "sonra yine java kullanarak su projede yer aldim " +
                "Selenium Java ve TestNG dersleri vererek Inar Academy" +
                " ogerencilerinin ise girmesinde yardimci olmaya calistim Testing benim için güzel";

        Set<String> jobDescriptionKeys = new HashSet<>();
        jobDescriptionKeys.add("selenium");
        jobDescriptionKeys.add("java");
        jobDescriptionKeys.add("testing");

        findTheKeys(resume, jobDescriptionKeys);
    }
    public static void findTheKeys(String resume, Set<String> desKeys) {
        Map<String, Integer> map = new HashMap<>();
        String[] resumeArr = resume.split("\\s");

        for (String word : resumeArr) {
            if (desKeys.contains(word.toLowerCase())) {
                if (map.containsKey(word.toLowerCase())) {
                    int number = map.get(word);
                    map.put(word, number + 1);
                }
                else map.put(word, 1);
            }
        }
        print(map);
    }
    public static void print(Map<String, Integer> map) {
        Set<String> set = map.keySet();

        for (String key : set) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}
