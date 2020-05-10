import java.util.InputMismatchException;

public class PersonTest {
    public static void main(String[] args) {

        try {
            Person person = PersonFactory.createPerson();
            System.out.println(person);
        } catch (IncorrectAgeException | NameUndefinedException e) {
            System.err.println(e.getMessage());
        }catch (InputMismatchException e){
            System.err.println("Błędnie podane dane, proszę spróbować ponownie.");
        }


    }
}


