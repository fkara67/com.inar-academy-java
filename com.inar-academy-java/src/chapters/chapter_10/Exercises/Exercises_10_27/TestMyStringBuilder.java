package chapters.chapter_10.Exercises.Exercises_10_27;

public class TestMyStringBuilder {
    public static void main(String[] args) {
        MyStringBuilder mSB1 = new MyStringBuilder("Inar Academy");
        String s1 = mSB1.toString();
        System.out.println(s1);

        String student = "kara";
        MyStringBuilder mSB2 = new MyStringBuilder(student);

        mSB1.append(mSB2);
        System.out.println("mSB1: " + mSB1);
        System.out.println("mSB2: " + mSB2);

        mSB1.append(5276);
        System.out.println("mSB1: " + mSB1);

        System.out.println("mSB1 length: " + mSB1.length());
        System.out.println("mSB1.charAt(5): " + mSB1.charAt(5));

        System.out.println("mSB1.toLowerCase(): " + mSB1.toLowerCase());
        System.out.println("After mSB1.toLowerCase() mSB1 is: " + mSB1);

        System.out.println("mSB1: " + mSB1);
        MyStringBuilder mSB3 = mSB1.substring(0,15);
        System.out.println("After MyStringBuilder mSB3 = mSB1.substring(0,15)");
        System.out.println("mSB3: " + mSB3);
        System.out.println("mSB1: " + mSB1);

    }
}
