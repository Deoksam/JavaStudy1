package sec02.exam04;

public class Anonymous {
	private int field;
	
	public void method(int arg1, int arg2) {
		int var1 = 0;
		int var2 = 0;
		
		//익명 객체에서 사용하는 매개 변수나 로컬변수는 final 특성이기때문에 값을 변경할수 없음 필드는가능(field)
		//arg1 = 10;
		
		
		Calculatable cal = new Calculatable() {
			
			@Override
			public int sum() {
				int result = field + arg1 + arg2 + var1 + var2;
				return result;
			}
		};
		
		System.out.println(cal.sum());
	}
}
