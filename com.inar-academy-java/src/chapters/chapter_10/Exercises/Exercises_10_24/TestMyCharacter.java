package chapters.chapter_10.Exercises.Exercises_10_24;

public class TestMyCharacter {
    public static void main(String[] args) {
        MyCharacter c = new MyCharacter('a');
        MyCharacter x = new MyCharacter('Z');
        MyCharacter q = new MyCharacter('7');

        System.out.println("isLetter('a') -> " + MyCharacter.isLetter('a'));
        System.out.println("isDigit('Z') -> " + MyCharacter.isDigit('Z'));
        System.out.println("isDigit('7') -> " + MyCharacter.isDigit('7'));
        System.out.println("isLetter('7') -> " + MyCharacter.isLetter('7') + "\n");

        System.out.println("isUpperCase('a') -> " + MyCharacter.isUpperCase('a'));
        System.out.println("isUpperCase('Z') -> " + MyCharacter.isUpperCase('Z'));
        System.out.println("isUpperCase('7') -> " + MyCharacter.isUpperCase('7') + "\n");

        System.out.println("isLowerCase('a') -> " + MyCharacter.isLowerCase('a'));
        System.out.println("isLowerCase('Z') -> " + MyCharacter.isLowerCase('Z'));
        System.out.println("isLowerCase('7') -> " + MyCharacter.isLowerCase('7') + "\n");

        System.out.println("toUpperCase('E') -> " + MyCharacter.toUpperCase('E'));
        System.out.println("toLowerCase('E') -> " + MyCharacter.toLowerCase('E'));
        System.out.println("toUpperCase('r') -> " + MyCharacter.toUpperCase('r'));
        System.out.println("toLowerCase('b') -> " + MyCharacter.toLowerCase('b'));
        System.out.println("toLowerCase('2') -> " + MyCharacter.toLowerCase('2'));
        System.out.println("toUpperCase('2') -> " + MyCharacter.toUpperCase('2'));




    }
}
