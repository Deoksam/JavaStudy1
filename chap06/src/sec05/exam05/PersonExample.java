package sec05.exam05;

public class PersonExample {

	public static void main(String[] args) {
		
		Person p1 = new Person("123456-123456", "홍길동");
		
		System.out.println(p1.nation);
		System.out.println(p1.name);
		System.out.println(p1.ssn);
		
		// final 필드이기때문에 값을 바꿀수없음
		// p1.nation = "USA";
	}

}
