package sec01.exam06;

public class MyClass {
	//필드의 타입으로 인터페이스 사용
	RemoteControl rc = new Television();
	
	//생성자
	MyClass(){};
	
	MyClass(RemoteControl rc){
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	
	//메소드
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(6);
	}
	
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(6);
	}
}
