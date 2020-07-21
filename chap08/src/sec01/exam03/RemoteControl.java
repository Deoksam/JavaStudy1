package sec01.exam03;
// 인터페이스
// - 객체의 사용 방법을 정의한 타입
// - 인터페이스를 통해 다양한 객체를 동일한 사용 방법으로 이용할 수 있다.
// - 인터페이스를 이용해서 다형성을 구현할 수 있다.
// - 개발 코드는 인터페이스를 통해서 객체와 서로 통신한다.
// - 인터페이스의 메소드를 호출하면 객체의 메소드가 호출된다.
// - 개발 코드를 수정하지 않으면서 객체 교환이 가능하다.
// 인터페이스 구성요소 - 상수(변하지않는값), 추상 메소드
public interface RemoteControl {
	//상수
	public static final int MAX_VOLUME = 10; //public static final 생략가능
	public static final int MIN_VOLUME = 0;
	
	//메소드
	//추상메소드
	void turnOn(); //public static final 생략가능
	void turnOff();
	void setVolume(int volume);
}
