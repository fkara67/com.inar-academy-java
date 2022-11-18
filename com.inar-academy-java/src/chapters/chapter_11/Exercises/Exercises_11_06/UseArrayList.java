package chapters.chapter_11.Exercises.Exercises_11_06;

import chapters.chapter_10.Listing.Loan;
import javafx.scene.shape.Circle;

import java.util.ArrayList;
import java.util.Date;

public class UseArrayList {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();

        Loan loan = new Loan();
        Date date = new Date();
        String s = "Ismail";
        Circle circle = new Circle();

        list.add(loan);
        list.add(date);
        list.add(s);
        list.add(circle);

        for (Object o : list) {
            System.out.println(o.toString());
        }
    }
}
