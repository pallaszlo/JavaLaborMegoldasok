package lab7.fel4;

public enum Weekday {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;


    @Override
    public String toString() {
        return super.name().substring(0, 1) + super.name().substring(1).toLowerCase();
    }

}
