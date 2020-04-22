package homework3;

import java.util.Scanner;

public class MyDateTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter day ");
		int day = input.nextInt();
		System.out.println("Enter month ");
		int month = input.nextInt();
		System.out.println("Enter year ");
		int year = input.nextInt();

		MyDate date = new MyDate(day, month, year, 19, 45, 0, 0);
		System.out.println(String.format("Date added: %d-%d-%d", date.getYears(), date.getMonths(), date.getDays()));

		System.out.println("Enter second day ");
		day = input.nextInt();
		System.out.println("Enter second month ");
		month = input.nextInt();
		System.out.println("Enter second year ");
		year = input.nextInt();
		input.close();

		MyDate date2 = new MyDate(day, month, year, 19, 45, 0, 0);
		System.out.println(String.format("Date added: %d-%d-%d", date2.getYears(), date2.getMonths(), date2.getDays()));

		System.out.println("compareDates(date, date2): ");
		MyDate.compareDates(date, date2);
	}

}
