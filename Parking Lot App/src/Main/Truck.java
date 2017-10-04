package Main;

public class Truck extends Vehicle {
	private final int TRUCK_PRICE_PER_HOUR = 30;
	private final int ALL_DAY_PRICE = 150;
	private int price;
	private int hours;
	
	public Truck() {
		super();
		
	}

	public Truck(String slotNumber, int hours) {
		super(slotNumber, hours);
		
	}

	@Override
	public int calculate(int hours, Vehicle vehicle) {
		this.hours = hours;
		price = hours * TRUCK_PRICE_PER_HOUR;

		if (hours != 1 && hours != 2 && hours != 3) {
			price = ALL_DAY_PRICE;
		}
		return price;

	}

	public String getReturnTime() {
		return getReturnTime(hours);
	}
	
	public void display() {
		super.display();
	}
}