package model;

public class Bug {
    private String description;
    private String reporterEmail;
    private int priority;
    private String status;
    private String emailRegex = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"" +
            "(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9]" +
            "(?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9]))\\.){3}(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9])|[a-z0-9-]*[a-z0-9]:" +
            "(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";

    public Bug(String description, String reporterEmail, int priority){
        this.description = description;
        this.reporterEmail = reporterEmail;
        if (priority > 5){
            this.priority = 5;
            System.out.println("Ustawiony minimalny priorytet równy 5");
        } else if (priority < 1){
            this.priority = 1;
            System.out.println("Ustawiony maksymalny priorytet równy 1");
        } else {
            this.priority = priority;
        }
        this.status = "Otwarty";
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

    public String getReporterEmail() {
        return reporterEmail;
    }

    public void setReporterEmail(String reporterEmail) {
        if (reporterEmail.matches(emailRegex)) {
            this.reporterEmail = reporterEmail;
        } else {
            System.out.println("Adres email nie spełnia wymogów");
        }
    }

    public void setPriority(int priority) {
        if (priority > 5 || priority < 0) {
            System.out.println("Priorytet musi być liczbą między 1 a 5");
        } else {
            this.priority = priority;
        }
    }

    public int getPriority(){
        return priority;
    }

    public String getStatus() {
        return status;
    }

    public void showData(){
        System.out.println("Opis: " + description + "\nEmail osoby zgłaszającej: " + reporterEmail + "\nPriorytet: " + priority + "\nStatus błędu: " + this.getStatus());
    }

    public void showReporterEmail(){
        System.out.println("Email osoby zgłaszającej: " + reporterEmail);
    }

    public void showStatus(){
        System.out.println("Status błędu: " + this.getStatus());
    }

    public void closeBug(){
        status = "Zamknięty";
    }

    public void reopenBug(){
        status = "Otwarty";
    }
}
