package daytwo;

public class Car extends Vehicle{
	private int noOfSeats;
	
	public Car(double speed, double mileage, int noOfSeats) {
		super(speed,mileage);
		this.setNoOfSeats(noOfSeats);
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
}
