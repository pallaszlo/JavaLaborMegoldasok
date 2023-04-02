package lab7.fel3;

public class Alarm {

    private int time;

    public int getTime() {
        return time;
    }


    public void setDay(int day) {
        if (day >= DayConstants.MONDAY && day <= DayConstants.FRIDAY) {
            time = 8;
        } else if (day == DayConstants.SATURDAY || day == DayConstants.SUNDAY) {
            time = 10;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void setDay(Day d) {
        switch (d) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> time = 8;
            case SATURDAY, SUNDAY -> time = 10;
        }
    }
}
