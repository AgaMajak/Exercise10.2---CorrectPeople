import java.util.Scanner;

public class PersonFactory {

    static public Person createPerson() throws NameUndefinedException, IncorrectAgeException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj imię:");
        String firstName = scan.nextLine();
        System.out.println("Podaj nazwisko:");
        String lastName = scan.nextLine();
        System.out.println("Podaj wiek:");
        int age = scan.nextInt();
        personCheck(firstName, lastName, age);
        System.out.println("Podaj PESEL:");
        long pesel = scan.nextLong();
        return new Person(firstName, lastName, age, pesel);
    }

    private static void personCheck(String firstName, String lastName, int age) throws NameUndefinedException, IncorrectAgeException {
        if (firstName == null || firstName.length() < 2 || lastName == null || lastName.length() < 2) {
            throw new NameUndefinedException();
        }
        if (age < 1) {
            throw new IncorrectAgeException();
        }
    }

}
