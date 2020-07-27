package sec02.exam04;

public class CatchByExceptionKindExample {

	public static void main(String[] args) {

		String data1 = null;
		String data2 = null;
		
		//다중 catch
		try {
			data1 = args[0];
			data2 = args[1];
	
			int val1 = Integer.parseInt(data1);
			int val2 = Integer.parseInt(data2);
			int result = val1 + val2;
			System.out.println(result);
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("실행 매가값의 수가 부족합니다.");
			
		} catch(Exception e) {
			
			System.out.println("숫자로 변환할 수 없습니다.");
			
		}finally {
			
			System.out.println("다시 실행하세요.");
		}
	}

}
