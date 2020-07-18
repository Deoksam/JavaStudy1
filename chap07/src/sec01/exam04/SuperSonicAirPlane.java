package sec01.exam04;

public class SuperSonicAirPlane extends AirPlane {
	public static final int NOMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NOMAL;
	
	//메소드 재정의
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		}else {
			//부모메소드를 호출 그러기위해선 super 사용
			super.fly();
		}
	}
}
