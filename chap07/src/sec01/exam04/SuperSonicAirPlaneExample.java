package sec01.exam04;

public class SuperSonicAirPlaneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperSonicAirPlane sa = new SuperSonicAirPlane();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SuperSonicAirPlane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SuperSonicAirPlane.NOMAL;
		sa.fly();
		sa.land();
	}

}
