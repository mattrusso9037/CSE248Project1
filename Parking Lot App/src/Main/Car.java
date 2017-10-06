package Main;

public class Car extends Vehicle {

	private final int CAR_PRICE_PER_HOUR = 25;

	public Car(String slotNumber, int hours) {
		super(slotNumber, hours);
	}
/**
 * Calculates the price for parking if the vehicle is a car
 * @param hours
 * @param car
 * @return price of vehicle
 */
	public int calculate(int hours, Car car) {
		setPrice(hours * CAR_PRICE_PER_HOUR);

		if (hours != 1 && hours != 2 && hours != 3) {
			setPrice(getALL_DAY_PRICE());
		}
		return getPrice();

	}

}
