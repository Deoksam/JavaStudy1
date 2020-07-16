package sec06.exam06;

public class Car {
	private int speed;
	private boolean stop;
	
	//method
	//getter,setter 쓰는이유
	//외부에서 객체에 마음대로 접근할 경우 객체의 무결성이 깨질 수 있음
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		if(speed<0) {
			speed = 0;
			return;
		}else {
			this.speed = speed;
		}
	}
	
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		if(stop) {
			speed = 0;
		}
	}
	
}
