package main.java.ClassesMore.Lab3_4;

public class MyTime {
	private int hour;
	private int minute;
	private int second;

	public MyTime() {
	}

	public MyTime(int hour, int minute, int second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public MyTime nextSecond() {
		this.second = (this.second + 1) % 60;
		if (this.second == 0) {
			nextMinute();
		}

		return this;
	}

	public MyTime nextMinute() {
		this.minute = (this.minute + 1) % 60;
		if (this.minute == 0) {
			nextHour();
		}

		return this;
	}

	public MyTime nextHour() {
		this.hour = (this.hour + 1) % 24;

		return this;
	}

	public MyTime previousSecond() {
		this.second = (this.second + 59) % 60;
		if (this.second == 59) {
			previousMinute();
		}

		return this;
	}

	public MyTime previousMinute() {
		this.minute = (this.minute + 59) % 60;
		if (this.minute == 59) {
			previousHour();
		}

		return this;
	}

	public MyTime previousHour() {
		this.hour = (this.hour + 23) % 24;

		return this;
	}

	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}

}
