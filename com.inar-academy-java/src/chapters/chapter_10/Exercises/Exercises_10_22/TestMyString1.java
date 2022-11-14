package chapters.chapter_10.Exercises.Exercises_10_22;

public class TestMyString1 {
    public static void main(String[] args) {
        char[] arr = {'F', 'A', 'T', 'I', 'H'};
        MyString1 mS = new MyString1(arr);
        System.out.println("mS.charAt(3) " +  mS.charAt(3));
        System.out.println("length " + mS.length());
        MyString1 mS2 = mS.substring(2, mS.length());
        System.out.println(mS2);
        MyString1 mS3 = mS.toLowerCase();
        System.out.println("is mS equal mS2? " + mS.equals(mS2));

        System.out.println(MyString1.valueOf(257));
    }
}
