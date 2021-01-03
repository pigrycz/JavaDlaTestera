import model.Bug;
import model.BugReporter;

public class MainApp {

    public static void main(String[] args) {

        BugReporter janusz = new BugReporter("Janusz","Polak", "email@email.com");
        Bug bug = new Bug("To jest opis błędu", janusz, 5);

        System.out.println(bug.getStatus());
        bug.closeBug();
        bug.reopenBug();

        System.out.println(bug.toString());

        System.out.println(janusz.getBugCount());
    }
}