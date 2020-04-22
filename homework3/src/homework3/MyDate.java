package homework3;

public class MyDate {

	private int days;
	private int months;
	private int years;
	private int hours;
	private int minutes;
	private int seconds;
	private int milliseconds;

	public MyDate() {
		this.days = 23;
		this.months = 2;
		this.years = 2020;
		this.hours = 17;
		this.minutes = 20;
		this.milliseconds = 0;
		this.seconds = 0;
	}

	public MyDate(int days, int months, int years, int hours, int minutes, int seconds, int milliseconds) {
		this.days = days;
		this.months = months;
		this.years = years;
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
		this.milliseconds = milliseconds;
	}

	public int getDays() {
		return days;
	}

	public int getMonths() {
		return months;
	}

	public int getYears() {
		return years;
	}

	public int getHours() {
		return hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public int getSeconds() {
		return seconds;
	}

	public int getMilliseconds() {
		return milliseconds;
	}

	public static void compareDates(MyDate date, MyDate date2) {
		if (date2.years < date.years) {
			System.out.println("ERROR: Invalid interval! Second date is before the first one!");
		} else if (date2.years > date.years) {
			System.out.println("Valid dates!");
		} else if (date2.years == date.years) {
			if (date2.months < date.months) {
				System.out.println("ERROR: Invalid interval! Second date is before the first one!");
			} else if (date2.months > date.months) {
				System.out.println("Valid dates!");
			} else if (date2.months == date.months) {
				if (date2.days <= date.days) {
					System.out.println("ERROR: Invalid interval! Second date is before the first one!");
				} else {
					System.out.println("Valid dates!");
				}
			}
		}

	}

}
