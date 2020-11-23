package model;

public enum BugStatus {
        OPENED("Otwarty"), CLOSED("Zamknięty");
        private final String status;
        BugStatus(String description) {
            this.status = description;
        }
        public String getDescription() {
            return status;
        }
}
