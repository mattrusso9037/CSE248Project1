package Main;

import java.util.*;

public class Lot {

	private static Lot _lot;
	Map<String, Vehicle> vehiclesMap = new HashMap<String, Vehicle>();
	Vehicle value;

	private Lot() {

	}

	/**
	 * Singleton design, lazy initialization creates new parking lot only once.
	 * 
	 * @return Parking Lot
	 */
	public static Lot createALot() {
		if (_lot == null) {
			_lot = new Lot();
			System.out.println("Lot created.");
		} else {
			System.out.println("There can only be one lot.");
		}
		return _lot;
	}

	public static Lot getLot() {
		return _lot;
	}

	/**
	 * Adds vehicle to parking lot.
	 * 
	 * @param slotNumber
	 * @param vehicle
	 */
	public void insertVehicle(String slotNumber, Vehicle vehicle) {
		vehiclesMap.put(vehicle.getSlotNumber(), vehicle);
		System.out.println("Vehicle added to lot");
		value = vehiclesMap.get(vehicle.getSlotNumber());
		value.display();
	}

	/**
	 * Finds vehicle object based on space number.
	 * @param slotNumber
	 * @return Vehicle object
	 */
	public Vehicle findVehicleById(String slotNumber) {
		value = vehiclesMap.get(slotNumber);
		return value;

	}

	public void displayMapValue() {
		System.out.println(value.getSlotNumber());
	}

}
