package lab7.fel3;

public class Demo {

	public static void main(String[] args) {
		
		Alarm a = new Alarm();

		a.setDay(Day.TUESDAY);
		System.out.println(a.getTime());

		a.setDay(Day.SATURDAY);
		System.out.println(a.getTime());

		a.setDay(DayConstants.MONDAY);
		System.out.println(a.getTime());
		
		//a.setDay(2);
		
		System.out.println(Day.FRIDAY.getShortName());
		
		Day[] days = Day.values();
		for(Day d : days) {
			System.out.println(d.getShortName());
		}
	}
}
