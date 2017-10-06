package Main;

public class Bike extends Vehicle {
	private final int BIKE_PRICE_PER_HOUR = 20;

	public Bike(String slotNumber, int hours) {
		super(slotNumber, hours);
	}
	/**
	 * Calculates the price for parking if the vehicle is a bike
	 * @param hours
	 * @param bike
	 * @return price of vehicle
	 */
	@Override
	public int calculate(int hours, Vehicle vehicle) {
		
		setPrice(hours * BIKE_PRICE_PER_HOUR);

		if (hours != 1 && hours != 2 && hours != 3) {
			setPrice(getALL_DAY_PRICE());
		}
		return getPrice();

	}

}
