package daytwo;

public class Transport {
	public static void main(String[] args) {
		
		Car car = new Car(180, 26000,4);
		System.out.println("Car speed: "+car.getSpeed()+" KM/H");
		System.out.println("Car mileage: "+car.getMileage()+" KM");
		System.out.println("Car noOfSeats: "+car.getNoOfSeats());
		
		System.out.println();
		
		Bike bike = new Bike(100,3300,true);
		System.out.println("Bike speed: "+bike.getSpeed()+" KM/H");
		System.out.println("Bike mileage: "+bike.getMileage()+" KM");
		System.out.println("Bike baskets: "+bike.isHasBasket());
	}
}
