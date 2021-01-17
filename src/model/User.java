package model;

import enums.Gender;
import exceptions.IllegalEmailFormatException;

import java.util.Objects;

public class User implements Comparable<User> {
    private static int userCounter = 0;

    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private Gender gender;
    private boolean isAdult;

    public static int getUserCounter() {
        return userCounter;
    }

    public User(String firstName, String lastName, String email, int age, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.isAdult = this.isUserAdult();
        userCounter++;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws IllegalEmailFormatException {
        if (email.endsWith(".ru")){
            throw new IllegalEmailFormatException("Mails from Russia are not acceptable");
        } else {
            this.email = email;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public String getGender() {
        return gender.getGender();
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void getFullName() {
        System.out.println(firstName + " " + lastName);
    }

    public void getAllData(){
        System.out.println(firstName + " " + lastName + " " + email + " " + age + " " + isAdult + " " + gender.getGender());
    }

    public int getUserAge() {
        return age;
    }

    public boolean isUserAdult() {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public void greetings(String name) {
        System.out.println("Hi " + name + "! Nice to see you!");
    }

    public void greetings(String firstName, String lastName) {
        System.out.println("Hi " + firstName + " " + lastName + "! Nice to see you!");
    }

    public void howOldAreYou(String name, int userAge) {
        System.out.println(name + ", you are " + userAge + " years old.");
    }

    public int yourAgePlusTen(int age) {
        return age+10;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", gender=" + this.getGender() +
                ", isAdult=" + isAdult +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                isAdult == user.isAdult &&
                Objects.equals(firstName, user.firstName) &&
                Objects.equals(lastName, user.lastName) &&
                Objects.equals(email, user.email) &&
                gender == user.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, age, gender, isAdult);
    }

    @Override
    public int compareTo(User user) {
        int compareResult = this.getFirstName().compareTo(user.getFirstName());
        if (compareResult == 0) {
            compareResult = this.getLastName().compareTo(user.getLastName());
        }
        return compareResult;
    }
}
