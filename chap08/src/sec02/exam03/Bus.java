package sec02.exam03;

public class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println("Bus Go");
		
	}
	
	public void checkFare() {
		System.out.println("승차 요금 체크");
	}

}
