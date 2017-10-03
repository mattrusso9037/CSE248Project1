package Main;

public class Car extends Vehicle {
//	private final double CAR_PRICE_PER_HOUR = 25.00;
	private PriceBehavior priceBehavior;
	private SlotBehavior slotBehavior;
	
	
	public Car(){
		priceBehavior = new CarPrice();
		slotBehavior = new CarSlotNumber();
	}
	@Override
	public void display() {
		System.out.println("Car costs: "+ priceBehavior + "/hr" + "Car is in slot" + slotBehavior );
		
	}
	



}
