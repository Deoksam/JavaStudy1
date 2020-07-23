package sec01.exam02;

public class A {
	class B {}
	static class C {}
	
	B field1 = new B();
	C field2 = new C();
	
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	//a객체가 있어야 만들수있는 b 객체를 a없이 만드려해서 컴파일오류
	// static B field3 = new B();
	static C field4 = new C();
	
	static void method2() {
		//B var1 = new B();
		C var2 = new C();
	}
}
