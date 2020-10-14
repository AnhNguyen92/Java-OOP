package main.java.moreExerciesOnClasses.Lab3_5;

//import java.time.LocalDate;

public class MyDate {
	private int year;
	private int month;
	private int day;

	public String[] MONTHS = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
	public String[] DAYS = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
	public int[] DAYS_INT_MONTHS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public boolean isLeapYear(int year) {
		return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
	}

	public boolean isValidDate() {
		// easy way - using library
//		boolean isValid = true;
//		try {
//			LocalDate date = LocalDate.of(year, month, day);
//		} catch (Exception e) {
//			isValid = false;
//		}
//		
//		return isValid;

		boolean isValid = true;
		if ((day > 31 || day < 1) || (month > 12 || month < 1) || (year > 9999 || year < 1)) {
			// return false; // return immediately if you want;
			isValid = false;
		}
		int maxDayInMonth = getMaxDayInMonth(this.month, this.year);
		if (day > maxDayInMonth) {
			isValid = false;
		}

		return isValid;
	}

	private int getMaxDayInMonth(int month, int year) {
		int maxDayInMonth = DAYS_INT_MONTHS[month - 1];
		if (month == 2 && isLeapYear(year)) {
			maxDayInMonth = 29;
		}
		return maxDayInMonth;
	}

	// algorithm:
	// https://www.ntu.edu.sg/home/ehchua/programming/java/J2a_BasicsExercises.html#dateutil
	public int getDayOfWeek(int year, int month, int day) {
		int[] centuryTabular = { 4, 2, 0, 6 };
		int d1 = centuryTabular[(year / 100) % 4];
		int d2 = year % 100;
		int d3 = d2 / 4;
		int[] monthTabular = { 0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5 };
		int d4 = monthTabular[month];
		if (isLeapYear(year)) {
			if (month == 1) {
				d4 = 6;
			} else if (month == 2) {
				d4 = 2;
			}
		}
		return (d1 + d2 + d3 + d4 + day) % 7;
	}

	public MyDate nextDay() {
		day += 1;
		if (day > getMaxDayInMonth(month, year)) {
			day = 1;
			nextMonth();
		}
		
		return this;
	}

	public MyDate nextMonth() {
		month += 1;
		if (month == 13) {
			month = 1;
			nextYear();
		}
		int maxDayInMonth = getMaxDayInMonth(month, year);
		if (day > maxDayInMonth) {
			day = maxDayInMonth;
		}
		return this;
	}

	public MyDate nextYear() {
		year += 1;
		int maxDayInMonth = getMaxDayInMonth(month, year);
		if (day > maxDayInMonth) {
			day = maxDayInMonth;
		}
		return this;
	}

	public MyDate previousDay() {
		day -= 1;
		if (day == 0) {
			previousMonth();
			day = getMaxDayInMonth(month, year);
		}
		
		return this;
	}

	public MyDate previousMonth() {
		month -= 1;
		if (month == 0) {
			month = 12;
			previousYear();
		}
		int maxDayInMonth = getMaxDayInMonth(month, year);
		if (day > maxDayInMonth) {
			day = maxDayInMonth;
		}
		
		return this;
	}

	public MyDate previousYear() {
		year -= 1;
		int maxDayInMonth = getMaxDayInMonth(month, year);
		if (day > maxDayInMonth) {
			day = maxDayInMonth;
		}
		
		return this;
	}
	
	@Override
	public String toString() {
		return "MyDate [year=" + year + ", month=" + month + ", day=" + day + "]";
	}

}
