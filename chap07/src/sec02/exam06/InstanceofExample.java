package sec02.exam06;

public class InstanceofExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// instanceof연산자
		// - 어떤 객체가 어느 클래스의 인스턴스인지 확인
		// - 메소드 내 강제 타입 변환 필요한 경우
		//boolean result = 좌항(객체) instanceof 우항(타입)

		Parent parent1 = new Child();
		method1(parent1);
		
		Parent parent2 = new Parent();
		method1(parent2);
	}
	
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child)parent;
			System.out.println("method1 - Child 변환 성공");
		} else {
			System.out.println("method1 - Child 변환 실패");
		}
	}

}
