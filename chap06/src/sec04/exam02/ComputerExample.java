package sec04.exam02;

public class ComputerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer com = new Computer();
		
		//방법1
		int[] values1 = {1,2,3};
		
		int result1 = com.sum1(values1);
		System.out.println(result1);
		
		//방법2
		int result2 = com.sum1(new int[] {1,2,3,4,5});
		System.out.println(result2);
		
		//sum2 사용방법
		int result3 = com.sum2(1,2,3);
		System.out.println(result3);
		
	}

}
