package sec03.exam01;

public abstract class Phone {
	// 추상클래스 - 여러 클래스의 공통된 특성(필드,메소드)를 추출해서 선언한 것을 추상클래스라고 한다.
	// - 실체 클래스(객체 생성용 클래스)들의 공통적인 특성(필드,메소드)을 추출하여 선언한것
	// - 추상클래스와 실체 클래스는 부모, 자식 클래스로서 상속 관계를 가짐
	// - abstract <-- 추상클래스는 나타내는 키워드

	//필드
	public String owner;
	
	//생성자
	public Phone(String owner) {
		this.owner = owner;
	}
	
	//메소드
	public void turnOn() {
		System.out.println("폰 전원 On");
	}
	
	public void turnOff() {
		System.out.println("폰 전원 Off");
	}
}
