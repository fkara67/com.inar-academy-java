package chapters.chapter_05;

public class Listing_05_07 {
    public static void main(String[] args) {
        System.out.println("            Multiplication Table");
        System.out.print("     ");
        for (int i = 1; i < 10; i++) {

            System.out.print("     " + i);
        }
        System.out.print("\n-----------------------------------------------------------\n");
        for (int i = 1; i < 10; i++) {
            System.out.print(i + "  | ");
            for (int j = 1; j < 10; j++) {
                System.out.printf("%6d",i * j);
            }
            System.out.println();
        }




    }
}
