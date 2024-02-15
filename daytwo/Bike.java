package daytwo;

public class Bike extends Vehicle{
	
	private boolean hasBasket;
	
	public Bike(double speed, double mileage, boolean hasBasket) {
		super(speed, mileage);
		this.setHasBasket(hasBasket);
	}

	public boolean isHasBasket() {
		return hasBasket;
	}

	public void setHasBasket(boolean hasBasket) {
		this.hasBasket = hasBasket;
	}
	
}
