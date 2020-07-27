package sec02.exam01;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		
		/*
		 * String str = null; System.out.println(str.length());
		 */
		
		//try-catch
		try {
			Class clazz = Class.forName("java.lang.String2");
			System.out.println("정상실행");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("클래스가 존재하지 않습니다.");
		}

	}

}
