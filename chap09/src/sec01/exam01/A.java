package sec01.exam01;

public class A {
	
	A(){
		System.out.println("A 객체가 생성됨");
	}
	
	//인스턴스 멤버 클래스 클래스앞에 static가없음
	class B {
		B(){
			System.out.println("B 객체가 생성됨");
		}
		int field1;
		// static을 사용할수없음 A객체가 있어야 B를 사용할수있음
		// static int field2;
		void method1() {}
		
	}
	
	static class C {
		C(){
			System.out.println("C 객체가 생성됨");
		}
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
	
	//로컬클래스 실습
	void method2() {
		class D {
			D(){
				System.out.println("D 객체가 생섬됨");
			}
			int field1;
			// static int field2; 정적필드x
			void method1() {}
			// void method2() {} 정적메소드x
		}
		
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
