package sec01.exam04;

public class Outter {
	
	public void method1(int arg) {
		int localVariable = 1;
		
		// final특성이기때문에 로컬 클래스에서는  수정이 안됨 
		// arg = 100;
		// localVariable = 100;
		class Inner {
			void method() {
				int result = arg + localVariable;
			}
		}
	}
}
