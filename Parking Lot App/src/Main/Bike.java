package Main;

public class Bike extends Vehicle {
	private final int BIKE_PRICE_PER_HOUR = 20;
	private final int ALL_DAY_PRICE = 150;
	private int price;
	private int hours;
	
	@Override
	public void display() {
		super.display();
	}


	public String getReturnTime() {
		return getReturnTime(hours);
	}

	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bike(String slotNumber, int hours) {
		super(slotNumber, hours);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calculate(int hours, Vehicle vehicle) {
		this.hours = hours;
		price = hours * BIKE_PRICE_PER_HOUR;

		if (hours != 1 && hours != 2 && hours != 3) {
			price = ALL_DAY_PRICE;
		}
		return price;

	}

}