package sec01.exam05;

public class Outter {
	String field = "Outter";
	
	void method() {
		System.out.println("Outter - method");
	}
	
	class Nested {
		String field = "Nested";
		
		void method() {
			System.out.println("Nested - method");
		}
		
		void print() {
			System.out.println(this.field);
			this.method();
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
	}
}
