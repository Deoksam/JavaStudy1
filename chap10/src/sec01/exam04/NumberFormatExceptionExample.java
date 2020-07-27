package sec01.exam04;

public class NumberFormatExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String data1 = "100";
		String data2 = "a100";
		
		int val1 = Integer.parseInt(data1);
		System.out.println(val1);
		
		//NumberFormatExceptionExample
		int val2 = Integer.parseInt(data2);
		System.out.println(val2);
	}

}
 