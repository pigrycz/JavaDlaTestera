package enums;

public enum WeekDays {
    PONIEDZIALEK("poniedziałek"), WTOREK("wtorek"), SRODA("środa"), CZWARTEK("czwartek"), PIATEK("piątek"), SOBOTA("sobota"), NIEDZIELA("niedziela");

    private String name;

    WeekDays(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
