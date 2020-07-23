package sec01.exam01;

public class Main {

	public static void main(String[] args) {
		//인스턴스 멤버 클래스 사용법
		A a = new A();
		
		A.B b = a.new B();
		
		b.field1 = 3;
		b.method1();
		
		//정적 멤버 클래스 사용법
		A.C c = new A.C();
		c.field1 = 4;
		c.method1();
		c.field2 = 5;
		c.method2();
		
		a.method2();
	}

}
