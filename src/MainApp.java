import model.User;
import model.computer.Laptop;
import model.computer.PC;
import utils.StringUtils;
import utils.WeekUtils;

public class MainApp {

    public static void main(String[] args) {

//        model.User piotr = new model.User("Piotr", "Testowy", "asd@asd.pl", 13);
//        piotr.getFullName();
//        piotr.getAllData();
//        System.out.println(piotr.getUserAge());
//        System.out.println(piotr.isUserAdult());
//        piotr.greetings(piotr.getFirstName());
//        System.out.println(piotr.yourAgePlusTen(piotr.getAge()));
//        piotr.greetings(piotr.getFirstName(), piotr.getLastName());
//
//        System.out.println("");
//
//        model.User tomek = new model.User("Tomek", "Testowy", "asd2@asd.pl", 25);
//        tomek.getFullName();
//        tomek.getAllData();
//        System.out.println(tomek.getUserAge());
//        System.out.println(tomek.isUserAdult());
//        tomek.howOldAreYou(tomek.getFirstName(), tomek.getAge());
//
//        System.out.println("");
//
//        model.User filip = new model.User("Filip", "Testowy", "mail@mail.com", 25);
//        filip.getAllData();
//
//        System.out.println(User.getUserCounter());
//
//
//        Bug bug = new Bug("Długi opis", "asd@asd.pl", 5);
//        bug.showData();
//        bug.showReporterEmail();
//        bug.showStatus();
//        System.out.println(bug.getPriority());
//
//        Bug bug2 = new Bug("Długi opis", "asd@asd.pl", 100);
//        bug2.closeBug();
//        bug2.showStatus();
//        System.out.println(bug2.getPriority());
//
//        Bug bug3 = new Bug("Bardzo długi opis", "email@email.com", -1);
//        System.out.println(bug3.getPriority());

//        MyOwnSolutions myOwnSolutions = new MyOwnSolutions();
//        myOwnSolutions.exerciseOne();
//        System.out.println("");
//        myOwnSolutions.exerciseTwo();
//        System.out.println("");
//        myOwnSolutions.exerciseThree();
//        System.out.println("");
//        myOwnSolutions.homework();

//        While whileLoop = new While();
//        whileLoop.whileLoop();

//        String string = StringUtils.getFormattedText("Testetestasdasd");
//        System.out.println(string);
//
//        System.out.println(WeekUtils.MONDAY);

        PC officeComputer = new PC("Office computer", "HP", 500, 128);
        Laptop gamingLaptop = new Laptop("Legion", "Lenovo", 1000, 256, 50);


        gamingLaptop.setBatteryLevel(0);
        gamingLaptop.switchOn();

        System.out.println();

        officeComputer.switchOn();
        officeComputer.plugIn();
        officeComputer.switchOn();
    }
}