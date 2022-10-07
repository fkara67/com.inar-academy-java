package chapters.chapter_07;

public class CheckPoint_07_13 {
    public static void main(String[] args) {
        int[] source = {3, 4, 5};
        int[] t = new int[3];
        System.arraycopy(source, 0, t, 0, source.length );
        for (int i = 0; i < t.length; i++) {
            System.out.println(t[i]);

        }




        //this example is check point 7.14
        //int[] myList;
        //myList = new int[10];
        // Sometime later you want to assign a new array to myList
        //myList = new int[20]; //this is a new array. So its memory is different from first one.
        //System.out.println(myList.length);
    }
}
