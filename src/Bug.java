public class Bug {
    String description;
    String reporterEmail;
    int priority;
    String status;

    Bug(String description, String reporterEmail, int priority){
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

    void showData(){
        System.out.println("Opis: " + description + "\nEmail osoby zgłaszającej: " + reporterEmail + "\nPriorytet: " + priority + "\nStatus błędu: " + this.getStatus());
    }

    void showReporterEmail(){
        System.out.println("Email osoby zgłaszającej: " + reporterEmail);
    }

    String getStatus(){
        return status;
    }

    void showStatus(){
        System.out.println("Status błędu: " + this.getStatus());
    }

    int getPriority(){
        return priority;
    }

    void closeBug(){
        status = "Zamknięty";
    }

    void openBug(){
        status = "Otwarty";
    }
}
