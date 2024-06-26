package task1;

public class testInterface {
	public static void main(String[] args) {
	Car car = new Car();
	Bike bike = new Bike();
	
	car.drive();
	car.stop();
	System.out.println("---");
	bike.drive();
	bike.stop();
	}
}
