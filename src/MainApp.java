public class MainApp {

    public static void main(String[] args) {

//        User piotr = new User("Piotr", "Testowy", "asd@asd.pl", 13);
//        piotr.getFullName();
//        piotr.getAllData();
//        System.out.println(piotr.getUserAge());
//        System.out.println(piotr.isUserAdult());
//        piotr.greetings(piotr.firstName);
//        System.out.println(piotr.yourAgePlusTen(piotr.age));
//        piotr.greetings(piotr.firstName, piotr.lastName);
//
//        System.out.println("");
//
//        User tomek = new User("Tomek", "Testowy", "asd2@asd.pl", 25);
//        tomek.getFullName();
//        tomek.getAllData();
//        System.out.println(tomek.getUserAge());
//        System.out.println(tomek.isUserAdult());
//        tomek.howOldAreYou(tomek.firstName, tomek.age);
//
//        System.out.println("");
//
//        User filip = new User("Filip", "Testowy", "mail@mail.com", 25);
//        filip. getAllData();


        Bug bug = new Bug("Długi opis", "asd@asd.pl", 5);
        bug.showData();
        bug.showReporterEmail();
        bug.showStatus();
        System.out.println(bug.getPriority());

        Bug bug2 = new Bug("Długi opis", "asd@asd.pl", 100);
        bug2.closeBug();
        bug2.showStatus();
        System.out.println(bug2.getPriority());

        Bug bug3 = new Bug("Bardzo długi opis", "email@email.com", -1);
        System.out.println(bug3.getPriority());
    }
}