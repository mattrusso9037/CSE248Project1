package Main;

public class Truck extends Vehicle {

	private final int TRUCK_PRICE_PER_HOUR = 30;

	public Truck(String slotNumber, int hours) {
		super(slotNumber, hours);
	}

	/**
	 * Calculates the price for parking if the vehicle is a truck
	 * @param hours
	 * @param truck
	 * @return price of vehicle
	 */
	@Override
	public int calculate(int hours, Vehicle vehicle) {
		setPrice(hours * TRUCK_PRICE_PER_HOUR);

		if (hours != 1 && hours != 2 && hours != 3) {
			setPrice(getALL_DAY_PRICE());
		}

		return getPrice();

	}


}
