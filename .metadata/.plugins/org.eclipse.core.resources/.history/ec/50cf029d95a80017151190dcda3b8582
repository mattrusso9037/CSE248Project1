package Main;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Vehicle {
	private long hours;
	private VehicleBehavior vehicleBehavior;
	private PriceBehavior priceBehavior;
	private SlotBehavior slotBehavior;
	private LocalDateTime now = LocalDateTime.now();
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM-dd-yyyy hh:mm a");
	private String format = now.format(formatter);

	public void setVehicleBehavior(VehicleBehavior vehicleBehavior) {
		this.vehicleBehavior = vehicleBehavior;
	}

	public void setPriceBehavior(PriceBehavior priceBehavior) {
		this.priceBehavior = priceBehavior;
	}

	public void setSlotBehavior(SlotBehavior slotBehavior) {
		this.slotBehavior = slotBehavior;
	}

	public void display() {

	}

	public String getNow() {
		return format;

	}

	public String getReturnTime(long hours) {
		this.hours = hours;
		String formatReturn = now.plusHours(hours).format(formatter);
		return formatReturn;
	}

}
