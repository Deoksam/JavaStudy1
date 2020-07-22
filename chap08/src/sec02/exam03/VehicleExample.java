package sec02.exam03;

public class VehicleExample {

	public static void main(String[] args) {

		Vehicle vehicle = new Bus();
		vehicle.run();
		
		//강제 타입 변환하기 그래야 checkfare메소드 사용가능
		Bus bus = (Bus) vehicle;
		
		bus.checkFare();
	}

}
