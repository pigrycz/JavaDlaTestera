import enums.Gender;
import enums.WeekDays;
import model.Bug;
import model.BugReporter;
import model.User;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;


public class MainApp {

    public static void main(String[] args) throws IOException {

//        try {
//            BufferedReader bufferedReader = new BufferedReader(new FileReader("test.txt"));
//
//            String line = bufferedReader.readLine();
//
//            while(line != null){
//                System.out.println(line);
//                line = bufferedReader.readLine();
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            System.out.println("Zakończono czytanie pliku");
//        }

//        BufferedReader bufferedReader = new BufferedReader(new FileReader("test1.txt"));
//                    String line = bufferedReader.readLine();
//
//            while(line != null) {
//                System.out.println(line);
//                line = bufferedReader.readLine();
//            }

//
//            Bug bug = new Bug("opis", new BugReporter("Imię", "nazwisko", "asd@asd.pl"), 1);
//        System.out.println(bug.getDescription());
//
//        bug = null;
//        try {
//            System.out.println(bug.getDescription());
//        } catch (NullPointerException exception) {
//            System.out.println("Błądddd");
//        }

//        List<String> names = new ArrayList<>();
//        names.add("Name");
//        names.add("Namem");
//        names.add("Nameemem");
//
//        names.stream()
//                .filter(s -> s.startsWith("A"))
//                .findFirst()
//                .orElseThrow(() -> new IllegalStateException("komunikat"));


        //ENUM
        User user = new User("a", "g", "c", 12, Gender.FEMALE);
        User user1 = new User("b", "h", "c", 12, Gender.MALE);
        User user2 = new User("b", "i", "c", 12, Gender.MALE);
        User user3 = new User("d", "j", "c", 12, Gender.FEMALE);
        User user4 = new User("e", "k", "c", 12, Gender.MALE);
        User user5 = new User("f", "l", "c", 12, Gender.FEMALE);

        List<User> users = new ArrayList<>();
        users.add(user);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);

        users.stream()
                .filter(u -> u.getGender() == Gender.FEMALE.getGender())
                .forEach(System.out::println);


        // Wyjątki

        BufferedWriter file = new BufferedWriter(new FileWriter("zapisanyplik.txt"));
        file.write("Piotr");
        file.newLine();
        file.write("Marta");
        file.newLine();
        file.write("Roman");
        file.close();

        List names = new ArrayList();

        BufferedReader readFile = new BufferedReader(new FileReader("zapisanyplik.txt"));
        String line = readFile.readLine();
        while(line != null) {
                names.add(line);
                line = readFile.readLine();
            }

        try {
            names.stream()
                    .filter(name -> name.equals("Lucjan"))
                    .findFirst()
                    .orElseThrow(NoSuchElementException::new);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        Bug bug = new Bug("description", new BugReporter("Name", "Lastname", "email@email.com"), 3);
        bug.setPriority(-10);
    }
}