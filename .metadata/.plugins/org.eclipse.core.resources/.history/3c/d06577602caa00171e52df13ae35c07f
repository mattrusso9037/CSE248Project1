package Main;

import sun.awt.SunHints.Value;

public class Car extends Vehicle {

	private final int CAR_PRICE_PER_HOUR = 25;
	private final int ALL_DAY_PRICE = 150;
	private int price;
	private int hours;
	private String slotNumber;
	private String returningTime;

	

	public Car(String slotNumber, int hours) {
		super(slotNumber, hours);
		
	}



	public int calculate(int hours, Car car) {
		this.hours = hours;
		price = hours * CAR_PRICE_PER_HOUR;

		if (hours != 1 && hours != 2 && hours != 3) {
			price = ALL_DAY_PRICE;
		}
		return price;

	}

	@Override
	public void display() {
		super.display();
		
	}

	public String getReturnTime() {
		return getReturnTime(hours);
	}

}
