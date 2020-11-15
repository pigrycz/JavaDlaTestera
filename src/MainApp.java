public class MainApp {

    public static void main(String[] args) {

        int liczba1 = 100;
        int liczba2 = 123;
        int liczba3 = 234;
        int liczba4 = 142312;

        boolean suma1 = (liczba1 + liczba2) % 2 == 0;
        boolean suma2 = (liczba3 + liczba4) % 2 == 0;

        if (suma1 && suma2) {
            System.out.println("Wszstkie liczby są parzyste");
        } else {
            System.out.println("Co najmniej jedna z liczb jest nieparzysta");
        }
    }
}