import model.User;
import model.computer.Computer;
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

        Computer officeComputer1 = new PC("Office computer1", "HP", 500, 128);
        Computer officeComputer2 = new PC("Office computer2", "HP", 500, 128);
        Computer officeComputer3 = new PC("Office computer3", "HP", 500, 128);
        Computer gamingLaptop = new Laptop("Legion", "Lenovo", 1000, 256, 50);
        Computer laptop = new Laptop("Laptop", "Lenovo", 1000, 256, 50);

        Computer[] computers = {officeComputer1, officeComputer2, officeComputer3, laptop, gamingLaptop};
        for (Computer computer: computers) {
            computer.switchOff();
        }

        System.out.println(officeComputer1.volumeUp(15));
        System.out.println(officeComputer1.volumeDown(10));
        System.out.println(officeComputer1.volumeDown(10));

        System.out.println(gamingLaptop.volumeUp(120));
        System.out.println(gamingLaptop.volumeDown(30));
        System.out.println(gamingLaptop.volumeDown(80));
    }
}