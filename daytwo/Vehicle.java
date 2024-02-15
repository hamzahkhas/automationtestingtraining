package daytwo;

public class Vehicle {
	private double speed;
	private double mileage;
	
	public Vehicle(double speed, double mileage) {
		this.setSpeed(speed);
		this.setMileage(mileage);
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	
}
