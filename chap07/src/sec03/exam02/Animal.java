package sec03.exam02;

public abstract class Animal {
	
	// 추상메소드
	// - 메소드 선언만 통일하고 실행 내용은 실체 클래스마다 달라야하는 경우 사용
	// - abstract 키워드로 선언되고 중괄호가 없는 메소드
	// - 하위 클래스는 반드시 재정의해서 실행 내용을 채워야함

	
	public String kind; //동물 종류
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	//추상메소드
	public abstract void sound();
}
