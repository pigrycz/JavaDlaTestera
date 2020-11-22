public class User {
    String firstName;
    String lastName;
    String email;
    int age;
    boolean isAdult;

    User(String firstName, String lastName, String email, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.isAdult = this.isUserAdult();
    }

    void getFullName() {
        System.out.println(firstName + " " + lastName);
    }

    void getAllData(){
        System.out.println(firstName + " " + lastName + " " + email + " " + age + " " + isAdult);
    }

    int getUserAge() {
        return age;
    }

    boolean isUserAdult() {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    void greetings(String name) {
        System.out.println("Hi " + name + "! Nice to see you!");
    }

    void greetings(String firstName, String lastName) {
        System.out.println("Hi " + firstName + " " + lastName + "! Nice to see you!");
    }

    void howOldAreYou(String name, int userAge) {
        System.out.println(name + ", you are " + userAge + " years old.");
    }

    int yourAgePlusTen(int age) {
        return age+10;
    }
}
