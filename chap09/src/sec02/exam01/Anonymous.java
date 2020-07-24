package sec02.exam01;

public class Anonymous {
	//익명자식객체생성
	//익명 자식 객체 - 상속과 관련 / 자식 클래스가 재사용되지않고 오로지 특정 위치에서 사용되는 경우 편리함

	Person field = new Person() {
		void work() {
			System.out.println("출근 합니다.");
		}
		//재정의
		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		};
	};
	
	void method1() {
		//익명 자식객체 생성
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책합니다.");
			}
			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}
		};
		
		localVar.wake();
		
	}
	void method2(Person person) {
		person.wake();
	}
}
