package sec03.exam01;

public class SmartPhone extends Phone {
	
	//부모의 생성자에 매개변수가있으면 super작성해야함
	public SmartPhone(String owner) {
		super(owner);
	}
	
	//메소드
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
	
}
