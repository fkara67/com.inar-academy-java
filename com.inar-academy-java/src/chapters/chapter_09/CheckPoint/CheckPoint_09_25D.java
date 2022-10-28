package chapters.chapter_09.CheckPoint;

public class CheckPoint_09_25D {
    public static void main(String[] args) {
        K k1 = new K();
        K k2 = new K();
        System.out.println("k1's i = " + k1.i + " and j = " + k1.j);
        System.out.println("k2's i = " + k2.i + " and j = " + k2.j);
    }
}
class K {
    static int i = 0;
    int j = 0;

    K() {
        i++;
        j = 1;
    }
}
