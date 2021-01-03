import model.Bug;
import model.BugReporter;
import model.User;

import java.util.*;

public class MainApp {

    public static void main(String[] args) {

        List<Bug> bugList = new ArrayList();

        BugReporter janusz = new BugReporter("janusz", "januszewski", "januesz@zjanuszewa.pl");
        BugReporter teresa = new BugReporter("teresa", "teresińska", "teresa@zjanuszewa.pl");

        bugList.add(new Bug("To jest pierwszy błąd, bardzo ważny", janusz, 2));
        bugList.add(new Bug("To jest pierwszy błąd, bardzo ważny", janusz, 2));
        bugList.add(new Bug("Najmniej ważne jest by nie umieć sortować", janusz, 4));
        bugList.add(new Bug("Sortowanie jest najważniejsze", teresa, 1));
        bugList.add(new Bug("Unikalne błędy są ważne", teresa, 25));
        bugList.add(new Bug("Superważne sortowanie", janusz, 0));

        System.out.println("--- Lista ---");
        for (Bug bug : bugList) {
            System.out.println(bug.getDescription());
        }
        System.out.println();

        System.out.println("--- Unikalna Lista ---");
        Set<Bug> uniqueBugs = new HashSet(bugList);
        for (Bug bug : uniqueBugs) {
            System.out.println(bug.getDescription());
        }
        System.out.println();

        System.out.println("--- Posortowana unikalna Lista ---");
        Set<Bug> sortedUniqueBugs = new TreeSet(uniqueBugs);
        for (Bug bug : sortedUniqueBugs) {
            System.out.println(bug.getDescription());
        }
    }
}