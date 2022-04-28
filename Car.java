package lab9;

public class Car extends Vehicle{
	private int numDoors;
	private int numPassengers;
	
	/**
	 * Constructor for a Car object
	 * @param theMake
	 * @param theModel
	 * @param thePlate
	 * @param theDoors
	 * @param thePassengers
	 */
	public Car(String theMake, String theModel, String thePlate, int theDoors, int thePassengers) {
		super(theMake, theModel, thePlate);
		this.numDoors = theDoors;
		this.numPassengers = thePassengers;
	}
	
	/**
	 * Getter method for the number of doors
	 * @return this.numDoors
	 */
	public int getDoors() {
		return this.numDoors;
	}
	
	/**
	 * Getter method for the number of passengers
	 * @return this.numPassengers
	 */
	public int getPassengers() {
		return this.numPassengers;
	}
	
	@Override
	public String toString() {
		String string;
		string = this.numDoors + "-door " + super.getMake() + " " + super.getModel() + " with license " + super.getPlate().toUpperCase() + ".\n";
		return string;
	}
	
	@Override
	public boolean equals(Object other) {
		if(!(other instanceof Car))
			return false;
		Car otherCar = (Car) other;
		if(this.numDoors == otherCar.getDoors() && this.getPassengers() == otherCar.getPassengers()) {
			return super.equals(otherCar);
		}
		return false;
	}
	
	public Car copy() {
		// get instance variables
		String make = super.getMake();
		String model = super.getModel();
		String plate = super.getPlate();
		int doors = this.numDoors;
		int passengers = this.numPassengers;
		Car newCar = new Car(make, model, plate, doors, passengers);
		return newCar;
	}
	
	public static void main(String[] args) {
		Car whip1 = new Car("Lexus", "IS300", "idk", 4, 4);
		Car whip2 = new Car("Nissan", "R32 GT-R", "rmc", 2, 4);
		System.out.print(whip1);
		System.out.print(whip2);
		Car whip3 = whip1.copy();
		System.out.print(whip3);
		System.out.println(whip1.equals(whip3));
		System.out.println(whip1.equals(whip2));
	}
}
