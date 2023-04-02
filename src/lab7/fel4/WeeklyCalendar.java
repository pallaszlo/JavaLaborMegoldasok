package lab7.fel4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class WeeklyCalendar {

    private List<WeeklyEntry> schedule;

    public WeeklyCalendar() {
        this.schedule = new ArrayList<>();
    }

    public void addEntry(String weekday, String notes) {
        this.schedule.add(new WeeklyEntry(weekday, notes));
    }

    public List<WeeklyEntry> getWeeklySchedule() {
        this.schedule.sort(Comparator.comparing(WeeklyEntry::getWeekday));
        return this.schedule;
    }
}
