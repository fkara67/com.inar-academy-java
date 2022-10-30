package weeks.week_12;

public class TestStudent {
    public static void main(String[] args) {
        Student haluk = new Student("Haluk", "Inar", 2634, "haluk@inar.com");
        haluk.print();
        haluk.setEmail("haluk@gmail.com");
        haluk.print();

        Student murat = new Student();
        murat.print();
        murat.setName("Murat");
        murat.setSurname("Inar");

        murat.print();

        murat.setId(4320);
        murat.setEmail("murat@inar.com");

        murat.print();

        int idOfMurat = murat.getId();
        System.out.println("Id of Murat: " + idOfMurat);
        System.out.println("Email of Murat: " + murat.getEmail());

        System.out.println("Student Number: " + Student.getStudentCounter());

        Student nurullah = new Student("Nurullah", "Inar", 5276, "nurullah@inar.com");
        System.out.println("Student Number: " + Student.getStudentCounter());

        Student tarik = new Student();
        System.out.println(tarik.defaultAccessModifier);
        System.out.println(tarik.protectedAccessModifier);
    }
}
