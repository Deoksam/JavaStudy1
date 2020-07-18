package sec02.exam01;

public class PromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		//자동 타입 변환 b,c,d,e는 a의 자식클래스
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
		// 상속 관련이없음 
		//B b2 = e;
		//C c2 = d;
	}

}
