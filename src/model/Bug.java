package model;

import exceptions.IllegalBugPriorityException;

import java.util.Objects;

public class Bug implements ConsoleNotification, Comparable<Bug> {
    private static final int MIN_PRIORITY = 5;
    private static final int MAX_PRIORITY = 1;
    private String description;
    private BugReporter bugReporter;
    private int priority;
    private BugStatus status;

    public Bug(String description, BugReporter bugReporter, int priority){
        this.description = description;
        this.bugReporter = bugReporter;
        if (priority > MIN_PRIORITY){
            this.priority = MIN_PRIORITY;
            System.out.println("Ustawiony minimalny priorytet równy " + MIN_PRIORITY);
        } else if (priority < MAX_PRIORITY){
            this.priority = MAX_PRIORITY;
            System.out.println("Ustawiony maksymalny priorytet równy " + MAX_PRIORITY);
        } else {
            this.priority = priority;
        }
        this.status = BugStatus.OPENED;
        bugReporter.setBugCount(1);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description.length() < 10) {
            System.out.println("Opis błędu musi zawierać co najmniej 10 znaków");
        } else {
             this.description = description;
        }
    }

    public void setPriority(int priority) throws IllegalBugPriorityException {
        if (priority > MIN_PRIORITY || priority < MAX_PRIORITY) {
            throw new IllegalBugPriorityException("Bug priority needs to be between: " + MAX_PRIORITY + " and " + MIN_PRIORITY);
        } else {
            this.priority = priority;
        }
    }

    public int getPriority(){
        return priority;
    }

    public String getStatus() {
        return status.getDescription();
    }

    public void showData(){
        System.out.println("Opis: " + description + "\nImię i Nazwisko testera: " + bugReporter.getFullName() + "\nEmail osoby zgłaszającej: " + bugReporter.getEmail() + "\nPriorytet: " + priority + "\nStatus błędu: " + this.getStatus());
    }

    public void showReporterEmail(){
        System.out.println("Email osoby zgłaszającej: " + bugReporter.getEmail());
    }

    public void showStatus(){
        System.out.println("Status błędu: " + this.getStatus());
    }

    public void closeBug(){
        status = BugStatus.CLOSED;
        notifyStatusChange();
    }

    public void reopenBug(){
        status = BugStatus.OPENED;
        notifyStatusChange();
    }

    @Override
    public String toString() {
        return "Bug{" +
                "description='" + description + '\'' +
                ", bugReporter=" + bugReporter +
                ", priority=" + priority +
                ", status=" + status.getDescription() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bug bug = (Bug) o;
        return priority == bug.priority &&
                Objects.equals(description, bug.description) &&
                Objects.equals(bugReporter, bug.bugReporter) &&
                status == bug.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, bugReporter, priority, status);
    }

    @Override
    public void notifyStatusChange() {
        System.out.println("Bug status has changed to " + status.getDescription());
    }

    @Override
    public int compareTo(Bug bug) {
        int compareResult = this.getDescription().compareTo(bug.getDescription());
        return compareResult;
    }
}
