package sec02.exam02;

public class ChildExample {

	public static void main(String[] args) {
		
		Child child = new Child();
		
		Parent parent = child;
		
		parent.method1();
		//자식클래스인 child에 재정의된 method2()를 호출함 
		parent.method2();
		
		//parent에 method3는 호출할수없음 parent에 없으니까

	}

}
