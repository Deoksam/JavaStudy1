package sec02.exam04;

public class DriverExample {

	public static void main(String[] args) {

		Driver driver = new Driver();
		
		driver.dirve(new Bus());
		driver.dirve(new Taxi());
		
		//위에랑 같음
		//Bus bus = new Bus();
		//Taxi taxi = new Taxi();
		//driver.dirve(bus);
		//driver.dirve(taxi);

	}

}
