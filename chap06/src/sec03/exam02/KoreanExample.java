package sec03.exam02;

public class KoreanExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Korean k1 = new Korean("���ڹ�","123123-123123");
		Korean k2 = new Korean("���ڹ�","321321-321321");
		
		System.out.println(k1.name);
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println("------------------");
		System.out.println(k2.name);
		System.out.println(k2.nation);
		System.out.println(k2.ssn);
		
	}

}
